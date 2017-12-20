package c_iterators.exercise.p01_listiterator;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListyIteratorImp<String> li = null;
        while (true) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[0].equals("END")) {
                break;
            }
            switch (command[0]) {
                case "Create":
                    li = new ListyIteratorImp<>(Arrays.copyOfRange(command, 1, command.length));
                    break;
                case "Move":
                    System.out.println(li.move());
                    break;
                case "HasNext":
                    System.out.println(li.hasNext());
                    break;
                case "Print":
                    try {
                        li.print();
                    } catch (UnsupportedOperationException ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case "PrintAll":
                    li.printAll();
                    break;

                default:
                    System.out.println("Invalid command");
                    break;
            }
        }
    }

}
