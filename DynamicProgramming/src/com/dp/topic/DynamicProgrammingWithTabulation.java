package com.dp.topic;

import java.util.Scanner;

public class DynamicProgrammingWithTabulation {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }

        int prev2 = 0; // F(0)
        int prev = 1;  // F(1)

        for (int i = 2; i <= n; i++) {
            int cur = prev + prev2; // F(i) = F(i-1) + F(i-2)
            prev2 = prev;           // shift
            prev = cur;             // shift
        }

        System.out.println(prev); // F(n)

        sc.close();
    }

}
