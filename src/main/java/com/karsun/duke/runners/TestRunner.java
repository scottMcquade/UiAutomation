package com.karsun.duke.runners;

import org.junit.runner.RunWith;
import com.karsun.kic.tan.duke.cukes.MergedDataInjectedCucumber;

import com.karsun.kic.tan.duke.annotations.TestDataFiles;

import cucumber.api.CucumberOptions;

@RunWith(MergedDataInjectedCucumber.class)
@CucumberOptions(
		plugin = { "json:build/test-runner.json", "html:build/test-runner" },
		tags = { "~@wip" },
		features = {"src/test/resources/features/"},
		glue = { "com.karsun.kic.tan", "org.openqa", "com.karsun.duke" },
		dryRun = false)
@TestDataFiles(files = { "src/test/resources/data/data.json" })
public class TestRunner {
}