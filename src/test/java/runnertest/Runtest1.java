package runnertest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Features/Sample.feature", glue= {"Stepdefinitions"},plugin= {"html:target/cucumber_reports/cucumber-html-report.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runtest1 extends AbstractTestNGCucumberTests{

}

































