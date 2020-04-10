import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
// This class is based on the interface of BDDStack
public class ListStack<E> extends AbstractStack<E>{
    // We will have a private field for an array list
    private ArrayList<E> arrayList;
    // This will be the initial depth of the arrayList
    private int depth = 0 ;
    private int capacity;
    //The constructor with a parameter of int capacity
    public ListStack(int size){
        super(size);

        capacity = size;
        arrayList = new ArrayList<E>();
        depth = 0;
    }

    @Override
    //This method will be used to insert elements into the bounded stack
    public void push(E element) throws NullPointerException, IllegalStateException {
        if (depth == capacity){
            throw new IllegalStateException("Cannot add to full stack");
        }
        arrayList.add((E) element);
        depth++;
    }

    @Override
    //This method will be used to return the element at the end of the ArrayList
    public E pop() throws IllegalStateException {
        if(!isEmpty()){
            E result = arrayList.get(depth-1);
            arrayList.set(--depth, null);
            return result;

        }else{
            throw new NoSuchElementException("Cannot pop from empty stack");
        }

    }

    @Override
    //This method will return the current number of items
    public int depth() {
        return depth;
    }

    @Override
    //A method to clear the stack
    public void clear() {
        arrayList.clear();
        depth = 0;
    }

    @Override
    //Incase we want to create a new stack with the same capacity
    public BDDStack newInstance() {

        BDDStack<E> newStack = new ListStack<E>(capacity());
        return newStack;

    }

    @Override
    public boolean isValid() {
        return true;
    }








    @Override
    public Iterator<E> iterator() {
        return arrayList.iterator();
    }

/*
    public class Iterator1 implements Iterator<E> {

        public boolean hasNext() {
            if(depth+1 <= capacity() ){
                return true;
            }
            return false;
        }

        // moves the cursor/iterator to next element
        public E next() {
            if(hasNext()){
                E next = (E) arrayList.get(depth+1);
                return next;
            }
            return null;
        }
    }*/
}

