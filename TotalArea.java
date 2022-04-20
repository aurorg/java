public class TotalArea {
    public static void main(String[] args){
        Circle5[] circleArray;

        circleArray = createCircleArray(); //创建一个由5个圆对象组成的数组

        printCircleArray(circleArray);
    }


    public static Circle5[] createCircleArray(){
        Circle5[] circleArray = new Circle5[5]; //声明并且创建了包含10个Circle5对象的数组；对象的数组实际上是引用变量的数组
                                                //使用new操作符创建数组了之后，这个数组中的每个元素都是默认值为null引用变量
        for (int i=0;i<circleArray.length;i++){  //初始化数组circleArray
            circleArray[i] = new Circle5(Math.random()*100); //通过随机数的方法获取圆的半径
        }
        return circleArray; //返回一个Circle5对象的数组，这个数组作为参数传给printCircleArray方法
    }


    public static void printCircleArray(Circle5[] circleArray){
      System.out.printf("%-30s%-15s\n","Radius","Area");
      for(int i=0;i<circleArray.length;i++){
          System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),
                  circleArray[i].getArea());
      }

      System.out.println("----------------------------------------");

      System.out.printf("%-30s%-15f\n","The total area of circles is",
              sum(circleArray));
    }
    public static double sum(Circle5[] circleArray){
      double sum =0;

      for(int i=0;i<circleArray.length;i++) {
          sum += circleArray[i].getArea();
      }

      return sum;

    }

}
class Circle5 {   // Circle5类
    public double radius; // 半径
    public final double PI = 3.14;

    // 返回半径
    public double getRadius() {
        return radius;
    }
    // 求面积
    public double getArea() {
        return radius * radius * PI;
    }
    // 有参构造
    public Circle5(double radius) {
        this.radius = radius;
    }
}

