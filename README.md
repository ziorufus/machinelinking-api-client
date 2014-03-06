machinelinking-api-client
=========================

This repo provides the official Java client for the [MachineLinking](http://machinelinking.com/) API.

# Include with Maven

1 - Include a custom repository (hosted by GitHub).

```xml
<repository>
    <id>machinelinking-api-client-mvn-repo</id>
        <url>https://raw.github.com/michelemostarda/machinelinking-api-client/mvn-repo/</url>
        <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
         </snapshots>
 </repository>
```

2 - Add the client dependency

```xml
<dependency>
    <groupId>com.machinelinking</groupId>
    <artifactId>api-client</artifactId>
    <version>1.3</version>
</dependency>
```

# Build from source

This repo contains a standard [Maven 3](http://maven.apache.org/) module, just execute: 

```bash
git clone https://github.com/michelemostarda/machinelinking-api-client.git
cd machinelinking-api-client
mvn package
 ```
