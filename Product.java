package com.naaju;
import java.util.ArrayList;
import java.util.Scanner;
public class Product {
        public static void main (String[] args)
        {
            int i = 0;
            ArrayList<String> list = new ArrayList<String>();
            System.out.println("please ! kindly add product to the cart");
            Scanner sc = new Scanner(System.in);
            while (i < 5) {
                list.add(sc.nextLine());
                i++;
            }
            boolean ans = list.contains("apple");
            if (ans) {
                System.out.println("you have added duplicate product");
            } else {
                System.out.println("The product you have added are as follows " + list);
            }
        }
    }




