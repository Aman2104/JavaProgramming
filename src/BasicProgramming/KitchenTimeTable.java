package BasicProgramming;

import java.util.Scanner;

public class KitchenTimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Take User Input In Java

        while(T-->0){
            int n = sc.nextInt();
            int[] students = new int[n] ;
            int[] time = new int[n] ;
            for (int i =0; i<n; i++){
                students[i]= sc.nextInt();
            }
            for (int i =0; i<n; i++){
                time[i]= sc.nextInt();
            }
            int i=1;
            int count=0;
            if(students[0]>=time[0]){
                count ++;
            }
           while(i<n){
                   if(students[i]-students[i-1]>=time[i]){
                       count ++;
                   }
               i++;
           }

           System.out.println(count);
        }
    }
}
