package sr.unasat.ad.queue.priority.validation.impl;


import sr.unasat.ad.queue.priority.validation.Wachtwoord;

/**
 * Created by mnarain on 7/5/2017.
 */
public class WachtwoordImpl implements Wachtwoord {
    private long priority;
    private String wachtwoord;

    public WachtwoordImpl(long priority, String wachtwoord) {
        this.priority = priority;
        this.wachtwoord = wachtwoord;
    }

    @Override
    public boolean execute(String wachtwoord) {
        return wachtwoord.equals(this.wachtwoord);
    }

    @Override
    public long getPriority() {
        return priority;
    }
}
