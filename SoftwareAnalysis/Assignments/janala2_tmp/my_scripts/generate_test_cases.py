import os
import re

my_dict = {
    'get_next_permutation.txt': 'GetNextPermNumTestCase.java',
    'three_sum_close.txt': 'ThreeSumCloseTestCase.java',
    'remove_dupliace.txt': 'RemoveDuplicateTestCase.java',
    'min_sub_arr_len.txt': 'MinSubArrLenTestCase.java',
    'find_min_via_recursion.txt': 'FindMinViaRecurTestCase.java',
    'find_min_via_iteration.txt': 'FindMinViaIterTestCase.java',
    'k_th_largest_via_quick_sort.txt': 'KthLargestViaQuickSortTestCase.java'
}


def eval_element(input_row):
    ret_list = []
    if len(input_row) < 1 or len(input_row) > 2:
        print 'error in eval element'
        return None
    else:
        for i in range(len(input_row)):
            ret_list.append(eval(input_row[i]))
        ret_list[0] = ', '.join(map(str, ret_list[0]))
        if len(input_row) == 2:
            ret_list[1] = str(ret_list[1])
    return ret_list


def get_sorted_unique_input_array_list(original_array_list):
    unique_list = set(original_array_list)
    split_list = map(lambda ele: ele.split(';'), unique_list)
    ret_list = []
    for ele in split_list:
        ele = map(lambda ele2: ele2.split(':')[1], ele)
        ele = eval_element(ele)
        ret_list.append(ele)
    return ret_list


def generate_test_case_source_code(input_info, java_codes_list, test_case_num):
    ret_java_code_list = []
    class_name = ''
    for line in java_codes_list:
        if 'public class' in line:
            tmp_list = line.split(' ')
            tmp_list[2] += str(test_case_num)
            class_name = tmp_list[2]
            new_line = ' '.join(tmp_list)
        elif re.match('.*int\[\].*\{.*\}', line):
            tmp_list = line.split('{')
            new_line = tmp_list[0] + '{' + input_info[0] + '};\n'
        elif 'int targetVal =' in line:
            tmp_list = line.split('=')
            new_line = tmp_list[0] + ' = ' + input_info[1] + ";\n"
        else:
            new_line = line
        ret_java_code_list.append(new_line)
    return ret_java_code_list, class_name


if __name__ == '__main__':
    parent_dir_path = os.path.abspath(os.path.join(os.path.dirname('__file__'), os.path.pardir))

    test_cases_path_root = parent_dir_path + os.sep + 'test_cases'

    if not os.path.exists(test_cases_path_root):
        os.mkdir(test_cases_path_root)

    root_path = parent_dir_path + os.sep + 'result'
    for file_name in my_dict:
        file_path = root_path + os.sep + file_name
        with open(file_path) as ifs:
            input_list = map(lambda ele: ele.rstrip(), filter(lambda ele: 'Input Array:' in ele, ifs.readlines()))
            java_codes_path = parent_dir_path + os.sep + 'test_case_template' + os.sep + my_dict[file_name]
            java_codes = []
            with open(java_codes_path) as codes_ifs:
                java_codes = codes_ifs.readlines()
            print file_path
            input_list_unique = get_sorted_unique_input_array_list(input_list)
            print 'input list length:', len(input_list_unique)
            print 'input list:', input_list_unique
            print java_codes
            test_case_number = 0

            for input_info in input_list_unique:
                generated_codes, class_name = generate_test_case_source_code(input_info, java_codes, test_case_number)
                print class_name, generated_codes
                test_case_number += 1
                with open(test_cases_path_root + os.sep + class_name + '.java', 'w') as ofs:
                    ofs.write(''.join(generated_codes))
            print
