package designpatten.bridgepattern;

/**
 * @author hao
 * @title: UnixImp
 * @projectName JavaDemo
 * @description: TODO Unix操作系统实现类：具体实现类
 * @date 2019/8/4 16:39
 */
public class UnixImp implements ImageImp {
    /**
     * 功能描述：调用Unix系统的绘制函数绘制像素矩阵
     *
     * @param: [m]
     * @return: void
     * @auther: hao
     * @date: 2019/8/4 16:37
     */
    @Override
    public void doPaint(Matrix m) {
        System.out.print("在Unix操作系统中显示图像：");
    }
}
