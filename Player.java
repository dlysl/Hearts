import java.util.List;
import java.util.ArrayList;

public class Player{

  String name = "";
  int score = 0;
  Card[] hand = new Card[13];

  public Player(String name){
    this.name = name;
  }

  // sett elements

  public void addHand(int index, Card card){
    this.hand[index] = card;
  }

  public void setScore(int score){
    this.score = score;
  }

  // call elements

  public String getName(){
    return this.name;
  }

  public int getScore(){
    return this.score;
  }

  public Card[] getHand(){
    retun
  }

}
