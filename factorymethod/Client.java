package designpatten.factorymethod;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:55
 */
public class Client {
    public static void main(String[] args) {
        Logger logger;
        LoggerFactory factory = (LoggerFactory) XMLUtil.getBean();

        logger = factory.createLogger();
        logger.writeLog();
    }
}
