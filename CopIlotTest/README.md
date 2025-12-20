CopIlotTest
=============

This project contains a small Java utility `NextPrimeFinder` and tests.

How to run tests with Maven:

1. Install Maven and ensure `mvn` is on your PATH.
2. From the project root run:

```
cd /d Z:\Eclipse2025\workspace\CopIlotTest
mvn test
```

Notes:
- The project uses a non-standard source layout: main sources are in `src/` and tests in `test/`.
  The POM registers these directories using the build-helper-maven-plugin so Maven and IDEs should pick them up.
- If you don't want to install Maven, you can use the junit-platform-console-standalone JAR to run tests manually (see `run-tests.bat`).
