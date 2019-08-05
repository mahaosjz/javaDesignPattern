package designpatten.facadepattern;

/**
 * @author hao
 * @title: CipherMachine
 * @projectName JavaDemo
 * @description: 数据加密类，充当子系统类。
 * @date 2019/8/5 14:55
 */
public class CipherMachine {

    public String encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文");
        return plainText + "加密之后";
    }
}
