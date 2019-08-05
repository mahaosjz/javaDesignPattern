package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: ScrollBarDecorator
 * @projectName JavaDemo
 * @description: 滚动条装饰类：具体装饰类
 * @date 2019/8/5 13:28
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
