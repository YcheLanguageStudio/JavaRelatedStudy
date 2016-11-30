import os

stmt_idx = 0
branch_idx = 1
flag_idx = 2


def branch_str_to_tuple(branch_str):
    vertices = branch_str.rstrip().split(',')
    my_list = map(lambda ele: int(ele.split(':')[1]), vertices)
    return tuple(my_list)


def read_all_runs():
    my_dict = {}
    walk = os.walk('test_case_res')
    for root, dir, file_name_list in walk:
        for file_name in file_name_list:
            file_path = root + os.sep + file_name
            with open(file_path) as ifs:
                success_flag = None
                last_statement_coverage_idx = -1
                last_branch_coverage_idx = -1
                lines = ifs.readlines()
                for i in range(len(lines)):
                    if 'ClassName:tests.homework.IntArrayUtil,Covered Edge' in lines[i]:
                        last_branch_coverage_idx = i
                    elif 'ClassName:tests.homework.IntArrayUtil,Covered Instruction' in lines[i]:
                        last_statement_coverage_idx = i
                    elif 'OK' in lines[i]:
                        success_flag = True
                    elif 'Fail' in lines[i]:
                        success_flag = False

                stmt_description = lines[last_statement_coverage_idx].rstrip()
                covered_statements = lines[last_statement_coverage_idx + 1:last_statement_coverage_idx + 1 + int(
                    stmt_description.split(':')[2])]
                covered_statements = map(int, covered_statements)

                branch_description = lines[last_branch_coverage_idx].rstrip()
                covered_branches = lines[last_branch_coverage_idx + 1:last_branch_coverage_idx + 1 + int(
                    branch_description.split(':')[2])]

                covered_branches = map(branch_str_to_tuple, covered_branches)
            my_dict[file_name] = (covered_statements, covered_branches, success_flag)
    return my_dict


def print_gathered_info():
    read_all_runs()
    my_file_content_dict = read_all_runs()
    for ele in my_file_content_dict:
        print ele
        print my_file_content_dict[ele]
        print '\n'


print_gathered_info()
