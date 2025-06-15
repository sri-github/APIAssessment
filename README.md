# API Assessment Project

## Overview

This project contains automated API tests for the Simple Books API using Java, Cucumber, and RestAssured.  
All tests are run automatically using GitHub Actions CI.

---

## How to Review Test Results

### 1. **View Test Runs in GitHub Actions**

- Go to the [GitHub repository](https://github.com/sri-github/APIAssessment).
- Click the **Actions** tab at the top.
- Select the latest workflow run (e.g., "Run Books API Tests").
- Review the logs for test execution details.

### 2. **Download and View the HTML Test Report**

- In the workflow run summary, scroll down to the **Artifacts** section.
- Download the `cucumber-report` artifact.
- Extract the ZIP file and open `index.html` in your web browser to view the detailed Cucumber test report.

---

## How to Run Tests Locally (Optional)

1. **Prerequisites:**
   - Java 17 or higher
   - Maven 3.6 or higher

2. **Clone the repository:**
   ```sh
   git clone https://github.com/sri-github/APIAssessment.git
   cd your-repo
   ```

3. **Run all tests:**
   ```sh
   mvn test
   ```

4. **Run only the Cucumber TestRunner:**
   ```sh
   mvn test -Dtest=TestRunner
   ```

5. **View the report:**
   - After running tests, open `target/cucumber-report/index.html` in your browser.

---

## Project Structure

- `.github/workflows/` — GitHub Actions CI pipeline configuration
- `src/test/java/` — Step definitions and test runners
- `src/test/resources/features/` — Cucumber feature files
- `target/cucumber-reports/` — Generated HTML test reports

---

## Notes

- All tests are automated and run on every push or pull request to the `main` and `apiautomation` branches.
- Test results and reports are available as downloadable artifacts in GitHub Actions.
- For security reasons, HTML reports must be downloaded and opened locally; they cannot be viewed directly in GitHub.

---

## Contact

For questions or issues, please contact sri.nidh88@gmail.com.