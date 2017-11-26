package b_generics.exercises.p01_box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Double> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Double line = Double.parseDouble(reader.readLine());
            strings.add(line);
        }
        System.out.println(Box.countGreaterValues(strings, Double.parseDouble(reader.readLine())));
    }
}
