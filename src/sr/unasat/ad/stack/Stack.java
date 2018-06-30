package sr.unasat.ad.stack;

/**
 * Created by mnarain on 6/28/2017.
 */
public interface Stack {
    void push(int value); // put item on top of stack
    long pop(); // take item from top of stack

    long peek(); // peek at top of stack

    boolean isEmpty(); // true if stack is empty

    boolean isFull(); // true if stack is full
}
