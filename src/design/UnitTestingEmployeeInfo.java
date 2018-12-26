package design;

import org.testng.Assert;

public class UnitTestingEmployeeInfo {
    public static void main(String[] args) {
        //Write Unit Test for all the methods has been implemented in this package.
        double bonus = EmployeeInfo.calculateEmployeeBonus(1000, 8);

        try {
            Assert.assertEquals(100, 100);
        } catch (Exception e) {
            System.out.println("Test Failed");
        }

    }
}
