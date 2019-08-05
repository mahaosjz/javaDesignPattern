package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: ScrollBarDecorator
 * @projectName JavaDemo
 * @description: 滚动条装饰类：具体装饰类
 * @date 2019/8/5 13:28
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
