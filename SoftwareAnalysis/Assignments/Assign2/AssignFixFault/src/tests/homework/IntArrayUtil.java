package tests.homework;


public class IntArrayUtil {
	/**
	 * get the k-th largest value of an integer array
	 * @param nums  the array to search
	 * @param k    the k-th
	 * @return
	 */
	public int findKthLargestViaQuickSort(int[] nums, int k) {
		if (k < 1 || nums == null) {
			return 0;
		}

		return findKthViaQuickSort(nums.length - k + 1, nums, 0, nums.length - 1);
	}

	private int findKthViaQuickSort(int k, int[] nums, int start, int end) {

		int pivot = nums[end];

		int left = start;
		int right = end;

		while (true) {

			while (nums[left] < pivot && left < right) {
				left++;
			}

			while (nums[right] >= pivot && right > left) {
				right--;
			}

			if (left == right) {
				break;
			}

			swap(nums, left, right);
		}

		swap(nums, left, end);

		if (k == left + 1) {
			return pivot;
		} else if (k < left + 1) {
			return findKthViaQuickSort(k, nums, start, left - 1);
		} else {
			return findKthViaQuickSort(k, nums, left + 1, end);
		}
	}

	private void swap(int[] nums, int n1, int n2) {
		int tmp = nums[n1];
		nums[n1] = nums[n2];
		nums[n2] = tmp;
	}

	/**
	 * get the minimal value of an array through recursion way
	 * @param num
	 * @return
	 */
	public int findMinViaRecursion(int[] num) {
		return findMinViaRecursion(num, 0, num.length - 1);
	}


	private int findMinViaRecursion(int[] num, int left, int right) {
		if (left == right)
			return num[left];
		if ((right - left) == 1)
			return min(num[left], num[right]);

		int middle = left + (right - left) / 2;

		// not rotated
		if (num[left] < num[right]) {
			return num[left];

			// go right side
		} else if (num[middle] > num[left]) {
			return findMinViaRecursion(num, middle, right);

			// go left side
		} else {
			return findMinViaRecursion(num, left, middle);
		}
	}

	/**
	 * find the minimal value of an array through iteration
	 * @param nums
	 * @return
	 */
	public int findMinViaIteration(int[] nums) {
		if (nums == null || nums.length == 0)
			return -1;

		if (nums.length == 1)
			return nums[0];

		int left = 0;
		int right = nums.length - 1;

		// not rotated
		if (nums[left] < nums[right])
			return nums[left];

		while (left <= right) {
			if (right - left == 1) {
				return nums[right];
			}

			int m = left + (right - left) / 2;

			if (nums[m] > nums[right])
				left = m;
			else
				right = m;
		}

		return nums[left];
	}

	/**
	 * remove duplicate elements in an array
	 * @param A
	 * @return
	 */
	public int removeDuplicateElements(int[] A) {
		if (A == null || A.length == 0)
			return 0;

		int pre = A[0];
		boolean flag = false;
		int count = 0;

		// index for updating
		int o = 1;

		for (int i = 1; i < A.length; i++) {
			int curr = A[i];

			if (curr == pre) {
				if (!flag) {
					flag = true;
					A[o++] = curr;

					continue;
				} else {
					count++;
				}
			} else {
				pre = curr;
				A[o++] = curr;
				flag = false;
			}
		}

		return A.length - count;
	}

	/**
	 * Find the minimal length of a subarray
	 * of which the sum is smaller than a given value
	 * @param s
	 * @param nums
	 * @return
	 */
	public int findMinSubArrayLen(int s, int[] nums) {
	    if(nums == null || nums.length == 0){
	        return 0;
	    }
	    if(nums.length == 1 && nums[0] < s){
	        return 0;
	    }
	    int result = nums.length;

	    int i = 0;
	    int sum = nums[0];

	    for(int j=0; j<nums.length; ){
	        if(i==j){
	            if(nums[i]>=s){
	                return 1;
	            }else{
	               j++;

	               if(j<nums.length){
	                    sum = sum + nums[j];
	               }else{
	                    return result;
	               }
	            }
	        }else{
	            if(sum >= s){
	                result = min(j-i+1, result);
	                sum = sum - nums[i];
	                i++;
	            }else{
	                j++;

	                if(j<nums.length){
	                    sum = sum + nums[j];
	                }else{
	                    if(i==0){
	                        return 0;
	                    }else{
	                        return result;
	                    }
	                }
	            }
	        }
	    }

	    return result;
	}



