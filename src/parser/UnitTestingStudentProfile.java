package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {
    public static void main(String[] args) {

        //Apply Unit Test into all the methods in this package.


        XmlReader xm = new XmlReader();
        try {
            String str = xm.convertIntToChar("86");

            Assert.assertEquals(str, "B");
            System.out.println("Test Passed!!!");
        } catch (AssertionError a) {
            System.out.println("Test Fail !!!");
        }

    }
}
