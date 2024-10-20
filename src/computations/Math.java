package computations;

import java.util.Scanner;

public class Math {
    static Scanner sc = new Scanner(System.in);

    public static void findNumberOfDivisorWithInput() {
        System.out.println("Please Enter the number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println("The number of divisors are: " + count);

    }

    public static void findTheGCDOfTwoNumbersWithInput() {
        System.out.println("Please Enter the smallest number: ");
        int num1 = sc.nextInt();
        System.out.println("Please Enter the largest number: ");
        int num2 = sc.nextInt();
        int num = num1;
        int gcd = 1;
        if (num1 > num2) num = num2;

        for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD of the number: " + num1 + " and num2 " + num2 + " is " + gcd);

    }

    public static void checkIfPowerOfTwoWithInput() {
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("The number " + num + " is power of Two");
        } else {
            int tempNum = num;
            while (tempNum != 1) {
                if (tempNum % 2 != 0) {
                    System.out.println("The number " + num + " is not the power of two");
                    return;
                }
                tempNum = tempNum / 2;
            }
            System.out.println("The number " + num + " power of two");
        }


    }


    public static int findNumberOfDivisor(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findTheGCDOfTwoNumbers(int num1, int num2) {
        int num = num1;
        int gcd = 1;
        if (num1 > num2) num = num2;
        for (int i = 1; i <= num; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static boolean checkIfPowerOfNumber(int num, int pow) {
        if (num == 1) {
            return true;
        } else {
            int tempNum = num;
            while (tempNum != 1) {
                if (tempNum % pow != 0) {
                    return false;
                }
                tempNum = tempNum / 2;
            }
            return true;
        }
    }

    public static int powerOfNumber(int num, int pow) {
        int tempNum = num * 1;
        for (int i = 1; i < pow; i++) {
            tempNum = num * tempNum;
        }
        return tempNum;
    }

    public static int checkIfThatIsTheNumber() {
        int i = 1;
        boolean isNum = false;
        while (!isNum) {
            int numDivisor = findNumberOfDivisor(i);
            int cubeDivisor = findNumberOfDivisor(powerOfNumber(i, 3));
            int gcd = findTheGCDOfTwoNumbers(numDivisor, cubeDivisor);
            if (!checkIfPowerOfNumber(gcd, 2)) {
                isNum = true;
                return i;
            }
            i++;
        }
        return 1;
    }


    public static void main(String[] args) {
        //            findNumberOfDivisor();
        //        findTheGCDOfTwoNumbers();
        //checkIfPowerOfTwo();
        //        System.out.println(powerOfNumber(3,2));
        System.out.println(checkIfThatIsTheNumber());
    }
}
