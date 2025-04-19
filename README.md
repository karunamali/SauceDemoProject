# SauceDemo Automation Testing Project

This is a Selenium WebDriver automation project using Java, TestNG, and ExtentReports. The project automates key test scenarios for the [SauceDemo](https://www.saucedemo.com/v1/) application, including login, cart, checkout, and product filtering functionalities.

## ✅ Features

- Automated browser testing using Selenium WebDriver  
- Data-driven login testing using Excel  
- ExtentReports integration for detailed test reporting  
- Screenshot capture for failed test cases  
- Modular code structure with reusable utilities  
- Functional tests: login, add to cart, checkout, and product filters


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

## ✅ Test Scenarios

| Test Case                    | Description                                          | Type       |
|-----------------------------|------------------------------------------------------|------------|
| Valid Login                 | Login with standard_user                             | Positive   |
| Locked Out User Login       | Login with locked_out_user (should be blocked)       | Negative   |
| Invalid Username            | Attempt login with an incorrect username             | Negative   |
| Invalid Password            | Attempt login with an incorrect password             | Negative   |
| Add Item to Cart            | Add a product to the shopping cart                   | Functional |
| Remove Item from Cart       | Remove product from the cart                         | Functional |
| Complete Purchase           | Fill checkout info and complete the order            | Functional |
| Checkout with Empty Fields  | Trigger validation messages in checkout              | Negative   |
| Apply Product Filter        | Sort products using dropdown filters (e.g., price)   | Functional |


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

## 🏆 Test Results - All Test Cases Passed!

Here’s the screenshot of the Extent Report showing all tests passed:

![Extent Report Screenshot 1](extent_report_1.png)

![Extent Report Screenshot 2](extent_report_2.png)



## Author

**Karuna Mali**  
[LinkedIn Profile](https://www.linkedin.com/in/karuna-mali-301771285)
[Portfolio](https://karunaportfolio.netlify.app)

---

## License

This project is for learning and demonstration purposes only.
