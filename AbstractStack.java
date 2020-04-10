import java.util.Iterator;

public abstract class AbstractStack<E> implements BDDStack<E> {

    private int depth = 0 ;
    private int capacity;


          public AbstractStack(int capacity ){

              this.capacity = capacity;

    }

    // ========================================
    // Secondary Methods
    // ========================================

    /**
     * Returns the capacity of this stack.
     * @return the capacity of this stack
     */
    public int capacity(){
        return capacity;
    }
    /**
     * Returns true if this stack is empty.
     * @return true if this stack is empty
     */
    public boolean isEmpty(){
        return depth()==0;
    }


    /**
     * Returns true if this stack is full.
     * @return true if this stack is full
     */
    public boolean isFull() {
        return depth==(capacity());
    }

    /**
     * Reverses the elements in this stack.
     */
    public void flip(){
        for(int i = 65; i<(65+depth()); i++){
            char ab;
            ab = (char)i;
            E ((char)i) = pop();
            push(ab);


        }

    }

    /**
     * Returns a new stack that is a shallow copy of this stack. The new stack
     * has the same capacity as this stack.
     * @return a new stack that is a shallow copy of this stack
     */

    public BDDStack<E> copy(){
        BDDStack<E> copied;
        copied = newInstance();
        Iterator<E> array = iterator();

        while(array.hasNext()){
            copied.push( array.next());
        }

        return copied;
    }


}
