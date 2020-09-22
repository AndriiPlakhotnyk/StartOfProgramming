package ua.com.alevel.FirstHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Задача 5
public class Main2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите высоту шеста");
            int h = Integer.parseInt(reader.readLine());
            System.out.println("Введите высоту, пройденую за день");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Введите высоту, на которую спустилась улитка ночью");
            int b = Integer.parseInt(reader.readLine());
            int t = a-b;
            double p = (double)h/t;
            int c = (int)(Math.ceil(p));
            System.out.println("Чтобы добраться до вершины шеста, потребуется " + c + " дней");

        } catch (IOException e) {

        }


    }
}
