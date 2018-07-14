package sr.unasat.ad.queue.circular.validation.impl;


import sr.unasat.ad.queue.circular.validation.Wachtwoord;

/**
 * Created by mnarain on 7/5/2017.
 */
public class TweedeWachtwoord implements Wachtwoord {

    @Override
    public boolean execute(String wachtwoord) {
        return wachtwoord.equals("tweede");
    }
}
