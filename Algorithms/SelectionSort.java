package Algorithms;

class SelectionSort
{
    // ! parameters: int array
    // ! return: null
    // ! description: this function takes in an array and sorts it with a selection sort.
    // !              it does this by looping the array to find the minimum and swaps it
    // !              with the first unsorted portion of the array.
    // !
    // ! worst case time complexity: O(n^2)
    // ! worst case space complexity: O(n)

    public void selection_sort(int[] array)
    {
        // pointer for min index
        int min_index = 0;

        // for each element in array
        for(int i = 0; i < array.length -1; i++)
        {
            // for each element in the array after i
            for(int j = i+1; j < array.length; j++)
            {
                // if element j is < current minimum element
                if(array[j] < array[min_index])
                {
                    // minimum element index is now j
                    min_index = j;
                }
            }
            // if index of minimum element is not the current index of i, swap the elements.
            // index i will always be moving forward, so every element before index i is sorted.
            if(min_index != i)
            {
                swap(array, min_index, i);
            }
        }

    }

    // ! parameters: int array, int index_one, int index_two
    // ! return: null
    // ! description: this function swaps the places of two elements in the array.
    // !
    // ! worst case time complexity: O(1)
    // ! worst case space complexity: O(1)

    public void swap(int[] array, int index_one, int index_two)
    {
        int temp = array[index_one];
        array[index_one] = array[index_two];
        array[index_two] = temp;
    }

    // public static void main(String [] args)
    // {
    //     int[] j = {5,3,7,2,3,1,10,3,13,-1};
    //     SelectionSort ss = new SelectionSort();
    //     ss.selection_sort(j);

    //     for(int i = 0; i < j.length; i++)
    //     {
    //         System.out.println(j[i]);
    //     }
    // }
} 


