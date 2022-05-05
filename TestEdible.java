public class TestEdible {
    public static void main(String[] args){
        Object[] objects = {new Tiger(),new Chicken(),new Apple()};
        for(int i =0;i<objects.length;i++){
            if(objects[i] instanceof Edible)
                System.out.println(((Edible)objects[i]).howToEat());
            if(objects[i] instanceof Animal){
                System.out.println(((Animal)objects[i]).sound());
            }
        }
    }
}

interface Edible{  //Edible接口定义了可食用对象的共同行为
    public abstract String howToEat();
}

abstract class Animal {
    private double weight;

    private double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }

    public abstract String sound();//定义一个sound方法,sound方法是一个抽象方法；被具体的animal类实现

}

//chicken类实现了Edible接口，表明小鸡是可以食用的
class Chicken extends Animal implements Edible{
    @Override
    public String howToEat(){  //当一个类实现接口的时候，该类实现了定义在接口中的所有方法
        return "Chicken: cock-a-doodle-doo";
    }
    @Override
    public String sound(){
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal{
    @Override
    public String sound(){
        return "Tiger: RROOAARR";
    }
}

//fruit类实现了Edible
abstract class Fruit implements Edible{//因为fruit类没有实现howtoeat方法，所以fruit必须被定义为abstract
                                       //fruit的子类必须实现howtoeat方法
}

class Apple extends Fruit{
    @Override
    public String howToEat(){
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat(){
        return "Orange: Make orange juice";
    }
}
