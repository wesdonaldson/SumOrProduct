package Donaldson.Wesley.SumOrProduct;

import java.util.*;

/**
 * Created by wesleydonaldson on 9/9/16.
 */
public class SumOrProduct {

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a number");
        int a = scanner.nextInt();
        System.out.println("Chose a second number");
        int b = scanner.nextInt();
        System.out.println("Do you want the sum or the product?");
        String choice = scanner.next();
        SumOrProduct sumOrProduct = new SumOrProduct();



        if (choice.equals("sum")) {
            System.out.println(sumOrProduct.sum(a, b));
        } else {
            System.out.println(sumOrProduct.product(a, b));


        }
    }

    public int sum(int x, int y) {

        return x + y;
    }

    public int product(int x, int y) {
        return x * y;
    }
}
