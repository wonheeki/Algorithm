package _005_String;

import java.util.Scanner;

public class StringEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count =0;
        String []  arr= str.split(" ");
        for(String a : arr){
            if(!a.equals("")){
                count++;
            }
            System.out.println(a);

        }
        System.out.println(count);
    }
}
