package designpatten.singletonpattern;

/**
 * @author hao
 * @title: LazySingleton
 * @projectName JavaDemo
 * @description: 用双重检查锁定来实现懒汉式单例类,，需要在静态成员变量instance之前增 加修饰符volatile，
 * 被volatile修饰的成员变量可以确保多个线程都能够正确处理，
 * @date 2019/7/318:22
 */
public class LazySingleton {
    private static volatile LazySingleton instance;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if(null==instance){
            //锁定代码块
            synchronized(LazySingleton.class){
                //第二重判断
                if(null==instance){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
