package designpatten.adapterpattern;

/**
 * @author hao
 * @title: OperationAdapter
 * @projectName JavaDemo
 * @description: TODO 适配器
 * @date 2019/8/4 15:44
 */
public class OperationAdapter implements ScoreOperation {

    //定义适配者QuickSort对象
    private QuickSort sortObj;
    //定义适配者BinarySearch对象
    private  BinarySearch searchObj;

    public OperationAdapter() {
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    /**
     * 功能描述：调用适配者类QuickSort的排序方法
     * @param: [array]
     * @return: int[]
     * @auther: hao
     * @date: 2019/8/4 15:46
     */
    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    /**
     * 功能描述：调用适配者类BinarySearch的查找方法
     * @param: [array, key]
     * @return: int
     * @auther: hao
     * @date: 2019/8/4 15:46
     */
    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array,key);
    }
}
