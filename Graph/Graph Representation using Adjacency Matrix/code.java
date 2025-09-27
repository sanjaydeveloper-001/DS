import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();
        int e = sc.nextInt();
        int arr[][] = new int[v][v];
        String direct = sc.next();
        
        for(int i=0; i<e; i++){
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            int w = sc.nextInt();
            
            arr[sv][ev] = w;
            if(direct.equals("no"))arr[ev][sv] = w;
        }
        
        for(int i=0; i<v; i++){
            for(int j=0; j<v; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
