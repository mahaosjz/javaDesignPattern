package designpatten.factorymethod;

/**
 * @author hao
 * @title: DatabaseLogger
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:49
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
