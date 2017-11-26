package b_generics.lab.p04_list_utilities;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static <T extends Comparable<T>> T getMin(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        T max = list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if(list.get(i).compareTo(max)<0){
                max = list.get(i);
            }
        }
        return max;
    }
    public static <T extends Comparable<T>> T getMax(List<T> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        T min = list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if(list.get(i).compareTo(min)>0){
                min = list.get(i);
            }
        }
        return min;
    }
    public static <T extends Comparable<T>> List<Integer> getNullIndices(List<T> list){
        List<Integer> indexes = new ArrayList<>();
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) == null){
                indexes.add(i);
            }
        }
        return indexes;
    }
    public static <T extends Comparable<T>> void flatten(List<T> destination, List<List<T>> source){
        for (List<T> row:source
             ) {
            destination.addAll(row);
        }
    }
    public static <T extends Comparable<T>> void addAll(List<T> destination, List<T> source){
        destination.addAll(source);
    }

}
