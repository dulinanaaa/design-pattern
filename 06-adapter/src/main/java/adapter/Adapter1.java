package adapter;

import earphone.Earphone;
import earphone.OldEarphone;

public class Adapter1 extends OldEarphone implements Earphone {

    @Override
    public void sound() {
        System.out.println("插入了转换头，让旧耳机线适配新型耳机孔");
        super.sound();
    }
}
