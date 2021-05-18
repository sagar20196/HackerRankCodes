import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String actualDate = sc.nextLine();
        String expectedDate = sc.nextLine();
        sc.close();
        int fine = 0;
        String[] dateDetail = actualDate.split(" ");
        String[] eDetail = expectedDate.split(" ");

        int aDate = Integer.parseInt(dateDetail[0]);
        int aMonth = Integer.parseInt(dateDetail[1]);
        int ayear = Integer.parseInt(dateDetail[2]);

        int eDate = Integer.parseInt(eDetail[0]);
        int eMonth = Integer.parseInt(eDetail[1]);
        int eYear = Integer.parseInt(eDetail[2]);

        if (ayear > eYear) {
            fine = 10000;
        } else if (ayear == eYear && aMonth > eMonth) {
            fine = 500 * (aMonth - eMonth);
        } else if (ayear == eYear && aMonth == eMonth && aDate > eDate) {
            fine = 15 * (aDate - eDate);
        }
        System.out.println(fine);
        
        
    }
}
