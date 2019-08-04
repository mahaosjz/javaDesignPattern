package designpatten.prototype;

/**
 * @author hao
 * @title: SRS
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/116:20
 */
public class SRS implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            e.printStackTrace();
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
