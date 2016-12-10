#Java Dev-Env Config Guidance
##JDK-Config

- download oracle-jdk7

```zsh
wget --no-cookies --no-check-certificate --header "Cookie: gpw_e24=http%3A%2F%2Fwww.oracle.com%2F; oraclelicense=accept-securebackup-cookie" "http://download.oracle.com/otn-pub/java/jdk/7u79-b15/jdk-7u79-linux-x64.rpm"
```

- install with package manager

- add alternatives, like this, add java and javac to alternatives to manage

```zsh
sudo alternatives --install /usr/bin/java java /usr/java/jdk1.7.0_79/bin/java 400
sudo alternatives --install /usr/bin/javac javac /usr/java/jdk1.7.0_79/bin/javac 400
```

- config alternatives

```zsh
sudo alternatives --config java
```

```zsh
sudo alternatives --config javac
```

##Java Decompiler
- install java decompiler, [jd-gui link](http://jd.benow.ca/)
