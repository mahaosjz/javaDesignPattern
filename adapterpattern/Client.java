package designpatten.adapterpattern;

/**
 * @author hao
 * @title: Client
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/8/4 15:47
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation operation; //针对抽象目标接口编程
        operation = (ScoreOperation) XMLUtil.getBean();// 读取配置文件，反射生成对象
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96};    //定义成绩数组
        int result[];
        int score;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);

        for (int i : scores) {
            System.out.println(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        score = operation.search(result,90);
        if(score!=-1){
            System.out.println("找到成绩90。");
        }else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        score = operation.search(result,92);
        if(score!=-1){
            System.out.println("找到成绩92。");
        }else {
            System.out.println("没有找到成绩92。");
        }
    }
}
