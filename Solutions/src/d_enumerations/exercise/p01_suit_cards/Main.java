package d_enumerations.exercise.p01_suit_cards;

public class Main {
    public static void main(String[] args) {
        for (Suit s:Suit.values()
             ) {
            for (Rank r:Rank.values()
                 ) {
                System.out.println(r+" of "+s);
            }
        }
    }
}
