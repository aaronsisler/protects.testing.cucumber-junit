# projects.testing.cucumber-junit

## Things We Have Learned

* Resources not being in a "package" format with current RunCucumberTest made things fail i.e. couldn't find
  tests/features
    * ```java
        @Suite
        @IncludeEngines("cucumber")
        @SelectPackages("com.eandbsolutions")
        @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
        @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.eandbsolutions")
        public class RunCucumberTest{}
    ```