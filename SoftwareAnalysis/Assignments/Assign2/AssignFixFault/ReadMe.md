- correct one, line 257 in `IntArrayUtil.java` differ

```java
    public void getNextPermutationNumber(int[] nums) {
        if(nums != null && nums.length >= 2) {
            int p = 0;

            int q;
            for(q = nums.length - 2; q >= 0; --q) {
                if(nums[q] < nums[q + 1]) {
                    p = q;
                    break;
                }
            }

            q = 0;

            int local_i1;
            for(local_i1 = nums.length - 1; local_i1 > p; --local_i1) {
                if(nums[local_i1] > nums[p]) {
                    q = local_i1;
                    break;
                }
            }

            if(p == 0 && q == 0) {
                reverse(nums, 0, nums.length - 1);
            } else {
                local_i1 = nums[p];
                nums[p] = nums[q];
                nums[q] = local_i1;
                if(p < nums.length - 1) {
                    reverse(nums, p + 1, nums.length - 1);
                }

            }
        }
    }
```

- faulty one

```java
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
	 
	    if(p==0 || q==0){
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
```