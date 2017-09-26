# AWS SAM Local With Java - Vagrant 

Running AWS SAM Local in Vagrant with Java example.

## Local Development Environment Using Vagrant

Provision the machine

```bash
vagrant up
```

Get shell in VM

```bash
vagrant ssh
```



```bash
cd /vagrant
```

### Invocation

Make sure you're in the /vagrant directory

Invoke HelloWorldFunction with data (see template.yml)

```bash
echo '{"message": "Hey, are you there?" }' | sam local invoke "HelloWorldFunction"
```
