package ua.com.alevel.FirstHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Задача 4
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите расстояние пройденное в день");
            int n = Integer.parseInt(reader.readLine());
            System.out.println("Введите расстояние маршрута");
            int m = Integer.parseInt(reader.readLine());
            double t = (double) m / n;
            int y = (int) (Math.ceil(t));
            System.out.println("Потраченное колличество дней: " + y);
        } catch (IOException e) {

        }

    }
}

