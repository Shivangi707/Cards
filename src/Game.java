public class Game extends DeckOfCards {
  static  int A,B;
    public  void distributeCards() {
        int first = 0, second = 0;
        Card obj;
        String s;
        for (int i = 0; i < 6; i++) {
            if (i % 2 == 0) {
                obj = Deal();
                first += obj.help();
               // System.out.println(first);
            } else {
                obj = Deal();
                second += obj.help();
               //System.out.println(second);
            }}

            if (first > second)
                A += 1;
            else
                B += 1;

    }
        public static void main(String[] args){
        Game obj= new Game();
       // DeckOfCards obj2= new DeckOfCards();

     for(int j=0;j<5;j++){
         obj.Shuffle();
       obj.distributeCards();
     }
     if(A>B) {
         System.out.println("A is a winner");
     }
     else
         System.out.println("B is a winner");
     }
        }

