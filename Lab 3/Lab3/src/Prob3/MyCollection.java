package Prob3;
public interface MyCollection<E> {
    boolean add(E e);

    boolean addAll(MyCollection<? extends E> c);

    void clear();

    boolean contains(Object o);

    boolean containsAll(MyCollection<?> c);

    boolean isEmpty();

    boolean remove(Object o);

    boolean removeAll(MyCollection<?> c);

    boolean retainAll(MyCollection<?> c);

    int size();

    Object[] toArray();

    <T> T[] toArray(T[] a);
}