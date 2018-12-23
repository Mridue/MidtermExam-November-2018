package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> honda = new ArrayList<String>();
		honda.add("civic");
		honda.add("crv");
		honda.add("accord");
		List<String> toyota = new ArrayList<String>();
		toyota.add("camry");
		toyota.add("corolla");
		toyota.add("rav4");
		List<String> nissan = new ArrayList<String>();
		nissan.add("altima");
		nissan.add("maxima");
		nissan.add("sentra");
		Map<String, List<String>> map= new HashMap<String ,List<String> >();

		map.put("Honda", honda);
		map.put("Toyota", toyota);
		map.put("Nissan", nissan);

				for(Map.Entry e: map.entrySet()){ System.out.println(e.getKey()+" "+ e.getValue());}
			}


	}


