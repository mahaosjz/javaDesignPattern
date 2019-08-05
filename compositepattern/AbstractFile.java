package designpatten.compositepattern;

/**
 * @author hao
 * @title: AbstractFile
 * @projectName JavaDemo
 * @description: TODO 抽象文件类：抽象构件
 * @date 2019/8/5 10:49
 */
public abstract class AbstractFile {
    abstract void add(AbstractFile file);

    abstract void remove(AbstractFile file);

    abstract AbstractFile getChild(int i);

    abstract void killVirus();

}
