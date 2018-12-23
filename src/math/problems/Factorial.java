package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {


        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        public static int factorial(int f) {
            if(f==0) {return 1;}else { return f*factorial(f-1);}


        }

        public static void main(String[] args) {

            int n = 10;
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = result * i;

            }

            System.out.println(result);
            System.out.println(factorial(10));





        }
}
