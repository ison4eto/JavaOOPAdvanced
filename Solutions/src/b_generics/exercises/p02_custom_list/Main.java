package b_generics.exercises.p02_custom_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> list = new CustomList<>();
        while (true) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (tokens[0].equalsIgnoreCase("end")) {
                break;
            }
            switch (tokens[0]) {
                case "Add":
                    list.add(tokens[1]);

                    break;
                case "Remove":
                    list.remove(Integer.parseInt(tokens[1]));

                    break;
                case "Contains":
                    System.out.println(list.contains(tokens[1]));
                    break;
                case "Swap":
                    list.swap(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));

                    break;
                case "Greater":
                    System.out.println(list.countGreaterThan(tokens[1]));
                    break;
                case "Max":
                    System.out.println(list.getMin());
                    break;
                case "Min":
                    System.out.println(list.getMax());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                default:
                    break;
            }
        }

    }
}
