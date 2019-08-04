package designpatten.builder;

/**
 * @author hao
 * @title: Actor
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/118:47
 */
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String hairstyle;    //发型

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}
