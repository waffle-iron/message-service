[![Stories in Ready](https://badge.waffle.io/ExtremeEnvironment/message-service.png?label=ready&title=Ready)](https://waffle.io/ExtremeEnvironment/message-service)
[![Build Status](https://travis-ci.org/ExtremeEnvironment/message-service.svg?branch=master)](https://travis-ci.org/ExtremeEnvironment/message-service)

# MessageService

This application was generated using JHipster, you can find documentation and help at [https://jhipster.github.io](https://jhipster.github.io).

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:


## Building for production

To optimize the MessageService client for production, run:

    ./gradlew -Pprod clean bootRepackage

To ensure everything worked, run:

    java -jar build/libs/*.war --spring.profiles.active=prod

## Continuous Integration

To setup this project in Jenkins, use the following configuration:

* Project name: `MessageService`
* Source Code Management
    * Git Repository: `git@github.com:xxxx/MessageService.git`
    * Branches to build: `*/master`
    * Additional Behaviours: `Wipe out repository & force clone`
* Build Triggers
    * Poll SCM / Schedule: `H/5 * * * *`
* Build
    * Invoke Gradle script / Use Gradle Wrapper / Tasks: `-Pprod clean test bootRepackage`
* Post-build Actions
    * Publish JUnit test result report / Test Report XMLs: `build/test-results/*.xml`

[JHipster]: https://jhipster.github.io/
