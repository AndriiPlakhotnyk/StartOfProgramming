package ua.com.alevel.FirstHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// Задача 3
public class Main4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());

            int d = a * 360;
            int e = b * 60;

            int f = Integer.parseInt(reader.readLine());
            int g = Integer.parseInt(reader.readLine());
            int j = Integer.parseInt(reader.readLine());


            int k = f * 360;
            int l = g * 60;

            int T = (k + l + j) - (d + e + c);
                if(d<k||e<l||c<j) {
                    System.out.println("Разница между двумя моментами"+T+"секунд" );
                }

        } catch (IOException e) {

        }
    }
}
