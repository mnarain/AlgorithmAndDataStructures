package sr.unasat.ad.queue.priority.datastructures;


import sr.unasat.ad.queue.priority.validation.Wachtwoord;

/**
 * Created by mnarain on 7/7/2017.
 */
public class PriorityQueue {
    private int maxSize;
    private Wachtwoord[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public PriorityQueue(int maxSize) // constructor
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
        int j;
        if (nItems == 0) // if no items,
            queArray[nItems++] = wachtwoord; // insert at 0
        else // if items,
        {
            for (j = nItems - 1; j >= 0; j--) // start at end,
            {
                if (wachtwoord.getPriority() < queArray[j].getPriority()) // if new item larger,
                    queArray[j + 1] = queArray[j]; // shift upward
                else // if smaller,
                    break; // done shifting
            } // end for
            queArray[j + 1] = wachtwoord; // insert it
            nItems++;
        } // end else (nItems > 0)
    } // end insert()
//-------------------------------------------------------------


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
