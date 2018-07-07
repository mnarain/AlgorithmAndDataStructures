1a.	Leg in eigen woorden uit wat de big O notation inhoud. 
De big O notation is een praktische manier waarmee de efficiency(time/space) van een algoritme kan worden vastgesteld.
1b. Noem de big O notations op van klein naar groot.
O(1), O(log n), O(n), O(n log n), O(n^2),O(2^n),O(n!)

2a.	Leg in eigen woorden uit wat een algoritme is?
Een algoritme is een procedure(instructies) voor het uitvoeren van een specifieke taak. 
2b.	Leg in eigen woorden uit wat datastructuur is?
Een datastructuur is een efficiente manier om data op te slaan in een structuur t.b.v. selecteerbaarheid, wijzigingen, zoeken en verwijderen.

code kennen voor:
Linear search
Binary search(beide manieren)
Insertion sort
Stack(ADT)
Queue(ADT)

URL CHEATSHEET: http://bigocheatsheet.com/


v.b Stack(ADT)(ook omschrijven voor de datamembers)

    private int maxSize; // size of stack array
    private long[] stackArray;
    private int top; // top of stack

    public StackX(int s); 

    public void push(long j); // put item on top of stack

    public long pop(); // take item from top of stack

    public long peek(); // peek at top of stack

    public boolean isEmpty(); // true if stack is empty

    public boolean isFull(); // true if stack is full
    
v.b Queue(ADT) met toelichting(ook omschrijven voor de datamembers)

    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s); // constructor

    public void insert(long j); // put item at rear of queue
    
    public long remove(); // take item from front of queue

    public long peekFront(); // peek at front of queue
    
    public boolean isEmpty(); // true if queue is empty
    
    public boolean isFull(); // true if queue is full

    public int size(); // number of items in queue
