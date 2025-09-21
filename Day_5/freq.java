package Day_5;

import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         int[] freq = new int[256];

         for(int i =0;i<s.length();i++){
             char ch = s.charAt(i);
             if(ch != ' ')
                 freq[ch]++;
         }
         System.out.println();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                System.out.println((char)i + " : " + freq[i]);
        }
    }
}
