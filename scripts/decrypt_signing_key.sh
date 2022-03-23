#!/bin/bash
set -euo pipefail
IFS=$'\n\t'

function cleanup {
    echo "🧹 Cleanup..."
    rm -f $HOME/secrets/methodic-keys.gpg-key
}

trap 'cleanup' ERR

# Decrypt the file
mkdir -p $HOME/secrets
# --batch to prevent interactive command
# --yes to assume "yes" for questions
gpg --quiet --batch --yes --passphrase="$SIGNING_KEY_PASSPHRASE" --output $HOME/secrets/methodic-keys.gpg-key --decrypt methodic-keys.gpg-key.gpg
gpg --fast-import --no-tty --batch --yes $HOME/secrets/methodic-keys.gpg-key