package Algorithms;

class QuickSort
{
    public int partition(int[] array, int pivot, int left_index, int right_index)
    {
        while(left_index <= right_index)
        {
            while( pivot >= array[left_index])
            {
                left_index++;
            }

            while(pivot < array[right_index])
            {
                right_index--;
            }

            if(left_index <= right_index)
            {
                swap(array, left_index, right_index);
            }
        }
        return left_index;
    }

    public void swap(int[] array, int index_one, int index_two)
    {
        int temp = array[index_one];
        array[index_one] = array[index_two];
        array[index_two] = temp;
    }
    //! Time Complexity: Worse Case - O(N^2) || Best Case - O(N log(n))
    public void quick_sort(int[] array, int left, int right)
    {
        if(left < right)
        {
            int half = (left + right) / 2;
            int pivot_value = array[half];
            int partition = partition(array, pivot_value, left, right);
            quick_sort(array, left, partition);
            quick_sort(array, partition+1, right);

        }
    }


    public static void main (String args[])
    {
        int [] array = {3,12,13,2,5,7,1,12};
        QuickSort qs = new QuickSort();
        qs.quick_sort(array, 0, array.length - 1);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(" "+array[i]+",");
        }

    }
}