package BasicProgramming;

import java.util.Scanner;

public class Good_Turn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Take User Input In Java

        while(T-->0){
         int x= sc.nextInt();
         int y = sc.nextInt();
         if(x+y>6){
             System.out.println("Yes");
         }
         else{
             System.out.println("No");
         }
        }
    }
}
