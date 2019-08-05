package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: test类,透明装饰模式
 * @date 2019/8/5 13:30
 */
public class Client {
    public static void main(String[] args) {
        //使用抽象构件定义         定义装饰后的构件       定义具体构件
        Component componentSB = new ScrollBarDecorator(new Window());
        //将装饰了一次之后的对象继续注入 到另一个装饰类中，进行第二次装饰
        Component componentBB = new ScrollBarDecorator(componentSB);
        componentBB.display();
    }
}
