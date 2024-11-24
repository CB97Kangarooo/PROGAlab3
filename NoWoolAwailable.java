package Characters;

public class NoWoolAwailable extends Exception{
    @Override
    public String getMessage(){
        return "Ошибка: Шерсть в куче закончилась, коротышка не может загрузить шерсть! Начинаем стиржку!";
    }
}