	private int min(int a, int b){
		if(a>=b){
			return b;
		}else{
			return a;
		}
	}

	/**
	 *  rearranges the integer array
	 *  such that the new array is
	 *  the lexicographically next greater permutation of numbers
	 * @param nums
	 */
	public void getNextPermutationNumber(int[] nums) {
	    if(nums == null || nums.length<2)
	        return;

	    int p=0;
	    for(int i=nums.length-2; i>=0; i--){
	        if(nums[i]<nums[i+1]){
	            p=i;
	            break;
	        }
	    }

	    int q = 0;
	    for(int i=nums.length-1; i>p; i--){
	        if(nums[i]> nums[p]){
	            q=i;
	            break;
	        }
	    }

	    if(p==0 && q==0){
	        reverse(nums, 0, nums.length-1);
	        return;
	    }

	    int temp=nums[p];
	    nums[p]=nums[q];
	    nums[q]=temp;

	    if(p<nums.length-1){
	        reverse(nums, p+1, nums.length-1);
	    }
	}

	private void reverse(int[] nums, int left, int right){
	    while(left<right){
	        int temp = nums[left];
	        nums[left]=nums[right];
	        nums[right]=temp;
	        left++;
	        right--;
	    }
	}

	/**
	 * Select 3 numbers from an array such that
	 * their sum value is closest to the target value
	 *
	 * @param nums
	 * @param target
	 * @return
	 */
	public int threeSumClosest(int[] nums, int target) {
	    int min = Integer.MAX_VALUE;
		int result = 0;

		MergeSort(nums);

		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = abs(sum - target);

				if(diff == 0) return sum;

				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}

		return result;
	}

	private int abs(int a){
		if(a<0){
			return -a;
		}else{
			return a;
		}
	}

    private void MergeSort(int[] unsorted) {
        MergeSort(0, unsorted.length, unsorted);
    }

    private void MergeSort(int start, int length, int[] unsorted) {
        if (length > 2) {
            int aLength = (int) Math.floor(length / 2);
            int bLength = length - aLength;
            MergeSort(start, aLength, unsorted);
            MergeSort(start + aLength, bLength, unsorted);
            mergeWithExtraStorage(start, aLength, start + aLength, bLength, unsorted);
        } else if (length == 2) {
            int e = unsorted[start + 1];
            if (e<unsorted[start]) {
                unsorted[start + 1] = unsorted[start];
                unsorted[start] = e;
            }
        }
    }

    private void mergeWithExtraStorage(int aStart, int aLength, int bStart, int bLength, int[] unsorted) {
        int count = 0;
        Integer[] output = new Integer[aLength + bLength];
        int i = aStart;
        int j = bStart;
        int aSize = aStart + aLength;
        int bSize = bStart + bLength;
        while (i < aSize || j < bSize) {
            Integer a = null;
            if (i < aSize) {
                a = unsorted[i];
            }
            Integer b = null;
            if (j < bSize) {
                b = unsorted[j];
            }
            if (a != null && b == null) {
                output[count++] = a;
                i++;
            } else if (b != null && a == null) {
                output[count++] = b;
                j++;
            } else if (b != null && b.compareTo(a) <= 0) {
                output[count++] = b;
                j++;
            } else {
                output[count++] = a;
                i++;
            }
        }
        int x = 0;
        int size = aStart + aLength + bLength;
        for (int y = aStart; y < size; y++) {
            unsorted[y] = output[x++];
        }
    }


}
