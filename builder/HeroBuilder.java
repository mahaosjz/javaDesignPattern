package designpatten.builder;

/**
 * @author hao
 * @title: HeroBuilder
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/118:49
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
