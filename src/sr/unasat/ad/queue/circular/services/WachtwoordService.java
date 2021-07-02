package sr.unasat.ad.queue.circular.services;


import sr.unasat.ad.queue.circular.datastructures.Queue;
import sr.unasat.ad.queue.circular.validation.impl.DerdeWachtwoord;
import sr.unasat.ad.queue.circular.validation.impl.EersteWachtwoord;
import sr.unasat.ad.queue.circular.validation.impl.TweedeWachtwoord;

/**
 * Created by mnarain on 7/5/2017.
 */
public class WachtwoordService {
    private Queue queue;

    public WachtwoordService() {
        this.queue = generateQueue();
    }

    public boolean loginUser(String[] wachtwoordenLijst) {
        if (queue.isEmpty()) {
            return false;
        }
        for (int index = 0; index < wachtwoordenLijst.length; index++) {

            if (queue.peekFront() != null && queue.peekFront().execute(wachtwoordenLijst[index])) {
                queue.remove();
                continue;
            }
            return false;
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
