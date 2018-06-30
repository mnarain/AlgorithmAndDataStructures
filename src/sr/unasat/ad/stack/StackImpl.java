package sr.unasat.ad.stack;

/**
 * Created by mnarain on 6/28/2017.
 */
class StackImpl implements Stack {
    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    public StackImpl(int size) // constructor
    {
        maxSize = size; // set array size
        stackArray = new long[maxSize]; // create array
        top = -1; // no items yet
    }

    @Override
    public void push(long value) // put item on top of stack
    {
        stackArray[++top] = value; // increment top, insert item
    }

    @Override
    public long pop() // take item from top of stack
    {
        return stackArray[top--]; // access item, decrement top
    }

    @Override
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }

    @Override
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }

    @Override
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }
//--------------------------------------------------------------
} // end class StackImpl


