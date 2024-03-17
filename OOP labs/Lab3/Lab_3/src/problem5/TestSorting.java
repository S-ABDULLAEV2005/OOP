package problem5;

import java.util.Arrays;

public class TestSorting {
    public static void main(String[] args) {
        // Test sorting of Chocolates
        Chocolate[] chocolates = {
                new Chocolate(150, "Twix"),
                new Chocolate(120, "KitKat"),
                new Chocolate(200, "Snickers")
        };

        System.out.println("Before sorting chocolates:");
        System.out.println(Arrays.toString(chocolates));

        Sort.bubbleSort(chocolates);

        System.out.println("\nAfter sorting chocolates by weight:");
        System.out.println(Arrays.toString(chocolates));

        // Test sorting of Times
        Time[] times = {
                new Time(12, 30),
                new Time(9, 45),
                new Time(15, 15)
        };

        System.out.println("\nBefore sorting times:");
        System.out.println(Arrays.toString(times));

        Sort.bubbleSort(times);

        System.out.println("\nAfter sorting times:");
        System.out.println(Arrays.toString(times));

        // You can extend this test for sorting employees as well
    }
}