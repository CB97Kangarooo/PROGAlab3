package Characters;
import Items.Wool;
import java.util.ArrayList;
import java.util.Objects;

import static Characters.Emotion.NORMAL;

public class Korotyshka extends Character{
    int x = 0;
    int y = 0;
    public ArrayList<Wool> woolCut = new ArrayList<>();
    public Korotyshka(String name){
        this.info = new CharacterInfo(name, CharacterType.KOROTYSHKA);
    }
    public void cutWool(){
        Wool wool = new Wool();
        woolCut.add(wool);
        System.out.println("KOROTYSHKA "+ info.name() + " состригает кусочек шерсти.");
    }
    public void loadWool(Driver ryan) throws NoWoolAwailable {
        if (ryan.x != x || ryan.y != y){
            throw new NoTruckNearby();
        }
        if (woolCut.isEmpty()){
            throw new NoWoolAwailable();
        }
        ryan.truck.load(woolCut.get(0));
        woolCut.remove(0);
        System.out.println("KOROTYSHKA "+ info.name() + " загружает кусочек шерсти в грузовик.");
    }

    @Override
    void move(int x1, int y1) {
        x = x1;
        y = y1;
        System.out.println("KOROTYSHKA " + info.name() + " приходит на координаты: " + x + ", " + y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Korotyshka korotyshka = (Korotyshka) obj;
        return x == korotyshka.x && y == korotyshka.y && Objects.equals(info, korotyshka.info) && woolCut == korotyshka.woolCut;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, woolCut, info);
    }

    @Override
    public String toString() {
        return "Korotyshka{" + "name='" + info.name() + '\'' + ", coordinates=(" + x + ", " + y + ")" + ", cutten wool=" + woolCut + '}';
    }
}
