package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
ArrayList<String> strings = new ArrayList<String>();
        // 2. Add five Strings to your list
strings.add("potato");
strings.add("zde");
strings.add(")))");
strings.add("esfhljksde");
strings.add("tomatoee");
        // 3. Print all the Strings using a standard for-loop
for (int i = 0; i < strings.size(); i++) {
	System.out.println(strings.get(i));
}
System.out.println("\n");
        // 4. Print all the Strings using a for-each loop
for (String s: strings) {
	System.out.println(s);
}
System.out.println("\n");
        // 5. Print only the even numbered elements in the list.
for (int i = 0; i < strings.size(); i+=2) {
	System.out.println(strings.get(i));
}
System.out.println("\n");
        // 6. Print all the Strings in reverse order.
for (int i = strings.size() - 1; i >= 0; i--) {
	System.out.println(strings.get(i));
}
System.out.println("\n");
        // 7. Print only the Strings that have the letter 'e' in them.
        for (String s: strings) {
        	for (int i = 0; i < s.length(); i++) {
        		if (s.charAt(i)=='e') {
        			System.out.println(s);
        			break;
        		}
        	}
        }
    }
}
