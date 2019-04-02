package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        List<String> cloneList = (List<String>) ((ArrayList<String>) list).clone();
        System.out.println(cloneList);

        Person person = new Person();
        person.setName("zhangsan");
        person.setAge(12);
        person.setBirthday(new Date());

        Person personClone = person.clone();

        System.out.println(personClone);
    }
}
