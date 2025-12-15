Amazon Product Advertising API 5.0 Java SDK (unofficial)
===============
![GitHub](https://img.shields.io/github/license/osslabz/paapi5-java-sdk)
![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/osslabz/paapi5-java-sdk/build-on-push.yml?branch=dev&label=build&logo=git)
![GitHub Workflow Status](https://img.shields.io/github/actions/workflow/status/osslabz/paapi5-java-sdk/build-release-on-main-push.yml?branch=main&label=perform-release&logo=semanticrelease)
[![Maven Central](https://img.shields.io/maven-central/v/net.osslabz/paapi5-java-sdk?label=Maven%20Central)](https://search.maven.org/artifact/net.osslabz/paapi5-java-sdk)

An unofficial repackaged version of Amazon's Product Advertising API 5.0 Java SDK. Since the original SDK is only available as a binary distribution and not published on Maven Central it is not easy to use in a Maven/Gradle project. See https://webservices.amazon.com/paapi5/documentation/with-sdk.html for the binary download.


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

No modifications are made to the original classes, they are simply extracted and repackaged. 

For now it also keeps the original dependency version (although they are severely outdated) because it's impossible to properly test such dependency upgrades.
