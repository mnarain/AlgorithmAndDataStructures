package sr.unasat.ad.queue.circular.datastructures;


import sr.unasat.ad.queue.circular.validation.Wachtwoord;

/**
 * Created by mnarain on 7/7/2017.
 */
public class Queue {
    private int maxSize;
    private Wachtwoord[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public Queue(int maxSize) // constructor
    {
        this.maxSize = maxSize;
        queArray = new Wachtwoord[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //--------------------------------------------------------------
    public void insert(Wachtwoord wachtwoord) // put item at rear of queue
    {
        boolean maxIndex = (rear == maxSize - 1);
        if (maxIndex && queArray[0] == null) { // deal with wraparound
            rear = -1;
        }

        if (!maxIndex && queArray[rear + 1] == null) {// check array out of bounds and
            queArray[++rear] = wachtwoord; // increment rear and insert
            nItems++; // nItems gebruik je om te kijken hoeveel items je hebt insert in totaal
        }
    }

    //--------------------------------------------------------------
    public Wachtwoord remove() // take item from front of queue
    {
        Wachtwoord temp = queArray[front];//3 // get value and incr front
        queArray[front] = null;//3 removed
        if (front + 1 == maxSize) { // deal with wraparound
            front = 0;
        } else {
            front++;
        }
        nItems--;// one less item
        return temp;
    }

    //--------------------------------------------------------------
    public Wachtwoord peekFront() // peek at front of queue
    {
        return queArray[front];
    }

    //--------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return (nItems == 0);
    }

    //--------------------------------------------------------------
    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    //--------------------------------------------------------------
    public int size() // number of items in queue
    {
        return nItems;
    }
//--------------------------------------------------------------
} // end class Queue
