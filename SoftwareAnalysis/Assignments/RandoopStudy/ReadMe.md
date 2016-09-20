- Randoop gentests parameters help 
```zsh
  COMMAND: gentests
  
  Usage: gentests OPTIONS
  
  Where: At least one class is specified via `--testclass' or
          `--classlist'.
  
  Summary: Attempts to generate JUnit tests that capture the behavior of
          the classes under test and/or find contract violations.
          Randoop generates tests using feedback-directed random test
          generation.
  
  Input: One or more names of classes to test. A class to test can be
          specified via the `--testclass=<CLASSNAME>' or
          `--classlist=<FILENAME>' options.
  
  Output: A JUnit test suite (as one or more Java source files). The
          tests in the suite will pass when executed using the classes
          under test.
  
  Example: java randoop.main.Main gentests
          --testclass=java.util.Collections 
          --testclass=java.util.TreeSet
  
  Notes:
  
  1. Randoop executes the code under test, with no mechanisms to protect
          your system from harm resulting from arbitrary code execution.
          If random execution of your code could have undesirable
          effects (e.g. deletion of files, opening network connections,
          etc.) make sure you execute Randoop in a sandbox machine.
  
  2. Randoop will only use methods from the classes that you specify for
          testing. If Randoop is not generating tests for a particular
          method, make sure that you are including classes for the types
          that the method requires. Otherwise, Randoop may fail to
          generate tests due to missing input parameters.
  
  3. Randoop is designed to be deterministic when the code under test is
          itself deterministic. This means that two runs of Randoop will
          generate the same tests. To get variation across runs, use the
          --randomseed option.
  
  
  OPTIONS:
  
  
  Code under test:
    --testclass=<string> [+]                    - The fully-qualified name of a class under test
    --classlist=<filename>                      - File that lists classes under test
    --methodlist=<filename>                     - File that lists methods under test
    --observers=<filename>                      - File containing observer functions
    --omitmethods=<regex>                       - Do not call methods that match regular expression <string>
    --omit-field-list=<filename>                - File containing field names to omit from generated tests
    --only-test-public-members=<boolean>        - Only use public members in tests [default false]
    --silently-ignore-bad-class-names=<boolean> - Ignore class names specified by user that cannot be found [default false]
    --include-if-classname-appears=<regex>      - Classes, one of which every test must use
    --include-if-class-exercised=<filename>     - File containing class names that tests must exercise
  
  Test classification:
    --no-error-revealing-tests=<boolean>        - Whether to output error-revealing tests [default false]
    --no-regression-tests=<boolean>             - Whether to output regression tests [default false]
    --no-regression-assertions=<boolean>        - Whether to include assertions in regression tests [default false]
    --checked-exception=<enum>                  - Whether checked exception is an ERROR, EXPECTED or INVALID [default EXPECTED]
    --unchecked-exception=<enum>                - Whether unchecked exception is an ERROR, EXPECTED or INVALID [default EXPECTED]
    --npe-on-null-input=<enum>                  - Whether NullPointerException on null inputs is an ERROR, EXPECTED or INVALID [default EXPECTED]
    --npe-on-non-null-input=<enum>              - Whether NullPointerException on non-null inputs is an ERROR, EXPECTED or INVALID [default ERROR]
    --oom-exception=<enum>                      - Whether OutOfMemoryException is an ERROR, EXPECTED or INVALID [default INVALID]
    --ignore-flaky-tests=<boolean>              - Whether to ignore non-determinism in test execution [default false]
  
  Limiting test generation:
    --timelimit=<int>                           - Maximum number of seconds to spend generating tests [default 100]
    --outputlimit=<int>                         - Maximum number of tests to ouput; contrast to --inputlimit [default 100000000]
    --inputlimit=<int>                          - Maximum number of tests generated [default 100000000]
    --maxsize=<int>                             - Do not generate tests with more than <int> statements [default 100]
  
  Values used in tests:
    --null-ratio=<double>                       - Use null as an input with the given frequency [default 0.05]
    --forbid-null=<boolean>                     - Never use null as input to methods or constructors [default false]
    --literals-file=<string> [+]                - A file containing literal values to be used as inputs to methods under test
    --literals-level=<enum>                     - How to use literal values specified via --literals-file: ALL, PACKAGE, CLASS, or NONE [default CLASS]
    --string-maxlen=<int>                       - Maximum length of Strings in generated tests [default 10000]
  
  Varying the nature of generated tests:
    --alias-ratio=<double>                      - Reuse values with the given frequency [default 0.0]
    --small-tests=<boolean>                     - Favor shorter tests during generation [default false]
    --clear=<int>                               - Clear the component set when it gets this big [default 100000000]
  
  Outputting the JUnit tests:
    --testsperfile=<int>                        - Maximum number of tests to write to each JUnit file [default 500]
    --error-test-basename=<string>              - Base name of the JUnit file(s) containing error-revealing tests [default ErrorTest]
    --regression-test-basename=<string>         - Base name of the JUnit file(s) containing regression tests [default RegressionTest]
    --junit-package-name=<string>               - Name of the package for the generated JUnit files [default ]
    --junit-output-dir=<string>                 - Name of the directory to which JUnit files should be written
    --dont-output-tests=<boolean>               - Run Randoop but do not output JUnit tests [default false]
    --junit-reflection-allowed=<boolean>        - If true, use JUnit's reflective invocation; if false, use direct method calls [default true]
  
  Runtime environment:
    -D --system-props=<string> [+]              - Specify system properties to be set (similar to java -Dx=y)
    --agent=<string>                            - Specify an extra command for recursive JVM calls
    --mem-megabytes=<int>                       - specify the memory size (in megabytes) for recursive JVM calls [default 1000]
    --capture-output=<boolean>                  - Capture all output to stdout and stderr [default false]
  
  Controlling randomness:
    --randomseed=<int>                          - The random seed to use in the generation process [default 0]
  
  Notifications:
    --noprogressdisplay=<boolean>               - Do not display progress update message to console [default false]
    --progressinterval=<long>                   - Display progress message every <int> milliseconds [default 5000]
  
  Advanced extension points:
    --visitor=<string> [+]                      - Install the given runtime visitor
  
  Logging and troubleshooting Randoop:
    --debug-checks=<boolean>                    - Perform expensive internal checks (for Randoop debugging) [default false]
    --log=<filename>                            - Name of a file to which to log lots of information
  
  Threading and timeouts:
    --usethreads=<boolean>                      - Execute each test in a separate thread, with timeout [default true]
    --timeout=<int>                             - Maximum number of milliseconds a test may run. Only meaningful with --usethreads [default 5000]
```