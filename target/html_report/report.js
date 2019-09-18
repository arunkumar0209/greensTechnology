$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Smoke Test Facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and launch the URL",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter valid \"\u003cUsername\u003e\" and valid \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User should be able to login Successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "arun@gmail.com",
        "pass789"
      ]
    },
    {
      "cells": [
        "arun123@gmail.com",
        "pass123"
      ]
    },
    {
      "cells": [
        "arun456@gmail.com",
        "pass456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"arun@gmail.com\" and valid \"pass789\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.i_enter_valid_UserName_and_valid_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.User_should_be_able_to_login_Successfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cLog[in123456789]\u003e but was:\u003cLog[ into Facebook | Facebook]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.stepdefinitions.TestCase.User_should_be_able_to_login_Successfully(TestCase.java:41)\r\n\tat ✽.User should be able to login Successfully(src/test/resources/features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Test with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"arun123@gmail.com\" and valid \"pass123\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.i_enter_valid_UserName_and_valid_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.User_should_be_able_to_login_Successfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cLog[in123456789]\u003e but was:\u003cLog[ into Facebook | Facebook]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.stepdefinitions.TestCase.User_should_be_able_to_login_Successfully(TestCase.java:41)\r\n\tat ✽.User should be able to login Successfully(src/test/resources/features/Login.feature:11)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Test with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Open browser and launch the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCase.open_browser_and_launch_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter valid \"arun456@gmail.com\" and valid \"pass456\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCase.i_enter_valid_UserName_and_valid_Password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCase.User_should_be_able_to_login_Successfully()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cLog[in123456789]\u003e but was:\u003cLog[ into Facebook | Facebook]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.stepdefinitions.TestCase.User_should_be_able_to_login_Successfully(TestCase.java:41)\r\n\tat ✽.User should be able to login Successfully(src/test/resources/features/Login.feature:11)\r\n",
  "status": "failed"
});
});