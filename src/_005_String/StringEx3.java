package _005_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
        int count = sc.nextInt();
        for(int i =0;i<count;i++){
            int num  = sc.nextInt();
            String str = sc.next();
            String temp = "";
            for(int j =0;j<str.length();j++){

                for(int k =0;k<num;k++){
                    temp+=str.charAt(j);
                }
            }
            arr.add(temp);

        }
        for(String a: arr){
            System.out.println(a);
        }
    }
}
