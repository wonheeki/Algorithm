package _002_Queue;

import java.util.*;
import java.util.Queue;

public class LastQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=n;i++){
            queue.offer(i);
        }
        List<Integer> qList = new ArrayList<>();
        for(int i =0;i<n-1;i++){
            qList.add(queue.remove());
            queue.offer(queue.remove());
        }
        for(Integer i :qList){
            System.out.print(i+" ");
        }
        System.out.print(queue.peek());
    }
}
