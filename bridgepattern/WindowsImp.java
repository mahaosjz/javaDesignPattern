package designpatten.bridgepattern;

/**
 * @author hao
 * @title: WindowsImp
 * @projectName JavaDemo
 * @description: TODO Windows操作系统实现类：具体实现类
 * @date 2019/8/4 16:36
 */
public class WindowsImp implements ImageImp {
    /**
     * 功能描述：调用Windows系统的绘制函数绘制像素矩阵
     * @param: [m]
     * @return: void
     * @auther: hao
     * @date: 2019/8/4 16:37
     */
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在Windows操作系统中显示图像：");
    }
}
