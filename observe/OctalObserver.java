package designpatten.observe;

/**
 * @author hao
 * @title: BinaryObserver
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/5/2516:58
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("octal String :"+Integer.toBinaryString(subject.getState()));
    }
}
