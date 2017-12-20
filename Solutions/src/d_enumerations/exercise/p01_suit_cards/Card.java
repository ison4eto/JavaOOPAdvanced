package d_enumerations.exercise.p01_suit_cards;



public class Card implements Comparable<Card>{
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    private int calculatePower(){
        return this.suit.getPower()+this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank,this.suit,this.calculatePower());
    }

    @Override
    public int compareTo(Card o) {
        return Integer.compare(this.calculatePower(),o.calculatePower());
    }
}
