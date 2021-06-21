//Card class represents a playing card.
public class Card{
        private String face; //face of card ("Ace", "Deuce",....)
        private String suit; //suit of card ("Hearts", "Diamonda",...)

        //two-parameter constructor initializes card's face and suit
        public Card(String cardFace, String cardSuit) {
            face=cardFace; //initialize face of card
            suit=cardSuit; //initialize suit of card
        }// end two-parameter Card constructor

        //return string reresentation of Card
    @Override
        public  String toString(){
            return (face + suit);
        }//end method ToString

    public int help(){
            if(face=="10")
                return 10;
            else if(face =="A")
                return 14;
            else if(face == "K")
                return 13;
            else if(face == "Q")
                return 12;
            else if(face == "J")
                return 11;
            else
                return Integer.parseInt(face);
    }
    }//end class Card


