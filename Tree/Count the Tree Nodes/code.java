import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    Node right;
    Node left;
    int data;
    
    Node(int d){
        this.data = d;
        this.right = null;
        this.left = null;
    }
}

public class Solution {
    
    static Node root;

    //Creation
    static void creation(){
        
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Queue<Node> que = new LinkedList<>();
        root = new Node(d);
        que.add(root);

        while(!que.isEmpty()){
            Node temp = que.poll();
            d = sc.nextInt();
            
            if(d != -1){
                Node nn = new Node(d);
                temp.left = nn;
                que.add(temp.left);
            }
            d = sc.nextInt();
            if(d != -1){
                Node nn = new Node(d);
                temp.right = nn;
                que.add(temp.right);
            }
        }
    }

  //Count
    static int count(Node root){
        if(root == null) return 0;
        return 1+ count(root.left) + count(root.right);
    }

    // main funtion
    public static void main(String[] args) {
        creation();
        System.out.print(count(root));
    }
        
}
