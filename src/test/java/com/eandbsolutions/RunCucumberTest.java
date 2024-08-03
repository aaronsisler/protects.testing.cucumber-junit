package com.eandbsolutions;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
//@IncludeEngines("cucumber")
@SelectPackages("com.eandbsolutions")
// import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
//@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.eandbsolutions")
public class RunCucumberTest {
}
