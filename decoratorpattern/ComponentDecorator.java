package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: ComponentDecorator
 * @projectName JavaDemo
 * @description: 构件装饰类：抽象装饰类
 * @date 2019/8/5 13:27
 */
public class ComponentDecorator extends Component {
    private Component component; //维持对抽象构件类型对象的引用。

    public ComponentDecorator(Component component) {	//注入抽象构件类型的对象
        this.component = component;
    }

    @Override
    void display() {
        component.display();
    }
}
