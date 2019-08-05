package designpatten.compositepattern;

/**
 * @author hao
 * @title: TextFile
 * @projectName JavaDemo
 * @description: TODO 文本文件类：叶子构件
 * @date 2019/8/5 10:53
 */
public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
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
        System.out.println("----对文本文件'"	+	name	+	"'进行杀毒");
    }
}
