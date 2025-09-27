import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        
        int arr[][] = new int[v][v];
        for(int i=0; i<e; i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            arr[sv][ev] = 1;
            arr[ev][sv] = 1;
        }
        boolean vis[] = new boolean[v];
        dfs(arr, 0, vis, v);
    }
    public static void dfs(int arr[][], int st, boolean[] vis, int v){
        if(!vis[st]){
            System.out.print(st+" ");
            vis[st] = true;
            for(int i=0; i<v; i++){
                if(arr[st][i] == 1 && !vis[i]) dfs(arr, i, vis, v);
            }
        }
    }
}
