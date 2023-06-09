package Strings;

import java.util.Scanner;

public class TennisMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while(T-->0){
            String str= sc.next();
            int ones=0;
            int zeros=0;
            for (int i = 0; i < str.length()-1; i++) {
                if(str.charAt(i)=='1'){
                    ones++;
                }
                else{
                    zeros++;
                }
            }
            if(ones>zeros){
                System.out.println("WON");
            }
            else if(zeros==11){
                System.out.println("LOSE");
            }
        }
    }
}
