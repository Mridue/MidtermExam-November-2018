package string.problems;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


        //Unit test for DuplicateWord
        try {
            Set<String> set = new HashSet<>();
            set.add("Java");
            set.add("is");
            String test = "Java is a programming Language. Java is also an Island of Indonesia";
            Assert.assertEquals(DuplicateWord.duplicateWords(test), set);
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!.");
        }


        //Unit test for LargestWord
        try {
            String a = "ITS A VERY BEAUTIFUL DAY";
            Assert.assertEquals(DetermineLargestWord.largestWord(a), "BEAUTIFUL");
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!.");
        }


        try {//Unit test for anagram
            Assert.assertEquals(Anagram.isAnagram("sat", "tas"), true);
            System.out.println("Test Passed.");
        } catch (AssertionError as) {
            System.out.println("Test Failed!!!!");
        }

        try {//Unit test for palindrome
            String test = "Cricket";
            boolean expected = false;
            Assert.assertEquals(Palindrome.isPalindrome(test), expected);
            System.out.println("Test passed.");
        } catch (AssertionError as) {
            System.out.println("Test failed.");
        }
    }
}
