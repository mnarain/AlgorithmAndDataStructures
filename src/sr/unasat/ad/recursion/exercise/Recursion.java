package sr.unasat.ad.recursion.exercise;

public class Recursion {

    static void tafelVan10(int multiplier) {
        //end condition
        if (multiplier > 10) {
            return;
        }
        //action to execute
        System.out.println(multiplier + " * 10 = " + multiplier * 10);
        //method must call itself
        tafelVan10(++multiplier);//parameter value aanpassen
    }

    static void tafelVanX(int multiplier, int tafel) {
        //end condition
        if (multiplier > 10) {
            return;
        }
        //action to execute
        System.out.println(multiplier + " * " + tafel + " = " + multiplier * tafel);
        //method must call itself
        tafelVanX(++multiplier, tafel);//parameter value aanpassen
    }

    public static void main(String[] args) {
        Recursion.tafelVanX(1, 3);
    }

}
