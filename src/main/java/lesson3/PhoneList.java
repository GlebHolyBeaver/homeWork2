package lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneList {

    HashMap<String, String> phoneList = new HashMap();

    public void add(String name, String phone){
        this.phoneList.put(name, phone);
    }
    public void get(String name){
        for (Map.Entry<String, String> every : this.phoneList.entrySet()) {
            if (name.equals(every.getKey())){
                System.out.println("Номер(а) телефона(ов) по фамилии Егор: " + every.getValue());
            }
        }
    }

    public void getList(){
        for (Map.Entry<String, String> every : this.phoneList.entrySet()) {
            System.out.println(every.getKey() + " : " + every.getValue());
            System.out.println();
        }
    }

    public PhoneList(){
        HashMap<String, String> phoneList = new HashMap();
        phoneList = this.phoneList;
    }
}
