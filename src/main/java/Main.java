import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in something to analyze it");
        String input = scanner.nextLine();
        if(StringUtils.isNumeric(input)){
            System.out.println("What you entered is a number.");
        }else {
            System.out.println("What you entered is not a number");
            System.out.println("This is your input with the cases flipped");            ;
            System.out.println(StringUtils.swapCase(input));
            System.out.println("This is your input reversed character by character:");
            System.out.println(StringUtils.reverse(input));
        }


    }
}
