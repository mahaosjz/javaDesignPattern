package designpatten.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hao
 * @title: Folder
 * @projectName JavaDemo
 * @description: TODO 文件夹类：容器构件
 * @date 2019/8/5 10:55
 */
public class Folder extends AbstractFile {
    //定义集合fileList，用于存储AbstractFile类型的成员
    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return (AbstractFile) fileList.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");        //模拟杀毒
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
