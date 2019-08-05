package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: Window
 * @projectName JavaDemo
 * @description: /窗体类：具体构件类
 * @date 2019/8/5 13:26
 */
public class Window extends Component {
    @Override
    void display() {
        System.out.println("显示窗体！");
    }
}
