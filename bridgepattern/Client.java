package designpatten.bridgepattern;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/4 16:44
 */
public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImp imageImp;
        image = (Image) XMLUtil.getBean("image");
        imageImp = (ImageImp) XMLUtil.getBean("os");

        image.setImageImp(imageImp);
        image.parseFile("小龙女");
    }
}
