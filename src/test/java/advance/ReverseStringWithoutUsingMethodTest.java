package advance;

import org.junit.Test;

import static advance.ReverseStringWithoutUsingMethod.reverseString;
import static org.junit.Assert.assertEquals;

public class ReverseStringWithoutUsingMethodTest {

    @Test
    public void whenReverseStringReverseTheStringCorrectlyThenReturnExpectedResults() {
        //hello = olleh,
        String str = "hello";
        String results = reverseString(str);
        assertEquals(results, "olleh");

        //man = nam
        String str0 = "man";
        String results0 = reverseString(str0);
        assertEquals(results0, "nam");

        //boy = yob
        String str1 = "boy";
        String results1 = reverseString(str1);
        assertEquals(results1, "yob");

        String str2 = "Hello friends, do you like this tutorial?";
        String results2 = reverseString(str2);
        assertEquals(results2, "?lairotut siht ekil uoy od ,sdneirf olleH");
    }
}