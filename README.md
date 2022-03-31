## Xsolla test assignment

### Pre-requisites
1. Java JDK
2. Maven installation
3. Browser version compatible with webdriver used
4. Eclipse (or any preferred IDE, if .Net preferably VSCode)

### CICD execution
CI flow is configured under Github Actions

### Steps to execute
1. Download and import to workspace
2. run `maven clean test`
3. verify test results in surefire-reports\index.html

###Environment setup
1. We can run using Selenium grid on different browsers/machines (nodes)
2. We can use Docker image with the configurd Selenium grid
