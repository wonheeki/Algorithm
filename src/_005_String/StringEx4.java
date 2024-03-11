package _005_String;

import java.util.Scanner;

public class StringEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        if(num1.length()!=3 || num2.length()!=3){
            return;
        }
        String no1 ="";
        String no2 ="";
        for(int i =2;i>=0;i--){
            no1+=num1.charAt(i);
            no2+=num2.charAt(i);
        }
        if(Integer.parseInt(no1)>Integer.parseInt(no2)){
            System.out.println(no1);
        }else{
            System.out.println(no2);
        }
    }
}
