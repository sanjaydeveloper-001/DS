import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int [n];
        
        int min = 100;
        int max = -100;
        
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            min = Math.min(arr[i] , min);
            max = Math.max(arr[i] , max);
        }
        
        if(min > 0){
            min = 0;
        }
    
        int fre[] = new int[(min*-1)+max+1];
        
        for(int i=0; i<n; i++){
            fre[arr[i]+(min*-1)]++;
        }
        
        for(int i=0; i<(min*-1)+max+1; i++){
            if(fre[i]!=0){
                System.out.println(i+min+" - "+fre[i]);
            }
        }
        
        
    }
}
