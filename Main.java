import Characters.*;
import Items.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws NoTruckNearby, NoWoolAwailable {
        // выберу случайные имена
        String[] kNames = {"Лили", "Ляля", "Лоло", "Лулу", "Лала"};
        String[] dNames = {"Райан", "Ахмат", "Дядя Вова", "Валера"};
        Random rand = new Random();
        Korotyshka korotyshka = new Korotyshka(kNames[rand.nextInt(5)]);
        Neznayka neznayka = new Neznayka("Незнайка");
        Driver driver = new Driver(dNames[rand.nextInt(4)]);
        // добавлю случайное количество шерсти в кучу
        int i = 0;
        int amountOfWool = rand.nextInt(3);
        while (i < amountOfWool){
            korotyshka.cutWool();
            i += 1;
        }
        try {
            korotyshka.loadWool(driver);
        } catch (NoTruckNearby exc) {
            System.out.println(exc.getMessage());
            driver.drive(korotyshka);
            try {
                korotyshka.loadWool(driver);
            } catch (NoWoolAwailable e) {
                System.out.println(e.getMessage());
                korotyshka.cutWool();
                korotyshka.loadWool(driver);
            }
        } catch (NoWoolAwailable exc) {
            System.out.println(exc.getMessage());
            korotyshka.cutWool();
            korotyshka.loadWool(driver);
        }
        driver.laugh();
        driver.waveHand();
        neznayka.runAway();
    }
}