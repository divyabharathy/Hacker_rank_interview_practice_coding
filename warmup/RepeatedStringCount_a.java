import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
    //My code starts
        long sol=0;
        int t=(int)(n%s.length());
        long m=n/s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                sol++;
            }
        }
        sol=sol*m;
        for(int i=0;i<t;i++)
        {
            if(s.charAt(i)=='a')
            {
                sol++;
            }
        }
        return sol;
        //My code ends
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
