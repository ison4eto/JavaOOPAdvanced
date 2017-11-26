package b_generics.exercises.p01_box;

import java.util.Collections;
import java.util.List;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }
    public static <T> void swap(List<T> list, int i, int j) {
        Collections.swap(list, i, j);
    }

    @Override
    public String toString() {
        return this.value.getClass().getCanonicalName() +
                ": "+
                this.value;
    }
    public static <T extends Comparable<T>> int countGreaterValues(List<T> list, T value) {
        int c = 0;
        for (T t : list) {
            if (t.compareTo(value) > 0) {
                c++;
            }
        }
        return c;
    }
}
