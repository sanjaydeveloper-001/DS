// "static void main" must be defined in a public class.
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}

class DLL {
    Node head = null;
    Node tail = null;

    void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            nn.prev = tail;
            tail = nn;
        }
    }
    public void delete(int data){
        if(head==null){
            return;
        }
        if(head.data==data){
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        else{
            Node temp=head;
            Node prev=null;
            while(temp!=null){
                if(temp.data==data){
                    prev.next=temp.next;
                }
                prev=temp;
                temp=temp.next;
            }
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        DLL l = new DLL();
        while (z.hasNextInt()) {
            int d = z.nextInt();
            l.insert(d);
        }
        l.display();
    }
}
