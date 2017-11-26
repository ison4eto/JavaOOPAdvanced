package b_generics.exercises.p02_custom_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 public class CustomList<T extends Comparable<T>> {
    private List<T> list = new ArrayList<T>();


     void add(T element){
        list.add(element);
    }
     T remove(int index){
        return list.remove(index);
    }
     boolean contains(T element){
        return list.contains(element);
    }
     void swap(int index1, int index2){
        Collections.swap(list, index1, index2);
    }
     int countGreaterThan(T element){
        int c = 0;
        for (T t : list) {
            if (t.compareTo(element) > 0) {
                c++;
            }
        }
        return c;
    }
     T getMax(){
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
     T getMin(){
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

     @Override
     public String toString() {
         StringBuilder sb = new StringBuilder("");
         list.forEach(s->sb.append(s).append(System.lineSeparator()));
         return sb.toString();
     }
 }
