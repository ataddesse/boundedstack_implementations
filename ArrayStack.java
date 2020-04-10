import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
// This class is based on the interface of BDDStack
public class ArrayStack<E> extends AbstractStack<E>{
    private E[] array;
    private int depth = 0;
    //The constructor with a parameter of int capacity
    public ArrayStack(int capacity) {
        super(capacity);

        array = (E[ ]) new Object[capacity];

        depth = 0;
    }

    /* @param element the element to be pushed
     * @throws NullPointerException if {@code element == null}
     * @throws IllegalStateException if this stack is full*
     * */
    @Override
    //This method will be used to push elements into the bounded stack
    public void push(E element) throws NullPointerException, IllegalStateException {
        if (depth == array.length) {

            throw new IllegalStateException("Cannot add to full stack");

        }else{
            array[depth] = (E) element;
        }

        depth++;

    }

    @Override
    //This method will be used to return the element at the end of the Array
    public E pop() throws IllegalStateException {
        if (!isEmpty()) {
            E result = array[depth-1];
            array[--depth] = null;

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
        Arrays.fill(array, null);
        depth=0;
    }

    @Override
    //Incase we want to create a new stack with the same capacity
    public BDDStack<E> newInstance() {
        ArrayStack<E> newStack = new ArrayStack<E>(capacity());
        return newStack;
    }

    @Override
    public boolean isValid() {
        return true;
    }









   public class Iterator1 implements Iterator<E> {
        private int index;

		public Iterator1() {
            index = (depth()-1);
        }

        public boolean hasNext() {
            return index > 0;
        }

        public E next() {
            if(!hasNext()) throw new NoSuchElementException();
            return array[index--];
        }
    }


    @Override
    public Iterator iterator() {
        return new Iterator1();
    }
}
