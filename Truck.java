package Items;

import Characters.Character;
import Characters.CharacterInfo;
import Characters.Korotyshka;

import java.util.ArrayList;
import java.util.Objects;

public class Truck {
    public ArrayList<Wool> woolLoad = new ArrayList<>();
    public String place = "start point";
    public Engine engine = new Engine();
    public void driveTo(Character person){
        if (!engine.isRunning()) {
            engine.start();
        }
        CharacterInfo inf = person.getChInfo();
        place = inf.name();
        engine.stop();
    }
    public void load(Wool wool){
        wool.load();
        woolLoad.add(wool);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Truck truck = (Truck) obj;
        return Objects.equals(place, truck.place) && engine == truck.engine && woolLoad == truck.woolLoad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(place, engine, woolLoad);
    }

    @Override
    public String toString() {
        return "Truck{place="+ place + ", engine=" + engine + ", loaded wool=" + woolLoad + '}';
    }
}
