# 装饰模式-Decorator Pattern
【学习难度：★★★☆☆，使用频率：★★★☆☆】

可以在不改变一个对象本身功能的基础上给对象增加额外的新行为。

使用的时替代继承的技术，通过一种无须定义子类的方法给对象动态增加职责。关系关系取代继承关系。装饰类即可以调用原有类的方法，还可以
增加新的方法。

JavaIO中的输入流和输出流的设计

## 定义
动态的给一个对象增加一些额外的职责，比生成子类更加灵活。是一种对象结构型模式。
## 角色
- Component（抽象构件）：它是具体构件和抽象装饰类的共同父类，声明业务方法，使得客户端以一致的方式处理未被装饰的对象以及装饰
之后的对象。
- ConcreteComponent（具体构件）：Component子类，实现业务方法，装饰器可以增加额外的职责。
- Decorator（抽象装饰类）：Component子类，用于增加职责，维护一个指向抽象构件对象的引用，扩展子类方法，达到装饰目的。
- ConcreteDecorator（具体装饰类）：Decorator子类，定义新的行为添加新的职责，可调用抽象装饰类的方法，并可以增加新的方法扩充对象。

```java
class Decorator implements Component{
    private Component component; //维持一个对抽象对象的引用
    public Decorator (Component component){ 	//注入一个抽象构件类型的对象 
        this.component = component;
    }
    public void operation(){
        component.operation(); //调用原有业务方法
    }
}

class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }
    @Override
    public void operation(){
        super.operation();	//调用原有业务方法 
        addBehavior();//调用新增业务方法 
    }
    //新增业务方法
    public void addBehavior(){
        
    }
}
```

## 透明装饰模式
要求客户端完全针对抽象编程，要求客户端程序不应该将对象声明为具体构件类型或具体装饰类型，应当是抽象构件类型。
## 半透明装饰模式
需要单独调用新增的业务方法，不得不用具体装饰类来定义装饰后的对象，具体构件类型仍可以使用抽象构件类型。
客户端无须关系构件类型，必须指定具体装饰类型。
缺点:不能实现对同一个对象的多次装饰。

## 注意点
1. 保持装饰类和被装饰类接口相同，客户端可以一致对象，即尽量使用透明装饰模式
2. 具体构建类ConcreteComponetn尽量是一个“轻”类，即不要把太多的行为放在具体构建类中，可以通过装饰类对其进行扩展。
3. 若只有一个具体构建类，抽象装饰类可以作为具体构建类的直接子类。

## 优点
1. 装饰模式比继承更加灵活的扩展一个对象，不会导致类的个数急剧增加
2. 可以动态的扩展一个对象的功能
3. 可以多次装饰。
4. 具体构建类和具体装饰类可独立变化，符合“开闭原则”
## 缺点
1. 产生很多小对象，占用更多的系统资源。
2. 较为繁琐，比继承更加容易出错。
## 适用场景
1. 动态，透明的对单个对象增加职责
2. 不能采用继承方式扩展：1.存在大量独立的扩展，2.final类。
