import java.io.*;
import java.util.*;

public class Solution {
    static int arr[][];
    static int v;
    static int e;
    static int tar;
    static boolean vis[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        v = sc.nextInt();
        e = sc.nextInt();
        arr = new int [v][v];
        
        for(int i=0; i<e; i++){
            int st = sc.nextInt();
            int en = sc.nextInt();
            arr[st][en] = 1;
            arr[en][st] = 1;
        }
        int srt = sc.nextInt();
        tar = sc.nextInt();
        
        vis = new boolean[v];
        
    if(dfs(srt)) 
        System.out.print("There is a path from "+srt+" to "+tar);
    else 
        System.out.print("There is no path from "+srt+" to "+tar);
    
    }
    public static boolean dfs(int srt){
        if(srt == tar)
            return true;
        
        vis[srt] = true;
        for(int i=0; i<v; i++){
            if(arr[srt][i] == 1 && !vis[i]){
                if(dfs(i)) return true;
            }
        }
        return false;
    }
    
}
