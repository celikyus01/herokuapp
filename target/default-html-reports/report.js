$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TC3_KeyPresses.feature");
formatter.feature({
  "name": "Infinite Scroll",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Scenario-1: Infinite Scroll",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is in main page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.task.step_definitions.FormAuthStepDefs.the_user_is_in_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Key Presses\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.task.step_definitions.FormAuthStepDefs.theUserNavigatesToPage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sends below keys and verify them",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.task.step_definitions.KeyPressesStepDefs.the_user_sends_below_keys_and_verify_them(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});