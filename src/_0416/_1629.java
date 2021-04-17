package _0416;

import java.util.Scanner;

// 자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성하시오.
public class _1629 {
    static long func(long a, long b, long c) {
        if(b == 1) {
            return a % c;
        }

        long value = func(a, b / 2, c);

        value = value * value % c;

        // b가 짝수일 때, b^2n = b^n * b^n
        if(b % 2 == 0) {
            return value;
        }

        return value * a % c;
    }

    public static void main(String[] args) {
        long a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong(); b = scanner.nextLong(); c = scanner.nextLong();
        long answer = func(a, b, c);
        System.out.println("answer is " + answer);
    }
}
