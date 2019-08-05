package designpatten.facadepattern;

/**
 * @author hao
 * @title: EncryptFacade
 * @projectName JavaDemo
 * @description: 加密外观类，充当外观类。
 * @date 2019/8/5 14:58
 */
public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.writer = new FileWriter();
    }

    public void fileEncryPt(String fileName) {
        String plainStr = reader.read(fileName);
        String encryptStr = cipher.encrypt(fileName);
        writer.write(encryptStr);
    }
}
