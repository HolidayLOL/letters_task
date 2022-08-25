package Holiday;
import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.print("Type here > ");
            String s = scanner.nextLine();
            int uppers = 0, lowers = 0;

            for ( char c : s.toCharArray() ) {
                if ( Character.isUpperCase(c) )
                    ++uppers;
                else if ( Character.isLowerCase(c) )
                    ++lowers;
            }
            System.out.println("UpperCase: " + uppers + "\nLowerCase: " + lowers );
        }
    }
}