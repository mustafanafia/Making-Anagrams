import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {

        int count = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if(s.charAt(i) == s.charAt(i+1)){
                count++;

            }

        }
        return count;

    }



  int makingAnagrams(String s1, String s2) {

    int[] c = new int[26];
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    for (int i = 0; i < s1.length(); i++) {
      c[s1.charAt(i) - 'a']++;
    }

    for (int i = 0; i < s2.length(); i++) {
      c[s2.charAt(i) - 'a']--;
    }

    int total = 0;
    for (int i : c) {
      total += Math.abs(i);
    }

    return total;
  }

}





public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
