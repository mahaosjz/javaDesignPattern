package designpatten.prototype;

/**
 * @author hao
 * @title: FAR
 * @projectName JavaDemo
 * @description: 可行性分析报告(Feasibility Analysis Report)类
 * @date 2019/8/116:19
 */
public class FAR implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            e.printStackTrace();
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
