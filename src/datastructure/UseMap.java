package datastructure;

import databases.ConnectToSqlDB;

import java.util.*;

public class UseMap {

    public static void main(String[] args) throws Exception {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        ConnectToSqlDB con = new ConnectToSqlDB();
        List<String> honda = new ArrayList<String>();
        honda.add("civic");
        honda.add("crv");
        honda.add("accord");
        List l = honda;

        con.insertDataFromArrayListToSqlTableforString(l, "Honda", "Col");

        System.out.println(con.readDataBase("Honda", "Col"));

        List<String> toyota = new ArrayList<String>();
        toyota.add("camry");
        toyota.add("corolla");
        toyota.add("rav4");
        List l1 = toyota;

        con.insertDataFromArrayListToSqlTableforString(l1, "Toyota", "Col");

        System.out.println(con.readDataBase("Toyota", "Col"));

        List<String> nissan = new ArrayList<String>();
        nissan.add("altima");
        nissan.add("maxima");
        nissan.add("sentra");
        List l2 = nissan;

        con.insertDataFromArrayListToSqlTableforString(l2, "Nissan", "Col");

        System.out.println(con.readDataBase("Nissan", "Col"));

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        map.put("Honda", honda);
        map.put("Toyota", toyota);
        map.put("Nissan", nissan);
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }


        Iterator itt = map.entrySet().iterator();

        while (itt.hasNext()) {

            Map.Entry pair = (Map.Entry) itt.next();
            System.out.println(pair.getKey() + "" + pair.getValue());
        }


    }
}


