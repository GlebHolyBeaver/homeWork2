package lesson2;

public class MyArraySizeException extends IllegalMonitorStateException {

    public MyArraySizeException(){
        super("Массив неверного размера");
    }
}
