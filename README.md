# API Assessment Project

## Running Tests with GitHub Actions

This project includes a GitHub Actions workflow that automatically runs the test suite on every push or pull request to the `apiautomation` branch.

You do **not** need to run tests locally.  
To see test results, check the **Actions** tab on GitHub after pushing your changes.

## Running Tests Locally (Optional)

If you want to run tests on your own machine:

1. Install [Java 17+](https://adoptopenjdk.net/) and [Maven](https://maven.apache.org/).
2. Clone this repository.
3. Run:
   ```sh
   mvn test
   ```
   or to run only the Cucumber TestRunner:
   ```sh
   mvn test -Dtest=TestRunner
   ```

## Project Structure

- `.github/workflows/` — CI pipeline configuration
- `src/test/java/` — Step definitions and runners
- `src/test/resources/features/` — Cucumber feature files

## Notes

- All tests are automated and run in CI.
- No local environment setup is required unless you want to run tests manually.