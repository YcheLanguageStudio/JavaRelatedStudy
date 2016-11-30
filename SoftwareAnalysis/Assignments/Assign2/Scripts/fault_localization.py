import os
import math

stmt_idx = 0
branch_idx = 1
flag_idx = 2

a_one_one_idx = 0
a_one_zero_idx = 1
a_zero_one_idx = 2
a_zero_zero_idx = 3


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
            my_dict[file_name] = (set(covered_statements), covered_branches, success_flag)
    return my_dict


def print_gathered_info():
    read_all_runs()
    my_file_content_dict = read_all_runs()
    for ele in my_file_content_dict:
        print ele
        print my_file_content_dict[ele]
        print '\n'


def get_whole_stmt_set(all_runs_dict):
    whole_stmt_set = set()
    for ele in all_runs_dict:
        whole_stmt_set |= all_runs_dict[ele][stmt_idx]
    return whole_stmt_set


def get_single_statement_vector(stmt_num, my_file_content_dict):
    my_feature_vec = [0 for i in range(4)]
    for file_name in my_file_content_dict:
        my_vec = my_file_content_dict[file_name]
        my_statements = my_vec[stmt_idx]
        is_success_flag = my_vec[flag_idx]
        if stmt_num in my_statements:
            if not is_success_flag:
                my_feature_vec[a_one_one_idx] += 1
            else:
                my_feature_vec[a_one_zero_idx] += 1
        else:
            if not is_success_flag:
                my_feature_vec[a_zero_one_idx] += 1
            else:
                my_feature_vec[a_zero_one_idx] += 1
    return my_feature_vec


def compute_jaccard_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    a00 = tmp_my_feature_vec[a_zero_zero_idx]
    return a11 / (a11 + a01 + a10)


def compute_ample_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    a00 = tmp_my_feature_vec[a_zero_zero_idx]
    return abs(a11 / (a01 + a11) - a10 / (a00 + a10))


def compute_ochiai_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    return a11 / math.sqrt((a11 + a01) * (a11 + a10))


def compute_tarantula_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    a00 = tmp_my_feature_vec[a_zero_zero_idx]
    numerator = a11 / (a11 + a01)
    first_denominator = a11 / (a11 + a01)
    second_denominator = a10 / (a10 + a00)
    return numerator / (first_denominator + second_denominator)


all_runs_dict = read_all_runs()
stmt_set = get_whole_stmt_set(all_runs_dict)
print 'stmt size:', len(stmt_set), ', stmt set:', stmt_set
coefficent_info_map = {}
for stmt_num in stmt_set:
    feature_vec = get_single_statement_vector(stmt_num, all_runs_dict)
    coefficent_info_map[stmt_num] = (
        feature_vec, compute_ochiai_coefficient(feature_vec), compute_tarantula_coefficient(feature_vec),
        compute_ample_coefficient(feature_vec), compute_jaccard_coefficient(feature_vec))

for ele in coefficent_info_map:
    print 'instruction:', ele, ', coefficient:', coefficent_info_map[ele]
