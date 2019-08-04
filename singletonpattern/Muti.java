package designpatten.singletonpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hao
 * @title: Muti
 * @projectName JavaDemo
 * @description: 单例变形——多例模式 维护一个指定数量的对象池，当请求个数超过控制的总数时，开始循环重复使用 。
 * @date 2019/7/318:50
 */
public class Muti {
    private static Map<Integer, Muti> map = new HashMap(4);
    private static final int INSTANCE_COUNT = 2;
    private static int CURRENT_INDEX = 1;

    private Muti() {
    }

    public static Muti getInstance() {
        Muti instance = map.get(CURRENT_INDEX);
        if (instance == null) {
            instance = new Muti();
            map.put(CURRENT_INDEX, instance);
        }
        CURRENT_INDEX++;
        if (CURRENT_INDEX > INSTANCE_COUNT) {
            CURRENT_INDEX = 1;
        }
        return instance;
    }

}
