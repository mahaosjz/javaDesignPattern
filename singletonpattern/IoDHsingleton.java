package designpatten.singletonpattern;

/**
 * @author hao
 * @title: IoDHsingleton
 * @projectName JavaDemo
 * @description: 为Initialization Demand	 Holder	(IoDH)的技术,第一次调用 getInstance()时将加载内部类HolderClass，
 *               在该内部类中定义了一个static类型的变量 instance，
 *              此时会首先初始化这个成员变量，由Java虚拟机来保证其线程安全性，确保该成员变量 只能初始化一次。
 * @date 2019/7/318:24
 */
public class IoDHsingleton {
    private IoDHsingleton() {
    }

    //静态(static)内部类，在该内部类中创建单例对象，
    private static class ClassHolder {
        private final static IoDHsingleton instance = new IoDHsingleton();
    }

    public static IoDHsingleton getInstance() {
        return ClassHolder.instance;
    }

    public static void main(String[] args) {
        IoDHsingleton s1,s2;
        s1 = IoDHsingleton.getInstance();
        s2 = IoDHsingleton.getInstance();
        System.out.println(s1==s2);
    }
}
