import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
    int data;
    Node next;
    
    Node(int d){
        this.data = d;
        this.next = null;
    }
}

public class Solution {
    
    static Node head = null;
    static Node tail = null;
    
    static void insert(int d){
        Node nn = new Node(d);
        if( head == null){ 
            head = nn; 
            tail = nn; 
        }
        else{ 
            tail.next = nn; 
            tail = nn; 
        }
    }
    
    static void dis(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
    }
    
    static void mid(){
        Node slow = head;
        Node fast = head;
        
        while(fast !=null && fast.next !=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.print(slow.data);        
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> li = new ArrayList<>();
        while(sc.hasNext()){
            int d = sc.nextInt();
            if(!li.contains(d)){
                li.add(d);
                insert(d);
            }
        }
        dis();
        System.out.println();
        mid();
        sc.close();
    }
}


