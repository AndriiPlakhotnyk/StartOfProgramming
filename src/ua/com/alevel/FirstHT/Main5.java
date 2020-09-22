package ua.com.alevel.FirstHT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            int c = Integer.parseInt(reader.readLine());
            if (a==b||b==c){
                System.out.println(2);
            }else if (a==b&&a==c){
                System.out.println(3);
            }else{
                System.out.println(0);
            }
        } catch (IOException e) {

        }
    }
}
