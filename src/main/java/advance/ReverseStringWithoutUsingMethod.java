package advance;

/**
 * 1. Write a Java program that reverse a string without using the reverse method of Java’s String class
 * example : hello = olleh, man = nam, boy = yob
 */
public class ReverseStringWithoutUsingMethod {

    public static String reverseString(String name){

        StringBuilder nameRev = new StringBuilder();

        for (int i = name.length() - 1 ; i >= 0; i --){
            nameRev.append(name.charAt(i));
        }
        return nameRev.toString();
    }
}
