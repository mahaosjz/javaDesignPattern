package designpatten.compositepattern;

/**
 * @author hao
 * @title: ImageFile
 * @projectName JavaDemo
 * @description: TODO 图像文件类：叶子构件
 * @date 2019/8/5 10:51
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    void killVirus() {
        //模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}
