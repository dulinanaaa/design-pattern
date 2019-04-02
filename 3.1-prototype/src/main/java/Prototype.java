import java.io.*;

public class Prototype implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // 简单类型或者String类型
    private String name;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /*
     * 深复制
     *
     * 要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
     */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 将对象序列化到二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 从二进制流中读出产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
