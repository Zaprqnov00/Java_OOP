package T1_Abstraction.Exercices.CardSuit_01;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    CardSuits(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
