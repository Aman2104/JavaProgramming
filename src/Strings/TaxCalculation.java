package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            String S = sc.next();
            boolean flag = false;
            char[] c = S.toCharArray();
            Arrays.sort(c);
            if (c[0] != '1') {
                for (int i = 1; i < c.length; i++) {
                    if (c[i] == '1') {
                        flag = true;
                        break;
                    }

                }
            }
            if (flag){
                System.out.println(Math.min(X,Y));
            }
            else{
                System.out.println(0);
            }
        }
    }
}
