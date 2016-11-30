#File Organization
##Randoop
- randoop configuration file
  - [literals.txt](literals.txt), for repo symbols generation
  - [my_classes.txt](my_classes.txt), for specifying test subject program

- shell script to use randoop
  - [use_randoop_gen_tests.sh](use_randoop_gen_tests.sh)

##Soot
- result file after running soot driver
  - [tests.homework.IntArrayUtil_branches_num.txt](tests.homework.IntArrayUtil_branches_num.txt), number of whole branches
  - [tests.homework.IntArrayUtil_statements_num.txt](tests.homework.IntArrayUtil_statements_num.txt), number of whole statemetns
  - [tests.homework.IntArrayUtil_statement_line_number_map.txt](tests.homework.IntArrayUtil_statement_line_number_map.txt), statement, line number dictionary, used for fault localization

- related shellscript
  - [use_soot_driver.sh](use_soot_driver.sh), execute soot driver program, to get the instrumented class file of subject program
  - [cp_related_class_files.sh](cp_related_class_files.sh), copy eclipse ant built classes, into [sootOutput](sootOutput)

- related python script
  - [exec_all_junit_test_cases.py](exec_all_junit_test_cases.py), execute all janala test cases to generate statement related information, which are held in [test_case_res](test_case_res) folder
  - [fault_localization.py](fault_localization.py), fault localization tool

- final result folder
  - [coefficient_rank](coefficient_rank), where four coefficient measurements' ranks are held
  - the column information of each file, e.g [coefficient_rank/chiai_coefficient.csv](coefficient_rank/chiai_coefficient.csv) are `Line Number, Coefficient, Statement Number`

##Gzoltar
- python script [process_gzoltar_result.py](process_gzoltar_result.py) ,transform [gzoltar_faulty_statements.txt](gzoltar_faulty_statements.txt) into [gzoltar_faulty_statements.csv](gzoltar_faulty_statements.csv)
