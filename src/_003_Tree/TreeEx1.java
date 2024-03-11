package _003_Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node1{
    char value;
    Node1 left;
     Node1 right;

     public Node1(char value){
         this.value = value;
         this.left = null;
         this.right=null;
     }
}
public class TreeEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Node1[] tree = new Node1[n+1];

        for(int i =0;i<n;i++){

        }
    }
}
