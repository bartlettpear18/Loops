package com.company;
import java.util.ArrayList;

/**
 * Created by Joel.Bartlett18 on 4/11/2017.
 */
public class Exercise1 {
    /**
     * Calculates the sum of all even numbers from 2 to 100.
     * @return integer sum
     */
    public int evenSum() {
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        return sum;
    }

    /**
     * Calculates sum of all squares between 1 and 100.
     * @return integer sum
     */
    public int sumSquares() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i*i;
        }
        return sum;
    }

    /**
     * All powers from 2^0 to 2^20
     * @return array list
     */
    ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> twoPower(int bound) {
        for (int i = 0; i <= bound; i++) {
            double power = Math.pow(2,i);
            int round = (int) Math.round(power);
            list.add(round);
        }
        return list;
    }

    /**
     * Print twoPower Arraylist
     */
    public void twoPowerPrint() {
        list.stream().forEach(System.out::println);
    }

    /**
     * Sum of odds between a and b
     * @param  a and  b
     * @return int sum
     */
    public int sumAB (int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i+=2) {
            sum += i;
        }
        return sum;
    }

    /**
     * Sums odd digits of number
     * @param input
     * @return the sum of odd digits
     */

    public int oddDigits(int input) {
        int sum = 0;
        String number = Integer.toString(input);
        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit%2 == 1) {
                sum += digit;
            }
        }
        return sum;
    }

}
