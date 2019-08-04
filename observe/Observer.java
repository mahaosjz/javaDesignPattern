package designpatten.observe;

/**
 * @author hao
 * @title: Observer
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/5/2516:55
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
