package algorithm;

import org.testng.Assert;



public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.

        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            int [] actual = sort.selectionSort(unSortedArray);
            Assert.assertEquals(actual,sortedArray);
            System.out.println("Selection sort unit test passed");
        }catch(AssertionError ex){
            System.out.println("Selection sort unit test failed");
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //verify if the unsorted array is sorted by the Insertion sort algorithm.

    }
}