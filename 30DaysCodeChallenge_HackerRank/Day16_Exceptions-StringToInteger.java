import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Throwable;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        
        try
        {
            int n;
            n = Integer.parseInt(S);
            System.out.println(n);
        }
        catch(Exception e)
        {
            System.out.println("Bad String");
        }
        
    }
}
