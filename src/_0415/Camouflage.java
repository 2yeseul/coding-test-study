package _0415;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Camouflage {
    public static int solution(String[][] clothes) {
        HashMap<String, Integer> typeAndNumber = new HashMap<>();

        for(String[] str : clothes) {
            if(typeAndNumber.containsKey(str[1])) {
                typeAndNumber.replace(str[1], typeAndNumber.get(str[1]) + 1);
            }
            else
                typeAndNumber.put(str[1], 1);
        }

        int answer = 1;

        for(String key : typeAndNumber.keySet()) {
            int num = typeAndNumber.get(key);
            answer *= (num + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        int answer = solution(clothes);
        System.out.println(answer);
    }
}
