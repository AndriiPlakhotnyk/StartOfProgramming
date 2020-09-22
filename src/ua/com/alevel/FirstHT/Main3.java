package ua.com.alevel.FirstHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Задача 7
public class Main3 {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите координаты ладьи");
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            if (a>0&&a<8&&b>0&&b<8) {
                System.out.println("Введите координаты другой фигуры");
                int c = Integer.parseInt(reader.readLine());
                int d = Integer.parseInt(reader.readLine());
                if (c >= 1 && c <= 8 && d >= 1 && d <= 8) {
                    if (a == c || b == d) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("Введите координаты от 1 до 8");
                }
            }else{
                System.out.println("Введены неправильные координаты");
            }


        }catch(IOException e ){

        }

    }
}
