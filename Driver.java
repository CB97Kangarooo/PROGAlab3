package Characters;

import Items.Truck;

import java.util.Objects;

import static Characters.Emotion.*;

public class Driver extends Character {
    int x = -100;
    int y = -100;
    public Truck truck = new Truck();
    Emotion emotion = NORMAL;
    public void setEmotion(Emotion em){
        emotion = em;
        if (em == SCARED){
            System.out.println(info.type() + " " + info.name() + " испугался!");
        }
        else{
            if (em == NORMAL){
                System.out.println(info.type() + " " + info.name() + " успокоился!");
            }
            else{
                System.out.println(info.type() + " " + info.name() + " развеселился!");
            }
        }
    }
    public Driver(String name){
        this.info = new CharacterInfo(name, CharacterType.DRIVER);
    }
    public void waveHand(){
        System.out.println("DRIVER " + info.name() + " машет рукой.");
    }
    public void laugh(){
        setEmotion(FUNNY);
        System.out.println("DRIVER " + info.name() + " смеется.");
    }
    public void drive(Character person){
        truck.driveTo(person);
        move(person);
    }
    void move(Character person) {
        x = person.x;
        y = person.y;
        System.out.println("DRIVER " + info.name() + " приезжает к персонажу " + person.info.name());
    }
    @Override
    void move(int x1, int y1) {
        x = x1;
        y = y1;
        System.out.println("DRIVER " + info.name() + " приезжает на координаты: " + x + ", " + y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Driver driver = (Driver) obj;
        return x == driver.x && y == driver.y && emotion == driver.emotion && Objects.equals(info, driver.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, emotion, info, truck);
    }

    @Override
    public String toString() {
        return "Driver{" + "name='" + info.name() + '\'' + ", coordinates=(" + x + ", " + y + ")" + ", emotion=" + emotion + ", truck=" + truck + '}';
    }

}
