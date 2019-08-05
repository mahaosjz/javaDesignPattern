package designpatten.facadepattern;

/**
 * @author hao
 * @title: FileReader
 * @projectName JavaDemo
 * @description: 文件读取类，充当子系统类。
 * @date 2019/8/5 14:53
 */
public class FileReader {
    public String read(String fileName){
        System.out.println("读取文件，获取明文：");
        return fileName;
    }
}
