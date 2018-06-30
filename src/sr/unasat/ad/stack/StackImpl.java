package sr.unasat.ad.stack;

/**
 * Created by mnarain on 6/28/2017.
 */
public class StackImpl {
    private int maxSize; // size of stack array
    private int[] stackArray;
    private int top; // top of stack
    
/*    public StackImpl(int size) // constructor
    {
        maxSize = size; // set array size
     stackArray = new int[maxSize]; // create array
        top = -1; // no items yet
    }*/

    public StackImpl(int[] array) // constructor
    {
        maxSize = array.length; // set array size
        stackArray = array; // create array
        top = stackArray.length - 1; // no items yet
    }

    public void push(int value) // put item on top of stack
    {
        stackArray[++top] = value; // increment top, insert item
    }


    public int pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }


    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }


    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }


    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }


    public int[] reverseOrderArray() {
        //pop from stack
        int[] reversedArray = new int[stackArray.length];
        for (int index = 0; !isEmpty() || index < reversedArray.length; index++) {
            reversedArray[index] = pop();
        }
        return reversedArray;
    }
//--------------------------------------------------------------
} // end class StackImpl


