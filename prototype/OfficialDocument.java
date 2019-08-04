package designpatten.prototype;

/**
 * @author hao
 * @title: OfficialDocument
 * @projectName JavaDemo
 * @description: 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 * @date 2019/8/116:19
 */
public interface OfficialDocument extends Cloneable {
    public OfficialDocument clone();
    public void display();
}
