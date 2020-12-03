package lesson2;

public class MyArrayDataException extends NumberFormatException {

    public MyArrayDataException(int a, int b){
        super("Неверный формат в ячейке " + a + " : " + b );
    }
}
