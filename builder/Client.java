package designpatten.builder;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/118:53
 */
public class Client {
    public static void main(String[] args) {
        //针对抽象建造者编程
        ActorBuilder ab = (ActorBuilder) XMLUtil.getBean();    //反射生成具体建造者对象
        ActorController ac = new ActorController();
        Actor actor = ac.construct(ab);    //通过指挥者创建完整的建造者对象
        System.out.println(actor.getType() + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
