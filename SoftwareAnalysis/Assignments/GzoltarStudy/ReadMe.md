##Gzoltar Study

- Introduction

Automatic Testing & Debugging using Spectrum-based Fault Localization (SFL) for Eclipse™.

- Refered Link

  - [Gzoltar Brief Introduction](https://course.cse.ust.hk/comp5111/assignment/gzoltar.html)

- Usage Advice

  - Please make sure your project is the ONLY ONE in your workspace. Otherwise, GZoltar can be very slow and may not work properly. This is because it searches for all JUnit tests in the current workspace and executes them for fault localization.
  - Please make sure you only write ONE test case in EACH test class. If Randoop generates multiple test cases in some test classes, you may write a simple program to transform those classes.
  - Please do not use a [test suite](http://www.vogella.com/tutorials/JUnit/article.html#juniteclipse_testsuite) to embed all test classes
