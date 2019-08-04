package designpatten.bridgepattern;

/**
 * @author hao
 * @title: Image
 * @projectName JavaDemo
 * @description: TODO 抽象图像类：抽象类
 * @date 2019/8/4 16:34
 */
abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
