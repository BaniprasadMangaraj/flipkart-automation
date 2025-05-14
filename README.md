# 🛒 Flipkart QA Automation Framework

This project is a complete QA Automation Framework designed to test Flipkart-like e-commerce registration and login functionalities. It supports both **Web** (Selenium) and **Mobile** (Appium) automation and is fully integrated with **Docker** and **Jenkins CI/CD**.

---

## 📌 Features

- ✅ Page Object Model (POM) Structure
- ✅ Selenium for Web Automation (Chrome by default)
- ✅ Appium-ready structure for Mobile Automation
- ✅ Extent Reports for rich test reporting
- ✅ Cross-browser support (Chrome, Firefox)
- ✅ Dockerized environment for easy setup
- ✅ Jenkins pipeline for CI/CD automation
- ✅ Modular, maintainable & scalable framework

---

## 🗂️ Project Structure

```

flipkart-qa-automation/
├── Dockerfile
├── docker-compose.yml
├── Jenkinsfile
├── README.md
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   ├── pages/
│       │   ├── tests/
│       │   ├── utils/
│       └── resources/
├── reports/
└── pom.xml

````

---

## 🧪 Prerequisites

Before you begin, make sure you have:

- Java 17+
- Maven 3.8+
- Docker & Docker Compose
- Git
- Jenkins (for CI setup)

---

## 🚀 How to Run (Locally)

### 1. Clone the Repo
```bash
git clone https://github.com/yourusername/flipkart-qa-automation.git
cd flipkart-qa-automation
````

### 2. Run Tests Using Maven

```bash
mvn clean test
```

### 3. View Extent Report

After test execution, open:

```
reports/extent-report.html
```

---

## 🐳 Run with Docker

```bash
docker build -t flipkart-tests .
docker run flipkart-tests
```

Or use `docker-compose`:

```bash
docker-compose up --build
```

---

## 🔁 CI/CD with Jenkins

This project includes a `Jenkinsfile` for pipeline integration.

### Steps:

1. Create a new Jenkins pipeline project.
2. Connect it to your GitHub repo.
3. Jenkins will:

   * Pull the code
   * Run Maven build and tests
   * Publish Extent Reports

---

## 🧪 Test Scenarios Automated

* [x] Valid Registration with OTP
* [x] Invalid OTP Scenario
* [x] Login with Valid Credentials
* [x] Login with Invalid Credentials
* [x] Empty Field Validation
* [x] Cross-browser Testing Support

---

## 📂 Reports

All test reports are generated using **ExtentReports** and saved in the `reports/` folder.

---

## 👨‍💻 Author

**BaniPrasad Mangaraj**

📧 Email: [baniprasadmangaraj@gmail.com](mailto:baniprasadmangaraj@gmail.com)
📍 Location: India
