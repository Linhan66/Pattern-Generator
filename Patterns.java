//
// Class author: Linhan
// Date created: 10/29/25
// General description: Creates different patterns based on user input
//
import java.util.Scanner;
public class Patterns {

    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many row do you want the stars be?");
        stars(scan.nextInt());
        System.out.println("How many row do you want the triangle be?");
        triangle(scan.nextInt());
        System.out.println("How many row do you want the odd be?");
        reverseodd(scan.nextInt());
        System.out.println("What is the MAXE");
        EO(scan.nextInt());
        System.out.println("How many row do you want the pyramid to be?");
        pyramid(scan.nextInt());
    }
//
// Pre-condition: Input a positive number
// Post-condition: Prints a right triangle of stars
//
    public static void stars(int stars){
        int i = 0;
        String star = "*";
        while(i < stars){
            System.out.println(star);
            star = star + "*";
            i++;
        }
    }
//
// Pre-condition: Input a positive number
// Post-condition: Prints a triangle of repeated numbers
//
    public static void triangle(int triangle){
    int i = 1;
    while(i <= triangle){
        String row = "";
        int count = 0;
        while(count < i){
            row += i;
            count++;
        }
        System.out.println(row);
        i++;
    }
}
//
// Pre-condition: Input a positive number
// Post-condition: Prints decreasing odd number rows
//
    public static void reverseodd(int reverse){
            for(int triangle = reverse; triangle >= 0; triangle = triangle - 2){
                String odd = String.valueOf(triangle);
                String add;
                for(int i = triangle; i > 0; i--){
                    if(i == triangle){
                    }else{add = String.valueOf(triangle);
                    odd = odd + add;}
                    
                }
                System.out.println(odd);
        }       
    } 
    //
// Pre-condition: Input any integer
// Post-condition: Prints alternating O/E diamond pattern
//
     public static void EO(int MaxE) {
        // Determine if the input number is even or odd
        boolean isEven = (MaxE % 2 == 0);
        
        // Calculate the maximum length (peak row)
        int maxLength;
        if (isEven) {
            maxLength = MaxE;  // For even numbers, peak at the input number
        } else {
            maxLength = MaxE;  // For odd numbers, peak at input+2
        }
        
        // Total number of rows = 2 * maxLength - 1
        int totalRows = 2 * maxLength - 1;
        
        // Generate the pattern
        for (int row = 1; row <= totalRows; row++) {
            // Calculate current row length
            int length;
            if (row <= maxLength) {
                length = row;  // Ascending part
            } else {
                length = 2 * maxLength - row;  // Descending part
            }
            
            // Determine character for this row
            char currentChar;
            if (isEven) {
                // Even input: O starts on odd rows, E on even rows
                if (row % 2 == 1) {
                    currentChar = 'O';
                } else {
                    currentChar = 'E';
                }
            } else {
                // Odd input: E starts on odd rows, O on even rows
                if (row % 2 == 1) {
                    currentChar = 'E';
                } else {
                    currentChar = 'O';
                }
            }
            
            // Create and print the row
            String rowString = "";
            for (int i = 0; i < length; i++) {
                rowString += currentChar;
            }
            System.out.println(rowString);
        }
        
    }
    //
// Pre-condition: Input a positive number
// Post-condition: Prints inverted number pyramid
//
    public static void pyramid(int rows) {
    for (int i = 1; i <= rows; i++) {
        // Calculate how many times to repeat the number
        int repeats = 2 * (rows - i + 1) - 1;
        String row = "";
        for (int j = 0; j < repeats; j++) {
            row += i;
        }
        System.out.println(row);
    }
    }
}


