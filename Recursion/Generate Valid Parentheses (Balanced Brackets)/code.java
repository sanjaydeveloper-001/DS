import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur("", 0, 0, n);
    }

    public static void recur(String s, int c1, int c2, int N){
        // Base case
        if(s.length() == N + N){
            System.out.println(s);
            return; 
        }                  

        // Add opening bracket
        if(c1 < N) 
            recur(s + '(', c1 + 1, c2, N);

        // Add closing bracket (only if valid)
        if(c2 < N && c2 < c1) 
            recur(s + ')', c1, c2 + 1, N);
    }
}
