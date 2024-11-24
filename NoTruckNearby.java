package Characters;

public class NoTruckNearby extends RuntimeException {
    @Override
    public String getMessage(){
        return "Ошибка: Рядом нет грузовика, коротышка не может загрузить шерсть!";
    }
}
