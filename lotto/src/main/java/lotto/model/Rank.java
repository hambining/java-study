package lotto.model;

public enum Rank {
    FIRST(6, 2000000000),
    SECOND(5, 30000000),
    THIRD(5, 1500000),
    FOURTH(4, 50000),
    FIFTH(3, 5000),
    NONE(0, 0);

    private final int hits;
    private final int prize;

    Rank(int hits, int prize) {
        this.hits = hits;
        this.prize = prize;
    }

    public int getHits() {
        return hits;
    }

    public int getPrize() {
        return prize;
    }

    public static Rank getRank(int hits, boolean hasBonusNumber) {
        if (hits == FIRST.getHits()) return FIRST;
        if (hits == SECOND.getHits() && hasBonusNumber) return SECOND;
        if (hits == THIRD.getHits() && !hasBonusNumber) return THIRD;
        if (hits == FOURTH.getHits()) return FOURTH;
        if (hits == FIFTH.getHits()) return FIFTH;
        return NONE;
    }
}
