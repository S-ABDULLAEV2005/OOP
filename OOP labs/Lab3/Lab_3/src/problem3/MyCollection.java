package problem3;
import java.util.Iterator;
public interface MyCollection<E> {
	
	

	    // Adds an element to the collection.
	    boolean add(E e);

	    // Removes all of the elements from the collection.
	    void clear();

	    // Returns true if the collection contains the specified element.
	    boolean contains(Object o);

	    // Returns true if the collection contains all of the elements in the specified collection.
	    boolean containsAll(MyCollection<> c);

	    // Returns true if the collection contains no elements.
	    boolean isEmpty();

	    // Returns an iterator over the elements in the collection.
	    Iterator<E> iterator();

	    // Removes the first occurrence of the specified element from the collection, if it is present.
	    boolean remove(Object o);

	    // Removes from the collection all of its elements that are contained in the specified collection.
	    boolean removeAll(MyCollection<> c);

	    // Retains only the elements in the collection that are contained in the specified collection.
	    boolean retainAll(MyCollection<> c);

	    // Returns the number of elements in the collection.
	    int size();

	    // Returns an array containing all of the elements in the collection.
	    Object[] toArray();

	    // Returns an array containing all of the elements in the collection; the runtime type of the returned array is that of the specified array.
	    <T> T[] toArray(T[] a);
	}

