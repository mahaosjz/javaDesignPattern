package designpatten.observe;

/**
 * @author hao
 * @title: ObserverPatternDemo
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/5/2517:00
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        //new OctalObserver(subject);

        subject.setState(10);
    }
}
