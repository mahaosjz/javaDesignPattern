package designpatten.prototype;

import java.io.IOException;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/116:10
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeeklyLog log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);        //将附件添加到周报中
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        System.out.println("****周报****");
        System.out.println("周次：" + log_previous.getDate());
        System.out.println("姓名：" + log_previous.getName());
        System.out.println("内容：" + log_previous.getContent());
        System.out.println("--------------------------------");
        WeeklyLog log_new;
        log_new = log_previous.deepClone();
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());


        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());
        System.out.println(log_previous.getAttachment() == log_new.getAttachment());

    }
}
