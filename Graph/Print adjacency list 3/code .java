import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int time = 0; time<t; time++){
            
            int v = sc.nextInt();
            int e = sc.nextInt();
            
            List<List<Integer>> li = new ArrayList<>();
            for(int i=0; i<v; i++){
                li.add(new ArrayList<>());
            }
            
            for(int i=0; i<e; i++){
                int st = sc.nextInt();
                int ev = sc.nextInt();
                li.get(st).add(ev);
                li.get(ev).add(st);
            }
        
            for(int i=0; i<li.size(); i++){
                System.out.print(i);
                for(int j=0; j<li.get(i).size(); j++){
                    System.out.print("-> "+li.get(i).get(j));
                }
                System.out.println();
            }
        }
    }
}
