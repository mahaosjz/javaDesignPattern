package designpatten.bridgepattern;

/**
 * @author hao
 * @title: JPGImage
 * @projectName JavaDemo
 * @description: TODO BMP格式图像：扩充抽象类
 * @date 2019/8/4 16:39
 */
public class BMPImage extends Image {
    /**
     * 功能描述：模拟解析BMP文件并获得一个像素矩阵对象m;
     * @param: [fileName]
     * @return: void
     * @auther: hao
     * @date: 2019/8/4 16:40
     */
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName	+	"，格式为BMP。");
    }
}
