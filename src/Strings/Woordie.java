package Strings;

import java.util.Scanner;

public class Woordie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String S = sc.next();
            String G = sc.next();
            char[] M = new char[S.length()];
            for (int i =0; i<S.length(); i++){
                if(S.charAt(i)== G.charAt(i)){
                    M[i]='G';
                }
                else{
                    M[i]='B';
                }
            }
            System.out.println(M);

        }
    }
}
