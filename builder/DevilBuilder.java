package designpatten.builder;

/**
 * @author hao
 * @title: DevilBuilder
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/1 19:09
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    //覆盖钩子方法
    @Override
    public boolean isBareheaded() {
        return true;
    }
}
