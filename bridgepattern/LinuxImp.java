package designpatten.bridgepattern;

/**
 * @author hao
 * @title: LinuxImp
 * @projectName JavaDemo
 * @description: TODO /Linux操作系统实现类：具体实现类
 * @date 2019/8/4 16:37
 */
public class LinuxImp implements ImageImp {
    /**
     * 功能描述：调用Linux系统的绘制函数绘制像素矩阵
     * @param: [m]
     * @return: void
     * @auther: hao
     * @date: 2019/8/4 16:37
     */
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在Linux操作系统中显示图像：");
    }
}
