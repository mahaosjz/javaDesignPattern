package designpatten.factorymethod;

/**
 * @author hao
 * @title: FileLoggerFactory
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:53
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
