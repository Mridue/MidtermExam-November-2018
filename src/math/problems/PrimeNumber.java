package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public static void main(String[] args) throws Exception {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        ArrayList<Integer> arr = new ArrayList<>();
        int counter = 0;
        for (int i = 2; i < 1000000; i++) {
            if (i == 2) {
                System.out.println(i);
                counter++;
                arr.add(i);

            } else {
                if (isPrime(i)) {
                    counter++;
                    System.out.println(i);
                    arr.add(i);

                }
            }

        }
        System.out.println(" Total Number Of Prime Numbers: " + counter);
        //System.out.println(arr);
        List arlist = arr;
        ConnectToSqlDB connect = new ConnectToSqlDB();
        connect.insertDataFromArrayListToSqlTable(arlist, "ListofPrime", "Element");


        List<String> y = connect.readDataBase("ListofPrime", "Element");
        for (String st : y) {
            System.out.println(y);
        }
    }

    public static boolean isPrime(int n) {

        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {

            if (n % i == 0) return false;
        }

        return true;

    }

}
