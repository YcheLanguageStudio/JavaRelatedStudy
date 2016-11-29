import re


def test_set():
    my_list = [1, 2, 2, 1]
    my_set = set(my_list)
    for ele in my_set:
        print ele


def test_regex(test_str):
    if re.match('.*int\[\].*\{.*\}', test_str):
        print 'match'
    else:
        print 'not match'


def rebuild_with_new_str(test_str, other_str):
    tmp_list = test_str.split('{')
    return tmp_list[0] + '{' + other_str + '};\n'


test_regex(r'        int[] arr0 = {11, -2, 3, 5, 10};\n')

print rebuild_with_new_str(r'        int[] arr0 = {11, -2, 3, 5, 10};\n', '2,2,2')
