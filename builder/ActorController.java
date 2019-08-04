package designpatten.builder;

/**
 * @author hao
 * @title: ActorController
 * @projectName JavaDemo
 * @description: 指挥者
 * @date 2019/8/118:51
 */
public class ActorController {
    // 逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {

        ab.buildFace();
        ab.buildSex();
        ab.buildType();
        //通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }
        Actor actor = ab.createActor();
        return actor;
    }
}
