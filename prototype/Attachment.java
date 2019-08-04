package designpatten.prototype;

import java.io.Serializable;

/**
 * @author hao
 * @title: Attachment
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/116:12
 */
public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
