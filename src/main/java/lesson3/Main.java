package lesson3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        simpleSet();
        simpleList();
        PhoneList phoneList1 = new PhoneList();
        phoneList1.add("Егор", "+7(964)645-76-76");
        phoneList1.add("Егор", "+7(964)645-76-00");
        phoneList1.add("Мария", "+7(964)985-45-16");
        phoneList1.add("Наталья", "+7(903)111-34-87");
        phoneList1.add("Владимир", "+7(945)523-12-21");
        phoneList1.add("Андрей", "+7(903)901-54-23");
        phoneList1.getList();
        phoneList1.get("Егор");
    }

    private static void simpleList(){
        List<String> data = new ArrayList<String>();
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Арбуз");
        data.add("Клубника");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Арбуз");
        data.add("Клубника");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        System.out.println("Вся коллекция "+ data);
        for (int i = 0; i <= 3; i++){
            System.out.println();
        }
        int count1 = Collections.frequency(data, "Арбуз");
        System.out.println("Слово '" + data.get(0) + "' Встречается " + count1 + " раз");
        int count2 = Collections.frequency(data, "Апельсин");
        System.out.println("Слово '" + data.get(1) + "' Встречается " + count2 + " раз");
        int count3 = Collections.frequency(data, "Вишня");
        System.out.println("Слово '" + data.get(2) + "' Встречается " + count3 + " раз");
        int count4 = Collections.frequency(data, "Мандарин");
        System.out.println("Слово '" + data.get(3) + "' Встречается " + count4 + " раз");
        int count5 = Collections.frequency(data, "Клубника");
        System.out.println("Слово '" + data.get(7) + "' Встречается " + count5 + " раз");
        for (int i = 0; i <= 3; i++){
            System.out.println();
        }
    }

    private static void simpleSet(){
        Set<String> data = new TreeSet<String>();
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Арбуз");
        data.add("Клубника");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Арбуз");
        data.add("Клубника");
        data.add("Арбуз");
        data.add("Апельсин");
        data.add("Вишня");
        data.add("Мандарин");
        System.out.println("Только уникальные слова "+ data);
        for (int i = 0; i <= 3; i++){
            System.out.println();
        }
    }

}
