package _0415;

import java.util.Scanner;

// 1부터 자연수 n까지 m개를 고름 - 중복 허용
public class _15651 {

    static StringBuilder stringBuilder;

    static int[] selectd;
    static int n, m;

    static void input() {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        selectd = new int[m+1];
    }

    // m개를 전부 고름 -> 조건에 맞는 탐색 한 가지 성공
    // 고르지 못헸다면 k부터 m까지 원소 선택
    static void func(int k) {
        if(k == m + 1) {
            // selected[1...m] 이 새롭게 탐색된 결과
            for(int i=1; i<=m; i++) stringBuilder.append(selectd[i]).append(' ');
            stringBuilder.append('\n');
        }

        else {
            for(int j=1; j<=n; j++) {
                selectd[k] = j;

                func(k + 1);
                selectd[k] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int totalNum = (int) Math.pow((double) n, (double) m);

        for(int i=0; i<totalNum; i++) {

        }
    }
}
