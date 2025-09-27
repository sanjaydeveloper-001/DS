import java.io.*;
import java.util.*;

public class Solution {
    
    static int v;
    static int e;
    static boolean vis[];
    static int arr[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        v = sc.nextInt();
        e = sc.nextInt();
        vis = new boolean[v];
        arr = new int[v][v];
        
        for(int i=0; i<e; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int w = sc.nextInt();
            
            arr[s][e] = w;
            arr[e][s] = w;
        }
        
        fun();
    }
    
    public static void fun(){
        
        vis[0] = true;
        for(int i=0; i<v-1; i++){
            int min = Integer.MAX_VALUE;
            int vs = 0;
            int ve = 0;
            for(int st=0; st<v; st++){
                if(vis[st]){
                    for(int en=0; en<v; en++){
                        if(arr[st][en] > 0 && !vis[en] && arr[st][en] < min){
                            min = arr[st][en];
                            vs = st;
                            ve = en;
                        }
                    }
                }
            }
            System.out.println(vs+" "+ve+" "+min);
            vis[ve] = true;
        }
    }
}
