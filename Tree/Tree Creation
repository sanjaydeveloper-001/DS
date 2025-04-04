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
    
    static void dis(node nn){
        Queue<node> q=new LinkedList<>();
        q.add(nn);
        while(!q.isEmpty()){
            node t=q.poll();
            System.out.print(t.data+" ");
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null){
                q.add(t.right);
            }
        }
    }
    
    static node treeCreation(){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        Queue<node> q=new LinkedList<>();
        node root=new node(d);
        q.add(root);
        int i=1;
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
    
    public static void main(String[] args) {
        node root=treeCreation();
        dis(root);
    }
}
