## 设计模式

注：下面的一些描述可能不准确，但为了便于我本人的理解，以实用为主。

### 创建型模式

#### 简单工厂模式

耦合度太高，有新的类要由工厂创建时，需要修改工厂接口的代码

#### 工厂方法模式

工厂接口实现了抽象类（也是接口），有新类创建的时候，只需要：
1. 继承抽象类A（实现接口）
1. 添加实现工厂接口的类，在其中创建A这个类

#### 抽象工厂模式

抽象工厂模式与工厂方法模式的区别在于：
> 工厂方法模式：工厂创建的类只关联一个实体

> 抽象工厂模式：工厂创建的类可能需要两部分（及以上）来组成

如：制造车的工厂（一个接口，要生产车和油的两个抽象类），有两个实现类（轿车工厂类和货车工厂类）
而这两个工厂生产的车和油是不同的（轿车可能用部件1和汽油，货车可能用部件2和柴油）
这样的话部件1和部件2实现了车的抽象类；汽油和柴油实现了油的抽象类

构造的时候（其他人用的时候），只需要知道那两个生产轿车和生产货车的两个实现类就行了

#### 建造者模式

看了一些对象的创建方式，会发现有一些不是简单的new出来的，而是像
`new XXXBuilder().setA('a').setB('b').build()` 从而来返回要构造的对象
a, b, c是他的各部分组成，可以根据实际需要灵活的组成

比如造机器人，可以分为头、身体、四肢、发声 4部分组成。在构造的时候，可以指定构造的头是方型的（而不是圆的）、发声是说汉语（而不是英语）等

#### 原型模式

创建对象，可以new，也可以用Object的clone()方法
而clone()方法又分为浅复制和深复制，如果要深复制，那么这个对象及其引用对象（如果引用对象还有它的引用对象）都要实现Cloneable接口，重写clone方法才可以
在本例中，将对象序列化（要实现序列化接口）后通过二进制数据的读写就可以了

#### 单例模式

略

### 结构型模式

#### 适配器模式

现实场景是这样，新买的手机没有3.5mm耳机孔，而是和充电线共用一个Type-c的插孔。

本身送了我一个type-c的耳机和一个type-c的转换头（另一面可以插3.5mm的传统耳机）

有一天那个新耳机丢了，我只好用那个转换头和旧型耳机配合使用了。那个转换头就是适配器

[适配器模式](https://segmentfault.com/a/1190000011856448)

#### 桥接模式

可以参考这篇博客：
[桥接模式](https://www.cnblogs.com/chenssy/p/3317866.html)

适用场景也正像博客说的那样，一个是图形的类，一个是颜色类，两个维度不一样。

如果新加了个形状，就要把这形状符合的颜色的类都新增上；或者加了个颜色，就要把所有形状也扩充了这个颜色，这样总有你受不了的一天。

桥接就是动态抽取，比较灵活

#### 组合模式

就是部分与整体的关系。
比如一个根目录（文件夹）A，有很多子目录B、C、D和文件b、c、d。
而目录B（文件夹）还有很多子目录E、F、G和若干文件。
我们说整体的文件夹A和部分的文件夹B就是一个整体与部分的关系。

只是上面的文件就是叶子节点（不会有下级了），而文件夹可能会存在子节点。

参考：[组合模式](https://www.cnblogs.com/liufei1983/p/7094269.html)


### 行为型模式

