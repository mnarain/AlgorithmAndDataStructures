package sr.unasat.ad.queue.priority.validation;

/**
 * Created by mnarain on 7/5/2017.
 */
public interface Wachtwoord {
    boolean execute(String wachtwoord);

    long getPriority();
}
