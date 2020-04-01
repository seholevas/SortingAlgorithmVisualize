package Algorithms;

class BubbleSort
{
    public void bubble_sort(int array[])
    {
        for(int i = 0; i < array.length-1; i++)
        {
            for(int j=  0; j < array.length - i -1; j++)
            {
                if(array[j] > array[j+1])
                {
                    swap(array, j, j+1);
                }
            }
        }
    }

    public void swap(int[] array, int index_one, int index_two)
    {
        int temp = array[index_one];
        array[index_one] = array[index_two];
        array[index_two] = temp;
    }

    public static void main(String args[])
{
    int[] nums = {4,3,2,5,10,6,3,3,2,0};
    BubbleSort ms = new BubbleSort();
    ms.bubble_sort(nums);
    
    for(int i = 0; i < nums.length; i++)
    {
        System.out.println(nums[i]);
    }
}
}