import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][][] test = new int[4][4][4];
        Random random = new Random();
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    test[i][j][k] = random.nextInt(10, 100);
                }
            }
        }
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    System.out.print(test[i][j][k] + "   ");
                }
                System.out.println();
            }
        }
        System.out.print("Enter number: ");
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                for (int k = 0; k < test[i][j].length; k++) {
                    test[i][j][k] += n;
                }
            }
        }System.out.println(Arrays.deepToString(test));
    }
}