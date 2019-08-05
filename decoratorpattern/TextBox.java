package designpatten.decoratorpattern;

/**
 * @author hao
 * @title: Window
 * @projectName JavaDemo
 * @description: 文本框类：具体构件类
 * @date 2019/8/5 13:26
 */
public class TextBox extends Component {
    @Override
    void display() {
        System.out.println("显示文本框！");
    }
}
