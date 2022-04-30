## Jasypt - a simple way to encrypt your passwords

Add dependency and plugin to pom.xml

    <dependency> 
        <groupId>com.github.ulisesbocchio</groupId>
        <artifactId>jasypt-spring-boot-starter</artifactId>
        <version>3.0.3</version>
    </dependency>

    <plugin>
        <groupId>com.github.ulisesbocchio</groupId>
        <artifactId>jasypt-maven-plugin</artifactId>
        <version>3.0.3</version>
    </plugin>

Wrap sensitive properties in DEC()

    my.encoded.property:DEC(place the text to be encrypted here)

Run maven command

    mvn jasypt:encrypt -Djasypt.encryptor.password=mySecretP@ssworD"

Your sensitive data should be encrypted and wrapped in ENC()

    my.encoded.property:ENC(updated, cipher text)

To run app set VM option

    -Djasypt.encryptor.password=mySecretP@ssword

or set environmental variable in your system for example MY_ENVIRONMENTAL_VARIABLE=mySecretP@ssworD and get it later in properties on startup

    jasypt.encryptor.password=${MY_ENVIRONMENTAL_VARIABLE}