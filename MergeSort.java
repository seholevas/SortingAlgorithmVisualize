class MergeSort implements SortingAlgorithm<int[]> {
    public void merge(int[] nums, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            //merge for left side  
            merge(nums, start, middle);
            // merge for right side
            merge(nums, middle + 1, end);
            // sorts left and right side
            sort(nums, start, middle, end);
        }
    }

    @Override
    public void sort(int[] nums, int start, int middle, int end) 
    {

        
        // will be the start of the left side of the array
        int i = start;
        // will be the start of the right side of the array
        int j = middle+1;
        // will be the counter for the "in order" side of the array
        int k = start;
        // helper array
        int[] helper_array = new int[end+1];

        // initialize helper with values from nums. [0,1,2,...n]
        for(int count = 0; count <= end; count++)
        {
            helper_array[count] = nums[count];
        }
        // while the pointer i from the start array hasn't incremented to middle+1 (which is where j begins) [0,1,2,..., middle]
        // and j pointer is still pointing to an index of the array [middle+1, 4,5,...,n]
        while(i <= middle && j <= end)
        {
            // place value at index i to the first index that is unsorted in array
            if(helper_array[i] <= helper_array[j])
            {
                nums[k] = helper_array[i];
                i++;
            }
            // else add j to the first index that is unsorted
            else
            {
                nums[k] = helper_array[j];
                j++;
            }
            // increment to the next integer, which is now the first unsorted value in the array.
            k++;
        }
        // while the i half of the array has not reached the middle, add the rest of the values to the end of the array
        while (i<= middle)
        {
            nums[k] = helper_array[i];
            i++;
            k++;
        }

        // while the j half of the array has not reached the end, add the rest of the values to the end of the array
        while(j <= end)
        {
            nums[k] = helper_array[j];
            j++;
            k++;
        }
    }

// public static void main(String args[])
// {
//     int[] nums = {4,3,2,5,10,6,3};
//     MergeSort ms = new MergeSort();
//     ms.merge(nums, 0, nums.length - 1);
    
//     for(int i = 0; i < nums.length; i++)
//     {
//         System.out.println(nums[i]);
//     }
// }


    }
