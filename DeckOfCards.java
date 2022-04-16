public class DeckOfCards {
    public static void main(String[] args){
        int[] deck = new int[52];
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7",
                "8","9","10","Jack","Queen","King"};

        for(int i =0;i<deck.length;i++)
            deck[i]=i;

        //for循环中随机打乱牌的顺序
        for (int i=0;i<deck.length;i++){
            int index =(int)(Math.random()*deck.length);
            int temp =deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
        }

        for(int i=0;i<4;i++){
            String suit = suits[deck[i] /13]; //确定是那种花色
            String rank = ranks[deck[i] %13]; //确定牌的大小
            System.out.println("Card number " +deck[i] +
                    " : " + rank + " of " +suit);
        }
    }
}
