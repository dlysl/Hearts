import java.util.Random;

public class DealerFunction{


  public static Card[] generateDeck(){
    Card[] deck = new Card[52];
    /*
    Steps:
    1.) Create a loop that would run 4 times (one for each suit)
    2.) Creat another loop that would create 13 cards of each suit
    */
    for(int i = 0; i < 4; i++){
      String[] suits = {"Heart", "Spade", "Diamond", "Club"};
      for(int j = 1; j <= 13; j++){
        deck[(i  * 13) + j - 1] = new Card(j, suits[i], 0);
      }
    }
    return deck;
  }

  public static void distributeCard(Player[] players, Card[] deck){
    Random random = new Random();
    int remaining_card = 52;
    /*
    Steps:
    1. Loop 13 times, as we are giving one card to each player per loop
    2. Loop 4 times inside the 13 loop, to distribute one card per player
    */
    for(int i = 0; i < 13; i++){
      for(int j = 0; j < 4; j++){
        int random_number = random.nextInt(remaining_cards);
        players[j].addHand(i, deck[random_number]);
      }
    }
  }


}
