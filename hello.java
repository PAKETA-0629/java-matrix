import java.util.Scanner;

public class hello {
    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of matrix: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a number of matrix: ");
        int num2 = scan.nextInt();
        int x = 1;
        int[][] result = matrix(num1, num2, x);
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                if (result[i][j] / 10 == 0){
                    System.out.print(result[i][j] + "  ");
                } else {
                    System.out.print(result[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] matrix(int num1, int num2, int start){
        int [][] array = new int[num1][num2];
        num1-=1;
        num2-=1;
        int counter = 0;

        for (int j = num1; j>=0; j-=2) {
            for (int i = counter; i <= num2 - counter; i++) {
                array[counter][i] = start;
                start += 1;
            }
            for (int i = counter + 1; i <= num1 - counter; i++) {
                array[i][num1-counter] = start;
                start += 1;
            }
            for (int i = num2 - counter - 1; i >= counter; i--) {
                array[num1-counter][i] = start;
                start += 1;
            }
            for (int i = num1 - counter - 1; i >= counter + 1; i--) {
                array[i][counter] = start;
                start += 1;
            }
            counter += 1;
        }
        return array;
    }
}