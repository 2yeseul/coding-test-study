package _0414;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhoneBook {
    public static boolean solution(String[] phoneBook) {

        Arrays.sort(phoneBook);

        for(int i=0;i<phoneBook.length-1;i++) {
            for(int j=i+1;j<phoneBook.length;j++) {
                String phone1 = phoneBook[i]; String phone2 = phoneBook[j];
                if(phone1.startsWith(phone2)) return false;
                if(phone2.startsWith(phone1)) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] p = {"97674223","119", "1195524421"};
        boolean answer = solution(p);

        System.out.println(answer);
    }
}
