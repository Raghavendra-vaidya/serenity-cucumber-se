# Web Automation with Serenity BDD 🚀

[![Java](https://img.shields.io/badge/Java-21-orange)](https://openjdk.java.net/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-blue)](https://maven.apache.org/)
[![Serenity BDD](https://img.shields.io/badge/Serenity_BDD-4.3.4-green)](https://serenity-bdd.github.io/)
[![Cucumber](https://img.shields.io/badge/Cucumber-7.33.0-brightgreen)](https://cucumber.io/)
[![JUnit](https://img.shields.io/badge/JUnit-5.14.3-red)](https://junit.org/junit5/)

This project demonstrates web automation testing using Serenity BDD, Cucumber, and Selenium WebDriver.

## ✨ Features

- **Behavior-Driven Development (BDD)**: Uses Cucumber for writing executable specifications in Gherkin syntax
- **Automated Web Testing**: Selenium WebDriver for browser automation
- **Rich Reporting**: Serenity BDD generates comprehensive test reports with screenshots and step details
- **Cross-Browser Support**: Configured for Chrome browser with customizable options
- **Parallel Execution**: Supports running tests in parallel for faster execution

## 📋 Prerequisites

- **Java**: JDK 21 or higher
- **Maven**: 3.6.0 or higher
- **Chrome Browser**: Latest version installed
- **ChromeDriver**: Automatically managed by WebDriverManager (included in Serenity)

## 🏗️ Project Structure

```
src/
├── main/java/org/rv/
│   ├── helpers/
│   │   ├── DashboardHelper.java
│   │   └── LoginHelper.java
│   ├── pom/
│   │   ├── DashboardPage.java
│   │   └── LoginPage.java
│   └── projectutils/
│       └── ConfReader.java
├── test/
    ├── java/org/rv/
    │   ├── runner/
    │   │   └── TestRunnerSuite.java
    │   └── steps/
    │       ├── DashboardStepDefinitions.java
    │       └── LoginStepDefinitions.java
    └── resources/
        ├── features/
        │   └── Login.feature
        ├── serenity.conf
        ├── cucumber.properties
        └── junit-platform.properties
```

## 🚀 Setup

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd serenity-cucumber-se
   ```

2. **Install dependencies**:
   ```bash
   mvn clean install -DskipTests
   ```

## ⚙️ Configuration

### Serenity Configuration (`src/test/resources/serenity.conf`)

Key settings:
- **Browser**: Chrome (default)
- **Base URL**: Application demo site
- **Screenshots**: Full page screenshots enabled
- **Browser Restart**: Restarts browser for each scenario

### Test Data

The tests are configured to run against the demo application at:
`https://opensource-demo.orangehrmlive.com/web/index.php/auth/login`

## 🧪 Running Tests

### Run All Tests
```bash
mvn clean verify
```

### Run Specific Feature
```bash
mvn clean verify -Dcucumber.filter.tags="@Login"
```

### Run with Custom Tags
```bash
mvn clean verify -Dtags="@smoke"
```

### Generate Reports Only
```bash
mvn serenity:aggregate
```

## 📖 Test Scenarios

The project includes comprehensive login testing scenarios:

1. **Page Load Verification**: Ensures login page loads correctly
2. **Field Validation**: Tests required field validation
3. **Invalid Credentials**: Tests various invalid login combinations
4. **Valid Login**: Verifies successful authentication and dashboard access

## 📊 Reports

Serenity generates detailed HTML reports in the `target/site/serenity/` directory after test execution.

### Report Contents
- **Test Results**: Pass/fail status for each scenario
- **Step Details**: Detailed execution steps with timestamps
- **Screenshots**: Automatic screenshots on failures and key steps
- **Performance Metrics**: Test execution times
- **Environment Details**: Browser, OS, and test configuration

### Viewing Reports
1. Run the tests: `mvn clean verify`
2. Open `target/site/serenity/index.html` in a web browser

## 📚 Dependencies

- **Serenity BDD**: 4.3.4
- **Cucumber**: 7.33.0
- **JUnit 5**: 5.14.3
- **Selenium WebDriver**: Managed by Serenity
- **AssertJ**: 3.27.7

## 🌐 Browser Configuration

The project is configured to use Chrome with the following options:
- Browser maximized
- Infobars disabled
- Popup blocking disabled
- Automation indicators hidden

### Debug Mode
Run tests with verbose output:
```bash
mvn clean verify -Dserenity.logging=VERBOSE
```


---
