package designpatten.facadepattern;

/**
 * @author hao
 * @title: FileWriter
 * @projectName JavaDemo
 * @description: 文件保存类，充当子系统类。
 * @date 2019/8/5 14:57
 */
public class FileWriter {
    public void write(String encryptStr){
        System.out.println("保存密文，写入文件:"+encryptStr);
    }
}
