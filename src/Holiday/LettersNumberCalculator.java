package Holiday;

import java.util.Scanner;

public class LettersNumberCalculator {


    public static String calculate (Scanner input){
        while ( true ) {
            System.out.print("Type here > ");
            String s = input.nextLine();
            int uppers = 0, lowers = 0;

            for ( char c : s.toCharArray() ) {
                if ( Character.isUpperCase(c) )
                    ++uppers;
                else if ( Character.isLowerCase(c) )
                    ++lowers;
            }

            return "UpperCase:"  + uppers + "\nLowerCase:"  + lowers ;
        }

    }

}
