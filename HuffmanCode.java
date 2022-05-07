import java.util.*;

public class HuffmanCode {
    public static void main(String[] args){
        String content  = "i like like like java do you like a java";
        //得到字节数组
        byte[] contentBytes = content.getBytes();
        System.out.println(contentBytes.length); //40；获得content字符串的长度

        //1前序遍历看对不对
        List<Node> nodes = getNodes(contentBytes);
        System.out.println("nodes=" + nodes);

        //2测试创建的树
        System.out.println("哈弗曼树");
        Node huffmanTreeRoot = createHuffmanTree(nodes);
        System.out.println("前序遍历");
        huffmanTreeRoot.preOrder();

        //3测试是否有哈弗曼编码表:getCodes(huffmanTreeRoot,"",stringBuilder);//根结点没有左右，所以是空
        //简单调用
        Map<Byte,String> huffmanCodes =getCodes(huffmanTreeRoot);
        System.out.println("生成的哈夫曼编码表"+ huffmanCodes);

        //4压缩后测试
        byte[] huffmanCodeBytes = zip(contentBytes,huffmanCodes);
        System.out.println("huffmanCodeBytes=" + Arrays.toString(huffmanCodeBytes));//17个

    }

    //将字符串对应的byte[]数组，通过生成的哈夫曼编码表，返回一个哈夫曼编码压缩后的字节数组byte[ ]
    //传入：bytes：原来的字符串对应的字节数组
    //     huffmanCodes生成的哈夫曼编码表map
    //返回：返回哈法曼树处理后（经过压缩）的byte数组
    private static byte[] zip(byte[] bytes,Map<Byte,String> huffmanCodes){
        //利用huffmanCodes将bytes转换成 哈弗曼树对应的字符串
        StringBuilder stringBuilder = new StringBuilder();
        //遍历bytes数组
        for(byte b:bytes){
            stringBuilder.append(huffmanCodes.get(b));
        }

        //System.out.println("测试stringBuilder=" +stringBuilder.toString());

        //将哈夫曼编码（01这种）转成byte[]字节数组，八位一个字节

        //统计返回byte[] huffmanCodeBytes的长度
        int len;
        if(stringBuilder.length()%8==0){
            len = stringBuilder.length()/8;
        }
        else{
            len = stringBuilder.length() /8+1;  //位数不够8位
        }

        //创建存储压缩之后的byte数组
        byte[] huffmanCodeBytes = new byte[len];
        int index =0;//记录是第几个Byte
        for(int i=0;i<stringBuilder.length();i+=8){
            String strByte;
            if(i+8 > stringBuilder.length()){
                strByte = stringBuilder.substring(i);
            }
            else{
                strByte = stringBuilder.substring(i,i+8);
            }

            //将strByte转成一个byte，放入到huffmanCodeBytes
            huffmanCodeBytes[index] = (byte)Integer.parseInt(strByte,2);
            index++;
        }
        return huffmanCodeBytes;
    }


    //生成哈弗曼树对应的哈弗曼编码（左边0，右边1）
    //思路：
    //1.将哈弗曼树编码表存放在Map<Byte,String>中；形式是：97对应 01（01就是哈夫曼编码）
    static Map<Byte,String> huffmanCodes = new HashMap<Byte,String>();
    //2.在生成哈夫曼编码表，需要拼接路径，也就是连起来的0，1，定义一个StringBuilder存储某个叶子结点的路径
    static StringBuilder stringBuilder = new StringBuilder();

    //简便调用方法，重载getCodes
    private static Map<Byte,String> getCodes(Node root){
        if(root==null){//是空的时候
            return null;
        }
        else {
            //处理左边
            getCodes(root.left, "0", stringBuilder);
            //处理右边
            getCodes(root.right, "1", stringBuilder);

        }
        return huffmanCodes;
    }

    //将传入的node结点的所有叶子结点的哈弗曼编码存放在huffmancodes中
    //node :传入结点
    //code： 路径就是0，1【左子结点0，右子节点1】
    //stringBuilder 用来拼接0，1
    private static void getCodes(Node node,String code,StringBuilder stringBuilder){
        StringBuilder stringBuilder2 =new StringBuilder(stringBuilder);
        //将code(0,1)加入到stringBuilder中之后连起来
        stringBuilder2.append(code);
        if(node != null){ //如果node == null ，不处理
           //判断当前node是叶子结点还是非叶子结点
            if(node.data == null){//非叶子结点
              //需要递归处理，是非叶子结点表示还没有到头，需要继续下去

                //向左递归，0
                getCodes(node.left,"0",stringBuilder2);

                //向右递归，1
                getCodes(node.right,"1",stringBuilder2);

            }
            else{//不等于null，就表示是叶子结点，表示找到了叶子结点的尾部
                huffmanCodes.put(node.data,stringBuilder2.toString());//转成字符串

            }

        }
    }

    //前序遍历方法
    private static void preOrder(Node root){
        if(root != null){
            root.preOrder();
        }
        else{
            System.out.println("空树");
        }
    }


    //传进去：字节数组byte[] bytes
    //返回：List<Node>,形式【Node[date=97,weight = 5】
    private static List<Node> getNodes(byte[] bytes){
        //创建ArrayLIst
        ArrayList<Node> nodes =new ArrayList<Node>();

        //遍历字节数组，统计并且存储每一个byte出现的次数：map
        Map<Byte,Integer> counts =new HashMap(); //Integer表述次数
        for(byte b : bytes){
            Integer count =counts.get(b);
            if(count == null){ //第一次的时候，Map中还没有存放字符数据
                counts.put(b,1);
            }
            else{
                counts.put(b,count+1);//不是第一次
            }
        }
        //把每个键值对转成一个Node对象，并且加入到nodes集合
        for(Map.Entry<Byte,Integer> entry: counts.entrySet()){//遍历map
            nodes.add(new Node(entry.getKey(), entry.getValue()));
        }
        return nodes;
    }

    //通过list创建哈弗曼树
    //传进去：nodes
    //传出来：根节点
    private static Node createHuffmanTree(List<Node> nodes){
        while(nodes.size() >1){
            //排序从小到大
            Collections.sort(nodes);
            //取最小的
            Node leftNode = nodes.get(0);
            //取出第二小
            Node rightNode =nodes.get(1);
            //创建一颗新的二叉树，根节点没有data，只有权值，数据存在叶子结点
            Node parent = new Node(null,leftNode.weight+ rightNode.weight);
            parent.left=leftNode;
            parent.right=rightNode;

            //删除处理过的数据
            nodes.remove(leftNode);
            nodes.remove(rightNode);

            //将新的二叉树加入到node中
            nodes.add(parent);

        }
        //返回根节点
        return nodes.get(0);
    }
}



//创建Node，放数据和权值
class Node implements Comparable<Node>{
    Byte data;//存放数据本身，eg:a是97，b是98
    int weight;//权值，表示字符出现的次数
    Node left;
    Node right;
    public Node(Byte data,int weight){ //构造器
        this.data = data;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node o){
        return this.weight - o.weight;//从小到大排序

    }

    public String toString() {
        return "Node [data = " + data + "  weight = " + weight + "]";
    }//打印结点信息

    //前序遍历
    public void preOrder(){
        System.out.println(this);
        if(this.left != null){
            this.left.preOrder();
        }
        if(this.right != null){
            this.right.preOrder();
        }
    }

}