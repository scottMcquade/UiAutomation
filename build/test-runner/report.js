$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("compareProductsTest.feature");
formatter.feature({
  "line": 1,
  "name": "Validate products comparison workflow",
  "description": "",
  "id": "validate-products-comparison-workflow",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4440287420,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Compare products flow",
  "description": "",
  "id": "validate-products-comparison-workflow;compare-products-flow",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on the Compare Products page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I select Orange and Cherry products to compare",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the price comparison is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Chrry and Orange condition is dsplayed",
  "keyword": "And "
});
formatter.match({
  "location": "CompareProductsSteps.i_am_on_the_Compare_Products_page()"
});
formatter.result({
  "duration": 12979654553,
  "error_message": "java.lang.AssertionError: Could not load products page\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat com.karsun.duke.pages.ComparePricePage.load(ComparePricePage.java:28)\r\n\tat com.karsun.kic.tan.duke.Page.get(Page.java:13)\r\n\tat com.karsun.duke.steps.CompareProductsSteps.initcomparePricePage(CompareProductsSteps.java:23)\r\n\tat com.karsun.duke.steps.CompareProductsSteps.i_am_on_the_Compare_Products_page(CompareProductsSteps.java:28)\r\n\tat ✽.Given I am on the Compare Products page(compareProductsTest.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CompareProductsSteps.i_select_Orange_and_Cherry_products_to_compare()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompareProductsSteps.the_price_comparison_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CompareProductsSteps.chrry_and_Orange_condition_is_dsplayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1102290655,
  "status": "passed"
});
});