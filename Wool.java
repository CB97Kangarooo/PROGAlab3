package Items;

import Characters.Neznayka;

import java.util.Objects;

public class Wool implements Loadable {
    public boolean isLoaded = false;
    @Override
    public void load() {
        isLoaded = true;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Wool wool = (Wool) obj;
        return isLoaded == wool.isLoaded;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLoaded);
    }

    @Override
    public String toString() {
        return "Wool{" + "isLoaded='" + isLoaded + '}';
    }
}
