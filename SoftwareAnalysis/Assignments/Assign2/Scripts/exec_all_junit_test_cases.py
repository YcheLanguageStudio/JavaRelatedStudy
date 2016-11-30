import os

if __name__ == '__main__':
    java_flag = 'java -cp'
    java_class_path = ['sootOutput', '../Local-Jars/subjectGoldenVersion.jar', '../Local-Jars/hamcrest-core-1.3.jar',
                       '../Local-Jars/junit-4.11.jar']
    java_class_path = ':'.join(java_class_path)
    junit_class = 'org.junit.runner.JUnitCore'

    test_case_res_dir = os.path.abspath(os.path.curdir) + os.sep + 'test_case_res'
    if not os.path.exists(test_case_res_dir):
        os.mkdir(test_case_res_dir)

    walk = os.walk('sootOutput/janala')
    for root, dir, file_name_list in walk:
        for file_name in file_name_list:
            my_class = 'janala.' + file_name.rstrip('.class')
            redirect_str = '>' + test_case_res_dir + os.sep + my_class + '.txt'

            my_list = [java_flag, java_class_path, junit_class, my_class, redirect_str]
            cmd_str = ' '.join(my_list)
            print cmd_str
            os.system(cmd_str)
