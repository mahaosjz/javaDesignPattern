package designpatten.factorymethod;

/**
 * @author hao
 * @title: FileLogger
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/7/308:50
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录！");
    }
}
