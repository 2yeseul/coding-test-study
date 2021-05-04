package _0504;

import java.util.Scanner;

public class _124World {

    // 자연수만 존재
    // 모든 수를 표현 할 때 => 1, 2, 4 만 사용

    static String solution(int n) {
        // 나머지가 0 일 때 : 4, 1일 때 1, 2일 때 2
        String []nums = {"4", "1", "2"};

        String answer = "";
        while (n != 0) {
            answer = nums[n % 3] + answer;

            if(n % 3 == 0) {
                n = (n / 3) - 1;
            }
            else {
                n /= 3;
            }
        }

        return answer;
    }
}
