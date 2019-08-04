package designpatten.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hao
 * @title: Subject类
 * @projectName JavaDemo
 * @description: TODO
 * @date 2019/5/2516:54
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
}
