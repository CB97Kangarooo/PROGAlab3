package Items;

import Characters.Neznayka;

import java.util.Objects;

public class Engine {
    private boolean isRunning = false;
    public void start(){
        isRunning = true;
        System.out.println("Мотор заведен.");
    }
    public void stop(){
        isRunning = false;
        System.out.println("Мотор заглушен.");
    }
    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null && getClass() != obj.getClass()) return false;
        Engine engine = (Engine) obj;
        return isRunning == engine.isRunning;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isRunning);
    }

    @Override
    public String toString() {
        return "Engine{" + "isRunning='" + isRunning + '}';
    }
}
