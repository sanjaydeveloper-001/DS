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
        }
        
        for(int i=0; i<n; i++){
            min = Math.min(arr[i] , min);
            max = Math.max(arr[i] , max);
        }
        
        if(min > 0){
            min = 0;
        }
        else{
            min= min * -1;
        }
    
        int fre[] = new int[min+max+1];        
        for(int i=0; i<n; i++){
            fre[arr[i]+min]++;
        }
        
        // Create a infinite loop without range while(true) ;
        // After set the Frequency, Traverse a frequency array and take the max element and max index
        // Again Traverse the Frequency array adn print the max index;
        
        
        while(true){
            int fmax = 0;
            int maxI = 0;
             for(int i = 0; i< min+max+1 ; i++){
                if( fmax < fre[i] ){
                    fmax = fre[i];
                    maxI = i;
                }
            }
            if(fmax == 0)
                break;
            for(int i=0;i<fmax ; i++){
                System.out.print(maxI-min+" ");
            }
            fre[maxI] = 0;
        }
        
        
        
        
        
    }
}
