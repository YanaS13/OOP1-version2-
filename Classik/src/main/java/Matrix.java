import java.util.Scanner;
public class Matrix {

    int ii, jj;
    private float[][] value = new float[100][100];
    //
    public void setVallue(int i, int j, float[][] value) {
            this.value = value;
        }

    public void sumMatr(int st,int str, float[][] value, float[][] value1) {
        float[][] res = new float[st][str];
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                res[i][j] = value[i][j] + value1[i][j];
            }
        }
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void myltyMatr(int st,int str, float[][] value, int c) {
        float[][] res = new float[st][str];
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                res[i][j] = value[i][j] * c;
            }
        }
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void writeMatrix(int st,int str, float[][] value) {
        float[][] res = new float[st][str];
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void umnMatrix(int st,int str, float[][] value, float[][] value1) {
        float [][] res = new float[st][str];
        for (int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                res[i][j] = value[i][j] * value1[j][i];
            }
        }

        for(int i = 0; i < st; i++) {
            for (int j = 0; j < str; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Matrix M = new Matrix();
        System.out.println("Введите число столбцов");
        M.ii = in.nextInt();
        System.out.println("Введите число строк");
        M.jj = in.nextInt();
        System.out.println("Введите матрицу");
        for (int i = 0; i < M.ii; i++) {
            for (int j = 0; j < M.ii; j++) {
                M.value[i][j] = in.nextInt();
            }
        }
        System.out.println("Матрица выглядит:");
        M.writeMatrix(M.ii, M.jj, M.value);
        System.out.println();

        System.out.println("Матрица умноженная на 5:");
        M.myltyMatr(M.ii, M.jj, M.value, 5);
        System.out.println();


        M.setVallue(2,2, M.value);
        System.out.println();

        Matrix M1 = new Matrix();

        System.out.println("Введите число столбцов");
        M1.ii = in.nextInt();
        System.out.println("Введите число строк");
        M1.jj = in.nextInt();

        System.out.println("Введите матрицу");
        for (int i = 0; i < M1.ii; i++) {
            for (int j = 0; j < M1.jj; j++) {
                M1.value[i][j] = in.nextInt();
            }
        }
        System.out.println("Перемножение матриц:");
        M.umnMatrix(M.ii, M.jj, M.value, M1.value);
        System.out.println();

        System.out.println("Сумма матриц:");
        M.sumMatr(M.ii, M.jj, M.value, M1.value);
        System.out.println();
    }

}