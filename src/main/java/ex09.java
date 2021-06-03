/*
Exercise 9 - Paint Calculator

Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet. Display the number of gallons needed to paint the ceiling as a whole number.
Example Output

You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.
Constraints

    Use a constant to hold the conversion rate.
    Ensure that you round up to the next whole number.

Challenges

    Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
    Implement support for a round room.
    Implement support for an L-shaped room.
    Implement a mobile version of this app so it can be used at the hardware store.

*/

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner cursor = new Scanner(System.in);


        System.out.print("What is the length? ");
        int l = Integer.parseInt(cursor.nextLine());

        System.out.print("What is the width? ");
        int w = Integer.parseInt(cursor.nextLine());

        int area = l*w;
        int gallons = 350;
        int totalGallons = area / gallons;
        int r = area % gallons;
        if(r!=0){ totalGallons++; }
        System.out.println("You will need to purchase " + totalGallons + " gallons of paint to cover " + area + " square feet.");
    }
}
