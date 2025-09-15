
// Linked List Methods 

import java.io.*;
import java.util.*;
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
    
    // Insertint the element in LinkedList
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
    
    // Printing the LinkedList
    static void dis(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    // Find Mid element in LinkedList
    static int mid(){
        Node slow = head;
        Node fast = head;
        
        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    
    
    // Changing the total LinkedList into Reverse
    static void reverse(){
        Node temp = head;
        Node safety = null;
        Node prev = null;
        
        while(temp != null){
            safety = temp.next;
            temp.next = prev;
            prev = temp;
            temp = safety;
        }       
        head = prev;
    }
    
    // Printing the LinkedList in reverse order
    static void rev(Node root){
        if(root == null) return;
         rev(root.next);
        System.out.print(root.data+" ");
    }
    
    // Delete element in the LinkedList
    static void delete(int d){
        if( head == null ) return;
        if( head.data == d ){
            Node temp = head;
            head = head.next;
            temp.next=null;
        }
        else{
            Node temp = head;
            Node prev = null;
            
            while(temp != null){
                if(temp.data == d){
                    prev.next = temp.next;
                }
                prev = temp;
                temp = temp.next;
            }
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);        
        while(sc.hasNext()){
            int data = sc.nextInt();
            insert(data);
        }
        
        // Write your Code here
        
    }
}
