import math

a_one_one_idx = 0
a_one_zero_idx = 1
a_zero_one_idx = 2
a_zero_zero_idx = 3


def compute_jaccard_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    if a11 == 0:
        return 0
    else:
        return a11 / (a11 + a01 + a10)


def compute_ample_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    a00 = tmp_my_feature_vec[a_zero_zero_idx]
    if a11 == 0:
        return 0
    elif a10 + a00 == 0:
        return 1
    else:
        return abs(a11 / (a01 + a11) - a10 / (a00 + a10))


def compute_ochiai_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    if a11 == 0:
        return 0
    else:
        return a11 / math.sqrt((a11 + a01) * (a11 + a10))


def compute_tarantula_coefficient(my_feature_vec):
    tmp_my_feature_vec = map(float, my_feature_vec)
    a11 = tmp_my_feature_vec[a_one_one_idx]
    a10 = tmp_my_feature_vec[a_one_zero_idx]
    a01 = tmp_my_feature_vec[a_zero_one_idx]
    a00 = tmp_my_feature_vec[a_zero_zero_idx]
    if a11 == 0:
        return 0
    elif a10 + a00 == 0:
        return 1
    else:
        numerator = a11 / (a11 + a01)
        first_denominator = a11 / (a11 + a01)
        second_denominator = a10 / (a10 + a00)
        return numerator / (first_denominator + second_denominator)
