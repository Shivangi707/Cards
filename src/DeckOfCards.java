import java.lang.*;
import java.util.*;
//DeckOfCards class represents a deck of playing cards.
public class DeckOfCards {
    private Card[] deck; //array of Card objects
    private int currentCard; //index of next Card to be dealt(0-51)
    private int NUMBER_OF_CARDS = 52; //constant number of Cards
    private  Random randomNumbers;//random number generator

    //constructor fills deck of Cards
    public DeckOfCards(){
        String[] faces={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        String[] suits={"S","D","C","H"};

        deck = new Card[NUMBER_OF_CARDS];//create array of Card objects
        currentCard =0; //set currentCard so deck[0] is dealt first
        randomNumbers = new Random(); //create random number generator

//populate deck with Card objects
        for (int count =0; count<deck.length; ++count)
            deck[count]= new Card(faces[count % 13],suits[count/13]);
}//end DeckOfCards constructor

//shuffle deck of Cards with one-pass algorithm
    public void Shuffle(){
        //after shuffling, dealing should start at deck[0] again
        currentCard = 0;//reintialize currenntCard

        //for each Card, pick another random Card and swap them
        for ( int first=0; first<deck.length;++first){
            //select a random number between 0 to 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            //swap crrent Card with randomly selected Card
            Card temp =  deck [first];
            deck[first] = deck[second];
            deck[second] = temp;
        } //end for
    }// end method Shuffle

    //deal one Card
    public Card Deal(){
        //determine whether Cards remain to be dealt
        if(currentCard < deck.length)
            return deck[currentCard++]; //return current Card in array
        else
            return null; //indicate that all Cards were dealt
        }//end method DealCard
    }//end class DeckOfCards

