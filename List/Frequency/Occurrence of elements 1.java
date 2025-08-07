import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int [n];
        int max = -1;
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            max = Math.max(arr[i] , max);
        }
        int fre[] = new int[max+1];
        
        for(int i=0; i<n; i++){
            fre[arr[i]]++;
        }
        
        for(int i=0; i<max+1; i++){
            if(fre[i] != 0){
                System.out.print(fre[i]+" ");
            }
        }
        
        
    }
}
