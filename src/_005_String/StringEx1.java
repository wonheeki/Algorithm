package _005_String;

import java.util.Scanner;

public class StringEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        System.out.println(str.charAt(num-1));

    }
}
