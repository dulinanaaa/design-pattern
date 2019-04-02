package adapter;

import earphone.Earphone;

public class Adapter2 implements Earphone {

    private Earphone earphone;

    public Adapter2(Earphone earphone) {
        this.earphone = earphone;
    }

    public void sound() {
        System.out.println("插入了转换头，让旧耳机线适配新型耳机孔");
        earphone.sound();
    }
}
