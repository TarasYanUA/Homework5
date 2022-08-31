package tarasYanishevskyi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double variableB = Double.parseDouble(reader.readLine());
        double variableA = Math.sqrt(variableB);
        System.out.println("Squared number is " + variableA);

    }
}
