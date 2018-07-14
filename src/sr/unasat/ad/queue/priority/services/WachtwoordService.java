package sr.unasat.ad.queue.priority.services;


import sr.unasat.ad.queue.priority.datastructures.PriorityQueue;
import sr.unasat.ad.queue.priority.validation.impl.WachtwoordImpl;

/**
 * Created by mnarain on 7/5/2017.
 */
public class WachtwoordService {
    private PriorityQueue priorityQueue;

    public WachtwoordService() {
        this.priorityQueue = generateQueue();
    }

    public boolean loginUser(String[] wachtwoordenLijst) {
        if (priorityQueue.isEmpty()) {
            return false;
        }
        for (int index = 0; index < wachtwoordenLijst.length; index++) {

            if (priorityQueue.peekFront() != null && priorityQueue.peekFront().execute(wachtwoordenLijst[index])) {
                priorityQueue.remove();
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    private PriorityQueue generateQueue() {
        PriorityQueue pq = new PriorityQueue(3);
        pq.insert(new WachtwoordImpl(1, "eerste"));
        pq.insert(new WachtwoordImpl(2, "tweede"));
        pq.insert(new WachtwoordImpl(3, "derde"));
        return pq;
    }
}
