package _0414;

import java.util.*;

public class PhoneBook {
    public static boolean solution(String[] phoneBook) {
        HashMap<String, String> phoneMap = new HashMap<>();
        for(String num : phoneBook)
            phoneMap.put(num, num);

        for(String number : phoneBook) {
            for(int i=0; i<number.length();i++) {
                if(phoneMap.containsKey(number.substring(0, i))) return false;
            }
        }

        return true;
    }

}
