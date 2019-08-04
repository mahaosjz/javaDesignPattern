package designpatten.factorymethod;

/**
 * @author hao
 * @title: DatabaseLoggerFactory
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:52
 */
public class DatabaseLoggerFactory implements  LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        // 创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
