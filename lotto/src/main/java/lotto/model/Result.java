package lotto.model;

import java.util.EnumMap;
import java.util.Map;

public class Result {
    private final Map<Rank, Integer> results;

    public Result() {
        this.results = new EnumMap<>(Rank.class);
        // ENUM 필드 별 맵 생성 후 0으로 초기화
        for (Rank rank : Rank.values()) {
            results.put(rank, 0);
        }
    }

    public void addResult(Rank rank) {
        results.put(rank, results.get(rank) + 1);
    }

    public Map<Rank, Integer> getResults() {
        return results;
    }
}
