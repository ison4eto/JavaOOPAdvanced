package c_iterators.exercise.p01_listiterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIteratorImp<T> implements ListyIterator, Iterable<T> {
    private List<T> data;
    private int index;

    public ListyIteratorImp(T... items) {
        this.index = 0;
        this.data = Arrays.asList(items);
    }

    @Override
    public Iterator<T> iterator() {
        return new ListyIteratorInner();
    }


    @Override
    public boolean move() {
        if(this.iterator().hasNext()){
            this.iterator().next();
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        if(!this.data.isEmpty()){
            System.out.println(data.get(index));
        }else{
            throw new UnsupportedOperationException("Invalid Operation!");
        }
    }

     void printAll(){
        if(!data.isEmpty()){
            StringBuilder sb = new StringBuilder("");
            data.forEach(x->sb.append(x).append(" "));
            System.out.println(sb.toString().trim());
        }

    }

    @Override
    public void forEach(Consumer<? super T> action) {
        while (this.iterator().hasNext()){
            action.accept(this.iterator().next());
        }
    }

    @Override
    public boolean hasNext() {
        return this.iterator().hasNext();
    }

    private final class ListyIteratorInner implements Iterator<T> {
        //private int index;

        @Override
        public boolean hasNext() {
            return index < data.size() - 1;
        }

        @Override
        public T next() {
            return data.get(index++);
        }


    }
}
