Amazon Product Advertising API 5.0 Java SDK (unofficial)
===============
![GitHub](https://img.shields.io/github/license/osslabz/paapi5-java-sdk)
![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/osslabz/paapi5-java-sdk/build-on-push.yml?branch=dev&label=build&logo=git)
![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/osslabz/paapi5-java-sdk/release.yml?branch=dev&label=perform-release&logo=semanticrelease)
[![Reproducible Builds](https://img.shields.io/endpoint?url=https://raw.githubusercontent.com/jvm-repo-rebuild/reproducible-central/master/content/net/osslabz/paapi5-java-sdk/badge.json)](https://github.com/jvm-repo-rebuild/reproducible-central/blob/master/content/net/osslabz/paapi5-java-sdk/README.md)
[![Maven Central](https://img.shields.io/maven-central/v/net.osslabz/paapi5-java-sdk?label=Maven%20Central)](https://search.maven.org/artifact/net.osslabz/paapi5-java-sdk)

An unofficial repackaged version of Amazon's Product Advertising API 5.0 Java SDK. Since the original SDK is only available as a binary distribution and not published on Maven Central it is not easy to use in a Maven/Gradle project. See https://webservices.amazon.com/paapi5/documentation/with-sdk.html for the binary download.

This jar carries Amazon's SDK 1.2.4 classes byte for byte and adds no code of its own, so it has no tests. Version 1.2.5 reached Maven Central on 2025-12-15 with that same content, and two other projects of mine build against it.


This project make the original SDK available on Maven Central with the following coordinates:

Maven
------

```xml

<dependency>
    <groupId>net.osslabz</groupId>
    <artifactId>paapi5-java-sdk</artifactId>
    <version>1.2.5</version>
</dependency>
```

Snapshots
---------

Every push to `dev` publishes the next version as a `-SNAPSHOT` to Central's snapshot repository. Maven doesn't
search that repository by default, so a build that wants a snapshot declares it:

```xml
<repositories>
    <repository>
        <id>central-snapshots</id>
        <url>https://central.sonatype.com/repository/maven-snapshots/</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```

No modifications are made to the original classes, they are simply extracted and repackaged. 

For now it also keeps the original dependency version (although they are severely outdated) because it's impossible to properly test such dependency upgrades.
