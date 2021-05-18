import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> list = new ArrayList<String>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];

            String emailID = firstMultipleInput[1];
            
            String regExPattern = "[a-z].@gmail.com";

            Pattern p = Pattern.compile(regExPattern);
            Matcher m = p.matcher(emailID);
            if (m.find()) {
                list.add(firstName);
            }

        }
        
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }

        bufferedReader.close();
    }
}
