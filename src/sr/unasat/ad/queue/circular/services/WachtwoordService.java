package sr.unasat.ad.queue.circular.services;


import sr.unasat.ad.queue.circular.datastructures.Queue;
import sr.unasat.ad.queue.circular.validation.impl.DerdeWachtwoord;
import sr.unasat.ad.queue.circular.validation.impl.EersteWachtwoord;
import sr.unasat.ad.queue.circular.validation.impl.TweedeWachtwoord;

/**
 * Created by mnarain on 7/5/2017.
 */
public class WachtwoordService {
    private Queue priorityQueue;

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

    private Queue generateQueue() {
        Queue queue = new Queue(3);
        queue.insert(new EersteWachtwoord());
        queue.insert(new TweedeWachtwoord());
        queue.insert(new DerdeWachtwoord());
        return queue;
    }
}
