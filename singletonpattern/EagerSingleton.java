package designpatten.singletonpattern;

/**
 * @author hao
 * @title: EagerSingleton
 * @projectName JavaDemo
 * @description: 饿汉式单例，类被加载时，静态变量instance会被初始化，此时类的私有构造函数会被调用，单例类的唯一实 例将被创建。
 * @date 2019/7/318:21
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return instance;
    }
}
