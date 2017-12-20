package d_enumerations.exercise.p01_suit_cards;

@CustomEnumAnnotation(category = "Suit",description = "Provides suit constants for a Card class.")
public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    Suit(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        //return String.format("Ordinal value: %d; Name value: %s",this.ordinal(),this.name());
        return this.name();
    }
}
