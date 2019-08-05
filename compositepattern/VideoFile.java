package designpatten.compositepattern;

/**
 * @author hao
 * @title: TextFile
 * @projectName JavaDemo
 * @description: TODO 视频文件类：叶子构件
 * @date 2019/8/5 10:53
 */
public class VideoFile extends AbstractFile {
    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    void killVirus() {
        //模拟杀毒
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }
}
