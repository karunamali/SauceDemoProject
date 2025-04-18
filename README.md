# SauceDemo Automation Testing Project

This is a Selenium WebDriver automation project using Java, TestNG, and ExtentReports. The project automates test scenarios for the [SauceDemo](https://www.saucedemo.com/v1/) application, including positive and negative login test cases with data-driven testing from Excel.

## Features

- Automated browser testing using Selenium WebDriver  
- Data-driven login test using Excel  
- ExtentReports integration for detailed test reports  
- Screenshot capture for failed test cases  
- Modular code with BaseTest and reusable utilities  

---

## Technologies Used

- Java  
- Selenium WebDriver  
- TestNG  
- Apache POI (for reading Excel)  
- ExtentReports  
- Maven  

---

## Project Structure

```
saucedemo-automation/
│
├── base/                   # Base setup and teardown classes  
├── tests/                  # Test cases  
├── utils/                  # Utility files (ExcelUtil, Screenshot, ExtentManager)  
├── testng.xml              # TestNG suite file  
├── pom.xml                 # Maven project configuration  
├── README.md               # Project documentation  
└── LoginData.xlsx          # Test data for login  
```

---

## How to Run

1. **Clone the Repository**  
   ```
   git clone https://github.com/yourusername/saucedemo-automation.git  
   cd saucedemo-automation  
   ```

2. **Install Dependencies**  
   Make sure Maven is installed. Then run:  
   ```
   mvn clean install  
   ```

3. **Run the Tests**  
   ```
   mvn test  
   ```

4. **View Test Report**  
   After execution, open the generated report:  
   ```
   test-output/ExtentReports/ExtentReport.html  
   ```

---

## Test Scenarios

| Test Case               | Description                                      | Status    |
|------------------------|--------------------------------------------------|-----------|
| Valid Login            | Login with standard_user                         | Positive  |
| Locked User Login      | Login with locked_out_user                       | Negative  |
| Invalid Username       | Login with incorrect username                    | Negative  |
| Invalid Password       | Login with incorrect password                    | Negative  |

---

## Test Data

Test data is stored in `LoginData.xlsx` file under `src/test/resources/`.

---

## Environment Setup

- **Java 8+**  
- **Maven**  
- **Chrome Browser**  
- **Chromedriver** (Path is set in `BaseTest.java`)  

---

## Author

**Karuna Mali**  
[LinkedIn Profile](https://www.linkedin.com/in/karuna-mali-301771285)
[Portfolio](https://karunaportfolio.netlify.app)

---

## License

This project is for learning and demonstration purposes only.