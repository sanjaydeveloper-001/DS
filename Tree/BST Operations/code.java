import java.util.*;

class node{
    node left;
    node right;
    int data;
    node(int d){
        data=d;
    }
}

public class Main {
    
    //Deletion
    
    static node del(node r,int d){
        if(r==null)
            return null;
        if(r.data==d){
            if(r.left==null && r.right==null)
                return null;
            if( r.right!=null && r.left==null)
                return r.right;
            else if(r.right==null && r.left!=null)
                return r.left;
            else{
                node t=r.left;
                while(t.right!=null){
                    t=t.right;
                }
                r.data=t.data;
                r.left=del(r.left,t.data);
                return r;
            }
        }
        else if(d< r.data){
             r.left=del(r.left,d);
        }
        else{
             r.right=del(r.right,d);
        }
        return r;
    }
    
    //BST Search
    
    static boolean search(node root,int d){
        
        if(root==null)
            return false;
        if(root.data==d)
            return true;
        if(d < root.data)
            return search(root.left,d);
        else
            return search(root.right,d);
    }
    
    //BST Insertion
    
    static node ins(node root,int d){
        
        if(root==null)
            return new node(d);
        if(root.data >= d)
            root.left=ins(root.left,d);
        else
            root.right=ins(root.right,d);
        return root;
    }
    
    //Display
    static void dis(node r){
        if(r==null)
            return;
        System.out.print(r.data+":");
        if(r.left!=null){
            System.out.print(" L:"+r.left.data+",");
        }
        if(r.right!=null){
            System.out.print(" R:"+r.right.data+",");
        }
        System.out.println();
        dis(r.left);
        dis(r.right);
    }
    
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        node root=null;
        while(sc.hasNext()){
            int ch=sc.nextInt();
            // System.out.print("1-Add , 2-Search , 3-Delete , 4-Display");
            if(ch==1){
                int d=sc.nextInt();
                root=ins(root,d);
            }
            if(ch==2){
                int d=sc.nextInt();
                System.out.println(search(root,d));
            }
            if(ch==3){
                int d=sc.nextInt();
                root=del(root,d);
            }
            if(ch==4){
                dis(root);
            }
        }
    }
}
