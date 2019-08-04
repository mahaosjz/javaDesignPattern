package designpatten.adapterpattern;

/**
 * @author hao
 * @title: ScoreOperation
 * @projectName JavaDemo
 * @description: TODO 充当抽象目标
 * @date 2019/8/4 15:36
 */
public interface ScoreOperation {
    int[] sort(int array[]);

    int search(int array[], int key);
}
