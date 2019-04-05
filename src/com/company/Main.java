package com.company;

public class Main {

    private static final String INVALID = "Invalid Value";

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);


    }

    private static void numberToWords(int number) {
        if (number < 0)
            System.out.println(INVALID);

        int lastDigit = 0;
        int numberReverse = reverse(number);
        int numberReverseDigitCount = getDigitCount(numberReverse);

        while (numberReverse > 0) {
            lastDigit = numberReverse % 10;
            numberReverse /= 10;

            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.println(INVALID);
            }
        }

        if (getDigitCount(number) != numberReverseDigitCount) {

            for (int i = (getDigitCount(number) - numberReverseDigitCount); i > 0; i--) {
                System.out.print("Zero ");
            }
        }
        System.out.print("\n");
  }

    private static int reverse(int number) {

        int numberReversed = 0;

        do {
            numberReversed += number % 10;
            if (number > 9 || number < -9)
                numberReversed *= 10;
            number /= 10;

        } while (number != 0);

        return numberReversed;
    }


    private static int getDigitCount(int number) {
        if (number < 0)
            return -1;

        int digitCount = 0;

        if (number == 0) {
            return 1;
        } else {
            for (int i = number; i > 0; i /= 10) {
                digitCount++;
            }
        }
        return digitCount;
    }
}
