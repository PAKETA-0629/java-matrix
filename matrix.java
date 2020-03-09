import java.util.Scanner;

public class matrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int[][] array = new int[num][num];
        int lastIndex = array.length - 1;
        for (int i = 0; i <=num/2; i++) {
            for (int j = 0; j <= i; j++) {
                array[i][j] = 1;
                array[i][lastIndex - j] = 1;
                array[lastIndex - i][j] = 1;
                array[lastIndex - i][lastIndex - j] = 1;
            }
        }

        for (int k = 0; k<num; k++) {
            for (int y = 0; y<num; y++) {
                System.out.print(array[k][y] + " ");
            }
            System.out.println();
        }
    }
}
