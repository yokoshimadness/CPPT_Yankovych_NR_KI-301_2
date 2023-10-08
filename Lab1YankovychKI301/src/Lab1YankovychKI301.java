import java.io.*;
import java.util.*;
/**
 * Клас Lab1YankovychKI301 реалізує програму для лабораторної №1
 * @author Yankovych Nazariy
 * @version 1.7
 */

public class Lab1YankovychKI301 {
    /**
     * Статичний метод main є точкою входу в програму
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("res.txt");
        PrintWriter fout = new PrintWriter("res.txt");
        // Введення розміру матриці
        System.out.print("ВВедіть розмір матриці: ");
        nRows = in.nextInt();
        in.nextLine();  
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
               arr[i] = new char[nRows];
          }
    
        // Введення символу-заповнювача
        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        // Перевірка корректності введення символу-заповнювача
        if (filler.length() != 1) {
            System.out.println("Помилка");
            System.exit(0);
        }
 // Заповнюємо матрицю символами
 for (int i = 0; i < nRows; i++) {
    for (int j = 0; j < nRows; j++) {
        if (j <= i && j + i < nRows || j >= i && j + i >= nRows - 1) {
            arr[i][j] = filler.charAt(0);
        } else {
            arr[i][j] = ' ';
        }
        fout.print(arr[i][j] + " "); // Записуємо символ у файл
    }
    fout.println(); // Перехід на наступний рядок у файлі
}

        for (int i = 0; i < nRows; i++) {
            for(int j = 0; j < nRows; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        fout.flush();
        fout.close();

    }
}
