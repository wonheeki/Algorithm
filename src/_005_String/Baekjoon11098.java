package _005_String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon11098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        List<String> player = new ArrayList<>();
//        List<Player> player = new ArrayList<>();
        for(int i =0;i<test_case;i++){
            int count = sc.nextInt();
            int pri = 0;
            String topPlayer ="";
            for(int j =0;j<count;j++){
                int price =sc.nextInt();
                String name = sc.next();
                if(pri==0){
                    pri = price;
                    topPlayer=name;
                }else if(price>pri){
                    pri = price;
                    topPlayer=name;
                }

            }
            player.add(topPlayer);
        }
        for(String p : player){
            System.out.println(p);
        }
    }
}
