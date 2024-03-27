public class Card{
  int point = 0;
  int ranking = 0;
  String suit = "";

  public Card(int ranking, String suit, int point){
    this.ranking = ranking;
    this.suit = suit;
    this.point = point;
  }

  // call element value

  public int getPoint(){
    return this.point;
  }

  public int getRanking(){
    return this.ranking;
  }

  public String getSuit(){
    return this.suit;
  }

}
