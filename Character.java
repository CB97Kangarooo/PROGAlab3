package Characters;

import static Characters.Emotion.NORMAL;
import static Characters.Emotion.SCARED;

public abstract class Character {
    CharacterInfo info;
    int x;
    int y;
    abstract void move(int x1, int y1);
    public CharacterInfo getChInfo() {
        return info;
    }
}

