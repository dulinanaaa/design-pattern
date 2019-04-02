import adapter.Adapter1;
import adapter.Adapter2;
import earphone.Earphone;
import earphone.NewEarphone;
import earphone.OldEarphone;

public class TestDemo {
    public static void main(String[] args) {
        //1.有新型的耳机线
        Earphone earphone1 = new NewEarphone();
        earphone1.sound();

        System.out.println("-----------------------");

        //2.没有新型的线，只有旧型的耳机和适配器（类适配器的方式）
        Earphone earphone2 = new Adapter1();
        earphone2.sound();

        System.out.println("-----------------------");
        System.out.println("-----------------------");

        // 3.使用对象适配器的方式
        Earphone earphone3 = new Adapter2(new OldEarphone());
        earphone3.sound();
    }
}
