package BasicProgramming;

import java.util.Arrays;

public class DataTypes {
public static void main(String[] args) {
// 1. int :- Represents integer values
    int a = 5;
    System.out.println(a);

// 2. float/double :- Represents Floating point numbers
    float b = 5.3F;
    double c = 3.5;
    System.out.println(b+" "+ c);

// 3. char :- Represents a single character
    char d = 'd';
    System.out.println(d);

// 4. String :- Represents sequence of characters
    String str ="Hello Programmers";
    System.out.println(str);

// 5. Array :- Represents a collection of elements of the same data type
    int[] arr = new int[5];// initialise array of size 5 with all zeroes
    int[] arr1 = {1,2,3,4,5};
    for(int i:arr){
        System.out.print(i +" ");
    }
    System.out.println("\n"+ Arrays.toString(arr1));

}
}
