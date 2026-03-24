import java.io.*;
import java.util.*;

class Node{
    int d;
    List<Node> li;
    Node(int d){
        this.d = d;
        this.li = new ArrayList<>();
    }
}

public class Solution {
    
    public static int sum(Node root){
        if(root == null) return 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        
        int sum = 0;
        sum += root.d;
        while(!que.isEmpty()){
            Node temp = que.poll();
            for(Node i: temp.li){
                sum += i.d;
                que.add(i);
            }   
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Node> que = new LinkedList<>();
        Node root = new Node(sc.nextInt());
        que.add(root);
        
        while(!que.isEmpty()){
            Node temp = que.poll();
            int size = sc.nextInt();
            while(size-- > 0){
                Node nn = new Node(sc.nextInt());
                temp.li.add(nn);
                que.add(nn);
            }
        }
        System.out.println(sum(root));
        dis(root);
    }
    
    public static void dis(Node root){
        if(root == null) return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        System.out.print(root.d+" ");
        while(!que.isEmpty()){
            Node temp = que.poll();
            for(Node i: temp.li){
                System.out.print(i.d+" ");
                que.add(i);
            }   
        }
    }
    
    
}
