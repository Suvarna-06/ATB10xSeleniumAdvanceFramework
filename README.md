# 🚀 Selenium Automation Framework (with Java)

### 👩‍💻 Author: *Sandhya Sankeshwar*

---

## 🧰 Tech Stack & Key Features

- 🟢 **Language:** Java  
- 🧪 **Testing Framework:** TestNG (`@Test`, `@BeforeMethod`, `@AfterMethod`)  
- 🧱 **Design Pattern:** Page Object Model (POM)  
- ⚙️ **Build Tool:** Maven  
- ✔️ **Assertions:** AssertJ  
- 🧵 **Thread Safety:** ThreadLocal Support  
- 📈 **Reporting:** Allure Report  
- 📊 **Test Data:** Excel Sheet (Apache POI + Data Provider)  
- 🔐 **Secure Credentials:** Read username & password from `.properties` file  
- ☁️ **Cloud Grids:** BrowserStack, LambdaTest  
- 🧪 **Execution Environments:** Local & Selenoid Integration  
- 🧹 **Code Quality:** SonarLint, Java > 22  

---




🧭 Framework Structure Overview

🧩 Selenium Framework Architecture

<img width="718" alt="Selenium Framework Architecture" src="https://github.com/user-attachments/assets/db57c178-d359-470b-9aa2-d9f0a21825fa" />





🔄 CI/CD + Grid Integration Overview


<img width="673" alt="image" src="https://github.com/user-attachments/assets/dd07df31-2a7d-4a75-88f2-6fa25de6990c" />




## 🏃 Run the Test Suite

```bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
