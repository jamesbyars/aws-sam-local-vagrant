# Configure npmnpm config get prefix
mkdir ~/.npm-global
npm config set prefix '~/.npm-global'
export PATH=~/.npm-global/bin:$PATH
source ~/.profile

NPM_CONFIG_PREFIX=~/.npm-global

npm install -g jshint

# install
npm install -g aws-sam-local@0.2.2

echo "export PATH=~/.npm-global/bin:$PATH" >> ~/.profile
