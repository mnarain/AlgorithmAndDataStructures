package sr.unasat.ad.stack;

/**
 * Created by mnarain on 6/28/2017.
 */
class StackApp {
    public static void main(String[] args) {
        Stack theStackImpl = new StackImpl(10); // make new stack
        theStackImpl.push(20); // push items onto stack
        theStackImpl.push(40);
        theStackImpl.push(60);
        theStackImpl.push(80);
        while (!theStackImpl.isEmpty()) // until it’s empty,
        { // delete item from stack
            long value = theStackImpl.pop();
            System.out.print(value); // display it
            System.out.print(" ");
        } // end while
        System.out.println();
    } // end main()
} // end class StackApp