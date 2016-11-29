mkdir -p result
#python concolic.py 100 tests.homework.driver.KthLargestViaQuickSortTestDriver > result/k_th_largest_via_quick_sort.txt
python concolic.py 100 tests.homework.driver.FindMinViaIterTestDriver > result/find_min_via_iteration.txt
python concolic.py 100 tests.homework.driver.FindMinViaRecurTestDriver > result/find_min_via_recursion.txt
python concolic.py 100 tests.homework.driver.MinSubArrLenTestDriver > result/min_sub_arr_len.txt
python concolic.py 100 tests.homework.driver.RemoveDuplicateTestDriver > result/remove_dupliace.txt
python concolic.py 100 tests.homework.driver.ThreeSumCloseTestDriver > result/three_sum_close.txt
python concolic.py 100 tests.homework.driver.GetNextPermNumTestDriver > result/get_next_permutation.txt
