package sr.unasat.ad.queue.priority.datastructures;


import sr.unasat.ad.queue.priority.entities.Car;
/**
 * Created by mnarain on 7/7/2017.
 */
public class CarPriorityQueue {
    private int maxSize;
    private Car[] queArray;
    private int front;
    private int rear;
    private int nItems;

    //--------------------------------------------------------------
    public CarPriorityQueue(int maxSize) // constructor
    {
        this.maxSize = maxSize;
        queArray = new Car[this.maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //--------------------------------------------------------------
    public void insert(Car car) // put item at rear of queue
    {
        int currentIndex;
        if (nItems == 0) { // if no items,
            queArray[nItems++] = car; // insert at 0
        } else // if items,
        {
            for (currentIndex = nItems - 1; currentIndex >= 0; currentIndex--) // start at end,
            {
                if (car.getPriority() < queArray[currentIndex].getPriority()) // if new item larger,
                    queArray[currentIndex + 1] = queArray[currentIndex]; // shift upward
                else // if smaller,
                    break; // done shifting
            } // end for
            queArray[currentIndex + 1] = car; // insert it
            nItems++;
        } // end else (nItems > 0)
    } // end insert()
//-------------------------------------------------------------


    //--------------------------------------------------------------
    public Car remove() // take item from front of queue
    {
        Car temp = queArray[front];//3 // get value and incr front
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
    public Car peekFront() // peek at front of queue
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
