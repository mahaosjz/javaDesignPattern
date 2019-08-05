package designpatten.facadepattern;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/5 15:28
 */
public class Client {
    public static void main(String[] args) {
        EncryptFacade ef = new EncryptFacade();
        ef.fileEncryPt("client.txt");
    }
}
