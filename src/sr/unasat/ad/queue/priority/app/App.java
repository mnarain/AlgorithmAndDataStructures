package sr.unasat.ad.queue.priority.app;


import sr.unasat.ad.queue.priority.datastructures.CarPriorityQueue;
import sr.unasat.ad.queue.priority.entities.Car;


/**
 * Created by mnarain on 7/5/2017.
 */
public class App {
    public static void main(String[] args) {

        CarPriorityQueue cpq = new CarPriorityQueue(9);
        System.out.println("Politie"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(4, "Politie")); //inserten van voertuigen conform de weg situatie
        System.out.println("Auto1"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(4, "Auto1")); //inserten van voertuigen conform de weg situatie
        System.out.println("Auto2"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(4, "Auto2")); //inserten van voertuigen conform de weg situatie
        System.out.println("Brandweer met sirene"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(2, "Brandweer met sirene")); //inserten van voertuigen conform de weg situatie
        System.out.println("Ambulance met sirene"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(3, "Ambulance met sirene")); //inserten van voertuigen conform de weg situatie
        System.out.println("Politie met sirene"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(1, "Politie met sirene")); //inserten van voertuigen conform de weg situatie
        System.out.println("Auto4"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(4, "Auto4")); //inserten van voertuigen conform de weg situatie
        System.out.println("Ambulance met sirene"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(3, "Ambulance met sirene")); //inserten van voertuigen conform de weg situatie
        System.out.println("Politie met sirene"); //inserten van voertuigen conform de weg situatie
        cpq.insert(new Car(1, "Politie met sirene")); //inserten van voertuigen conform de weg situatie

        System.out.println("\n\n\n");

        while(!cpq.isEmpty()){
            System.out.println(cpq.peekFront().getName());
            cpq.remove();
        }


    }
}
