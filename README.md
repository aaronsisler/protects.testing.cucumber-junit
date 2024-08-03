# projects.testing.cucumber-junit

## Things We Have Learned

* Resources not being in a "package" format with current RunCucumberTest made things fail i.e. couldn't find
  tests/features
    * ```java
      // Required: No tests found without this
      @Suite
      // Optional: Removing didn't see to affect finding/running tests
      @IncludeEngines("cucumber")
      // Required: Without this Suite is trying to run but doesn't know how to link anything.
      @SelectPackages("com.eandbsolutions")
      // Optional: Different plugin styles for how execution is shown
      // https://javadoc.io/doc/io.cucumber/cucumber-junit-platform-engine/7.2.0/io/cucumber/junit/platform/engine/Constants.html#PLUGIN_PROPERTY_NAME
      // Without this, console just says Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
      @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
      // Optional: After reading the docs I still don't get what this is doing.
      // https://javadoc.io/doc/io.cucumber/cucumber-junit-platform-engine/7.2.0/io/cucumber/junit/platform/engine/Constants.html#GLUE_PROPERTY_NAME 
      @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.eandbsolutions")
      public class RunCucumberTest{}
    ```