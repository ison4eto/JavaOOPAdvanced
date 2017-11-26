package b_generics.lab.p02_array_creator;

import java.lang.reflect.Array;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length,T item ){
        T[] array  = (T[])new Object[length];
        for (int i = 0; i <length ; i++) {
            array[i]=item;
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> cl,int length, T item){
        T[] array = (T[])Array.newInstance(cl,length);
        for (int i = 0; i <length ; i++) {
            array[i]=item;
        }
        return array;
    }
}
