
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    Node next;
    int data;
    
    Node(int d){
        this.data = d;
        this.next =null;
    }
}

public class Solution {
    
    static Node head = null;
    static Node tail = null;
    
    static void insert(int d){
        if(d == -1) return;
        Node nn = new Node(d);
        if(head == null ){
            head = nn;
            tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
    }
    
    static void dis(){
        Node t = head;
        while(t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
            int d = sc.nextInt();
            if(i%2 != 0){
                insert(d);
            }
            i++;
        }
        dis(); 
    }
}
