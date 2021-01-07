package Two_Stones;

import java.util.Scanner;

public class twoStones {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
    
        System.out.println((x % 2 != 0) ? "Alice" : "Bob");
        in.close();
    }
}
