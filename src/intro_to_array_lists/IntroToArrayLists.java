package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		String item1 = "hello";
		String item2 = "hallo";
		String item3 = "hola";
		String item4 = "Bonjour";
		String item5 = "Ciao";
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> greetings = new ArrayList<>();
		//2. Add five Strings to your list
		greetings.add(item1);
		greetings.add(item2);
		greetings.add(item3);
		greetings.add(item4);
		greetings.add(item5);
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < greetings.size(); i++) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String x: greetings) {
			System.out.println(x);
		}
		
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < greetings.size(); i+=2) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = greetings.size()-1; i >= 0; i--) {
			System.out.println(greetings.get(i));
		}
		
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.
		for(String x: greetings) {
			if(x.indexOf("e") != -1) {
				System.out.println(x);
			}
		}
	}
}
