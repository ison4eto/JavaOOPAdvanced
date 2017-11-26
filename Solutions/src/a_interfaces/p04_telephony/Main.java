package a_interfaces.p04_telephony;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartPhone sp = new SmartPhone();
        String[] numbers = scanner.nextLine().split("\\s+");
        String[] URLs = scanner.nextLine().split("\\s+");
        Arrays.stream(numbers).forEach(sp::call);
        Arrays.stream(URLs).forEach(sp::browse);
    }
}
