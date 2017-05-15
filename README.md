Cucumber Selenium feature file

TODO - Complete ReadMe

To run the tests within this project, run the file [RunCukesTest.java]()

Add the following to VM Options (Run -> Edit Configurations):
* A browser must be declared in configuration using -Dbrowser="your-browser"  See [Browser.java]() for info (currently options limited to chrome or firefox. NB outstanding issue with firefox driver prevents sendKeys function from working. Use chrome until issue resolved.)
* An environment must be declared in configuration using -Denvironment="your-environment", which will depend whether you require to run tests locally or in a test environment. See [Environment.java]() for info.

If running the tests locally, the system jar must also be started locally. Run java -jar sft-crm/target/sft-crm.jar server cfg/crm-application.yml from the sft-configuration directory.
