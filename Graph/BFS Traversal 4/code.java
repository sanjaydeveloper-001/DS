import java.io.*;
import java.util.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] arr = new int[v][v];

        for (int i=0; i<e; i++) {
            int st = sc.nextInt();
            int ev = sc.nextInt();
            arr[st][ev] = 1;
            arr[ev][st] = 1;
        }

        boolean[] vis = new boolean[v];
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        vis[0] = true;
        while (!que.isEmpty()) {
            int d = que.poll();
            System.out.print(d+" ");

            for (int i=0; i<v; i++) {
                if (arr[d][i] == 1 && !vis[i]) {
                    que.add(i);
                    vis[i] = true;
                }
            }
        }
    }
}
