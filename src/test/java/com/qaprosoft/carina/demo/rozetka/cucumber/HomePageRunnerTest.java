package com.qaprosoft.carina.demo.rozetka.cucumber;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@HomePage", features = {"src/test/resources/features/rozetka/HomePage.feature"},
        plugin = {"pretty", "json:target/cucumber_reports/home_page.json"})
public class HomePageRunnerTest extends AbstractTestNGCucumberTests {

}
