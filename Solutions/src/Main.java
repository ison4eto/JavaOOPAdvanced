package p01_reflection;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        System.out.println(Reflection.class);
        System.out.println(Reflection.class.getSuperclass());
        Arrays.stream(Reflection.class.getInterfaces()).forEach(System.out::println);
        System.out.println(Reflection.class.newInstance());
    }

}
