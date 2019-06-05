import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + 1 < n && j + 1 < m) {
                    if (arr[i + 1][j] == arr[i][j + 1]) {
                        if (arr[i + 1][j] == arr[i][j]) {
                            arr[i][j] = -1;
                            count++;
                            continue;
                        }
                    }
                }
                if (i + 1 < n && j - 1 > -1) {
                    if (arr[i][j - 1] == arr[i + 1][j]) {
                        if (arr[i][j - 1] == arr[i][j]) {
                            arr[i][j] = -1;
                            count++;
                            continue;
                        }
                    }
                }
                if (i - 1 > -1 && j + 1 < m) {
                    if (arr[i - 1][j] == arr[i][j + 1]) {
                        if (arr[i - 1][j] == arr[i][j]) {
                            arr[i][j] = -1;
                            count++;
                            continue;
                        }
                    }
                }
                if (i - 1 > -1 && j - 1 > -1) {
                    if (arr[i - 1][j] == arr[i][j - 1]) {
                        if (arr[i - 1][j] == arr[i][j]) {
                            arr[i][j] = -1;
                            count++;
                            continue;
                        }
                    }
                }
                if (i - 1 > -1 && j - 1 > -1 && i + 1 < n && j + 1 < m) {
                    if (arr[i - 1][j] == arr[i + 1][j] && arr[i + 1][j] == arr[i][j + 1] && arr[i][j + 1] == arr[i][j - 1]) {
                        if (arr[i][j] == arr[i - 1][j]) {
                            arr[i][j] = -1;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
