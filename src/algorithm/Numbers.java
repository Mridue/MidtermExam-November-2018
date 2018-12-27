package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

    /*
     * Show all the different kind of sorting algorithm by applying into (num array).
     * Display the execution time for each sorting.Example in below.
     *
     * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
     *
     * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
     *
     */

    public static void main(String[] args) throws Exception {

        int[] num = new int[10000];

        storeRandomNumbers(num);

        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

        //Selection Sort
        Sort algo = new Sort();
        algo.selectionSort(num);
        long selectionSortExecutionTime = algo.executionTime;

        System.out.println("Total Execution Time of " + num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
        int n = num.length;
        randomize(num, n);
        System.out.println("...................................................");

        //Insertion Sort
        algo.insertionSort(num);
        long insertionSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "InsertionSort_Table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numinsert = connectToSqlDB.readDataBase("InsertionSort_Table", "SortingNumbers");
        printValue(numinsert);
        int ninsert = num.length;
        randomize(num, ninsert);
        System.out.println(".............................................................");

        //Bubble Sort
        algo.bubbleSort(num);
        long bubbleSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersbuble = connectToSqlDB.readDataBase("bubble_sort_table", "SortingNumbers");
        printValue(numbersbuble);
        int nbub = num.length;
        randomize(num, nbub);
        System.out.println("....................................................................");


        //Merge Sort
        algo.mergeSort(num);
        long mergSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersmerge = connectToSqlDB.readDataBase("merge_sort_table", "SortingNumbers");
        printValue(numbersmerge);
        int nmerge = num.length;
        randomize(num, nmerge);
        System.out.println("................................................................................");


        //Quick Sort
        algo.quickSort(num);
        long quickSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersquick = connectToSqlDB.readDataBase("quick_sort_table", "SortingNumbers");
        printValue(numbersquick);
        int nquick = num.length;
        randomize(num, nquick);
        System.out.println("........................................................................................");


        //Heap Sort
        algo.heapSort(num);
        long heapSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "heap_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersheap = connectToSqlDB.readDataBase("heap_sort_table", "SortingNumbers");
        printValue(numbersheap);
        int nheap = num.length;
        randomize(num, nheap);
        System.out.println(".........................................................................................");

        //Bucket Sort
        algo.bucketSort(num);
        long bucketSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucket_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersbucket = connectToSqlDB.readDataBase("bucket_sort_table", "SortingNumbers");
        printValue(numbersbucket);
        int nbucket = num.length;
        randomize(num, nbucket);
        System.out.println(".....................................................................................................");

        //Shell Sort
        algo.shellSort(num);
        long shellSortExecutionTime = algo.executionTime;
        System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");

        connectToSqlDB.insertDataFromArrayToSqlTable(num, "shell_sort_table", "SortingNumbers");
        System.out.println("Data showing form database :");
        List<String> numbersshel = connectToSqlDB.readDataBase("shell_sort_table", "SortingNumbers");
        printValue(numbersshel);
        int nshel = num.length;
        randomize(num, nshel);
        System.out.println("..................................................................................");


        //Come to conclusion about which Sorting Algo is better in given data set.

//Selection Sort take: 407411 milli sec

//Insertion Sort take: 374962 milli sec

//Bubble Sort take: 969469 milli sec

//Merge Sort take: 39 milli sec

//Quick Sort take: 75 milli sec

//Heap Sort take: 127 milli sec

//Bucket Sort take: 42 milli sec

//Shell Sort take: 47 milli sec

        //Slowest algorithm is Bubble sort
        //Fastest algorithm is Merge sort





    }

    public static void storeRandomNumbers(int[] num) {
        Random rand = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(1000);//1000000 changed to 1000 for faster process time
        }
    }

    public static void randomize(int arr[], int n) {
        Random r = new Random();
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n - 1; i > 0; i--) {
            int j = r.nextInt(i);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(List<String> array) {
        for (String st : array) {
            System.out.println(st + " ");
        }
    }
}
