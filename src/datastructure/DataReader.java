package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class DataReader {

    public static void main(String[] args) throws Exception {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */


        FileReader fr = null;
        BufferedReader br = null;
        ConnectToSqlDB con = new ConnectToSqlDB();
        LinkedList<String> list = new LinkedList<>();
        Stack<String> stk = new Stack<>();
       // ArrayList arr=new ArrayList();
        String str;
        try {
            fr = new FileReader("C:/Users/arifq/Desktop/Midterm exam/MidtermNovember2018/src/data/self-driving-car");
            br = new BufferedReader(fr);
            while ((str = br.readLine()) != null) {

                String[] words = str.split(" ");
                for (int i = 0; i < words.length; i++) {
                    stk.push(words[i]);


                    list.add(words[i]);
                    //arr.add(words[i]);

                }//System.out.println(str);
                con.insertDataFromStringToSqlTableStrData(str, "Car", "Info");
                //con.insertDataFromArrayListToSqlTable(arr,"Car_By_word", "Info");
                //System.out.println(con.readDataBase("Car", "Info" ));


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        br.close();
        fr.close();

        //Reading from database
        List<String> textLine = con.readDataBase("Car", "Info");
        for (String st : textLine) {
            System.out.println(st);
        }
        //Reading from LinkedList
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
             System.out.println("FIFO order from LinkedList: "+ list.get(i));
        }
        //Reading from Stack
        System.out.println();
        for (int i = stk.size() - 1; i >= 0; i--) {
            System.out.println("FILO order from stack: " + stk.get(i));
        }
        //Data manupulation in stack
        System.out.println("Peeking stack: " + stk.peek());
        System.out.println("Searching stack: " + stk.search("steps!"));
        System.out.println("Popping stack: " + stk.pop());
        System.out.println("Peeking again: " + stk.peek()); //To check if last element popped

        //Using for,while loop and iterator to retrieve data.

        System.out.println("Retrieving data using for-each loop: ");
        for (Object st : stk) {
            System.out.println(st);
        }


        System.out.println("Retrieving data using while loop: ");
        while (!stk.empty()) {
            System.out.println(stk.pop());
        }


        System.out.println("Retrieving data using iterator: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String obj = (String) it.next();
            System.out.println(obj);
        }


    }

}
