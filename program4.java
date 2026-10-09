// Differentiate String, StringBuffer and StringBuilder. Write a program to perform String related operations using length(), isEmpty(), charAt(), toString(), equals(), compareTo(), contains(), indexOf(), lastIndexOf(), startsWith(), endWith(), matches(), substring(), toLowerCase(), trim(), replace(), split(), join(), and valueOf()
package Assignment1;
import java.util.*;
public class program4 {

	public static void main(String[] args) {
		String s1 = "Java Programming";
        String s2 = "Java Programming";
        String s3 = "Python";
        String s4 = "";
        String s5 = "  Hello Java  ";

        // length()
        System.out.println("Length: " + s1.length());

        // isEmpty()
        System.out.println("Is Empty: " + s4.isEmpty());

        // charAt()
        System.out.println("Character at index 2: " + s1.charAt(2));

        // toString()
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("To String: " + sb.toString());

        // equals()
        System.out.println("Equals: " + s1.equals(s2));

        // compareTo()
        System.out.println("Compare To: " + s1.compareTo(s3));

        // contains()
        System.out.println("Contains Java: " + s1.contains("Java"));

        // indexOf()
        System.out.println("Index Of a: " + s1.indexOf('a'));

        // lastIndexOf()
        System.out.println("Last Index Of a: " + s1.lastIndexOf('a'));

        // startsWith()
        System.out.println("Starts With Java: " + s1.startsWith("Java"));

        // endsWith()
        System.out.println("Ends With ing: " + s1.endsWith("ing"));

        // matches()
        System.out.println("Matches: " + s1.matches("[A-Za-z ]+"));

        // substring()
        System.out.println("Substring: " + s1.substring(0, 4));

        // toLowerCase()
        System.out.println("Lowercase: " + s1.toLowerCase());

        // trim()
        System.out.println("Trim: " + s5.trim());

        // replace()
        System.out.println("Replace: " + s1.replace("Java", "Python"));

        // split()
        String words = "Java,Python,C++";
        String[] arr = words.split(",");
        System.out.println("Split: " + Arrays.toString(arr));

        // join()
        String joined = String.join("-", "Java", "Python", "C++");
        System.out.println("Join: " + joined);

        // valueOf()
        int num = 100;
        String str = String.valueOf(num);
        System.out.println("Value Of: " + str);

	}

}
