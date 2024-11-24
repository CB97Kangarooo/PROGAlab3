package Characters;
import java.util.Random;
import static Characters.Emotion.*;
import java.util.Objects;

public class Neznayka extends Character{
    int x = 10;
    int y = 10;
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
    public Neznayka(String name){
        this.info = new CharacterInfo(name, CharacterType.NEZNAYKA);
    }
    public void runAway(){
        Random random = new Random();
        setEmotion(SCARED);
        System.out.println("NEZNAYKA " + info.name() + " убегает!");
        this.move(random.nextInt(), random.nextInt());
    }
    @Override
    void move(int x1, int y1) {
        x = x1;
        y = y1;
        System.out.println("NEZNAYKA " + info.name() + " приходит на координаты: " + x + ", " + y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Neznayka neznayka = (Neznayka) obj;
        return x == neznayka.x && y == neznayka.y && emotion == neznayka.emotion && Objects.equals(info, neznayka.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, emotion, info);
    }

    @Override
    public String toString() {
        return "Neznayka{" + "name='" + info.name() + '\'' + ", coordinates=(" + x + ", " + y + ")" + ", emotion=" + emotion + '}';
    }
}
