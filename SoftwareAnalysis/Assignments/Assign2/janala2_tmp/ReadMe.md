##File Organization
- test driver
  - [src/integration/java/tests/homework](src/integration/java/tests/homework), my driver package and [src/integration/java/tests/homework/IntArrayUtil.java](src/integration/java/tests/homework/IntArrayUtil.java)

- shell script to run Janala2
  - [output_test_inputs.sh](output_test_inputs.sh), output inputs for generating test cases, including `targetVal` and input array information

- result samples
  - [result_sample](result_sample)
  - [result_sample2](result_sample2)

- test case template folder
  - [test_case_template](test_case_template),for generating test

- python script to generate test cases
  - [my_scripts/generate_test_cases.py](my_scripts/generate_test_cases.py), transform files' information in `result` folder to test cases
