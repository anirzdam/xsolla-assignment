## Xsolla test assignment

### CICD execution
CI flow is configured under Github Actions. The CI trigger is set to code push

### Steps to execute
1. Download and import to workspace
2. run `mvn clean test`
3. verify test results in surefire-reports\index.html. Screenshot can be found in sample\report_screenshot.PNG

_Note: The test is using Chrome webdriver only. Selenium grid to be used to manage various browsers with it's DesiredCapabilities_

### Environment setup
1. We can run using Selenium grid on different browsers/machines (nodes)
2. We can use Docker image with the configured Selenium grid
