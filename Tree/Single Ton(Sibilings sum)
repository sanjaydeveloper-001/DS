import java.io.*;
import java.util.*;

class node{
    node right;
    node left;
    int data;
    node(int d){
        data=d;
    }
    
}

public class Solution {

    static node root=null;
    
    
    static void sib(node r){
        if(r==null){
            return;
        }
        if(r.left!=null && r.right==null){
            System.out.print(r.left.data+" ");
        }
        if(r.left==null && r.right!=null){
            System.out.print(r.right.data+" ");
        }
        sib(r.right);
        sib(r.left);
    }
    
    static node BT(){
        Scanner sc=new Scanner(System.in);
        
        int d=sc.nextInt();
        Queue<node> q=new LinkedList<>();       
        node root=new node(d);
        q.add(root);

        while(!q.isEmpty()){
            node t=q.poll();
            d=sc.nextInt();
            if(d!=-1){
                node nn=new node(d);
                t.left=nn;
                q.add(nn);
            }
            d=sc.nextInt();
            if(d!=-1){
                node nn=new node(d);
                t.right=nn;
                q.add(nn);
            }
        }
        return root;
    }
    
    
    public static void main(String[]args){
        node root=BT();
        sib(root);
    }
}
