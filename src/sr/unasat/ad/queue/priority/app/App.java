package sr.unasat.ad.queue.priority.app;


import sr.unasat.ad.queue.priority.services.WachtwoordService;

/**
 * Created by mnarain on 7/5/2017.
 */
public class App {
    public static void main(String[] args) {

        String[] wachtwoordenLijst = {"eerste", "tweede", "derde"};

        WachtwoordService wachtwoordService = new WachtwoordService();
        if (wachtwoordService.loginUser(wachtwoordenLijst)) {
            System.out.println("U bent succesvol ingelogged");
        } else {
            System.out.println("Een van uw wachtwoorden is incorrect");
        }
    }
}
