public class TestStackOfIntegers {
    public static void main(String[] args){
        StackOfIntegers stack = new StackOfIntegers();

        for(int i = 0;i<10;i++)
            stack.push(i);

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}

class StackOfIntegers {  //创建类
    private int[] elements;  //一个存储栈中整数的数组
    private int size;  //栈中整数的个数
    public static final int DEFAULT_CAPACITY = 16; //默认容量为16的空栈

    public StackOfIntegers() {  //无参构造方法
        this(DEFAULT_CAPACITY);//构建一个默认容量为16的空栈
    }

    public StackOfIntegers(int capacity) { //构建一个指定容量的空栈
        elements = new int[capacity];
    }

    public void push(int value) {  //将一个整数存储到栈顶
        if (size >= elements.length) {    //如果栈已经满了的话
            int[] temp = new int[elements.length * 2];//则创建一个容量为当前容量两倍的新数组
            System.arraycopy(elements, 0, temp, 0, elements.length); //将数组的内容复制到另一个数组中
            elements = temp;   //将新数组的引用赋值给栈中的当前数组
        }

        elements[size++] = value;  //现在就可以给这个数组添加新值
    }

    public int pop() {  //删除栈顶整数并且返回该数
        return elements[--size];
    }


    public int peek() {   //返回栈顶的整数而不从栈中删除该数
        return elements[size - 1];  //【size-1】是栈顶元素的下标
    }

    public boolean empty() { //如果栈为空则返回true
        return size == 0;
    }

    public int getSize() {  //返回栈中元素的个数
        return size;
    }
}

