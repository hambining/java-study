package lotto.model;

import java.util.ArrayList;
import java.util.List;

public class Lottos {
    private final List<Lotto> lottos;

    public Lottos(int ticket) {
        this.lottos = new ArrayList<>(ticket);
        for (int i = 0; i < ticket; i++) {
            lottos.add(Lotto.generateLotto());
        }
    }

    public List<Lotto> getLottos() {
        return lottos;
    }
}
