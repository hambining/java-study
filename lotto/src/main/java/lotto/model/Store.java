package lotto.model;

import static lotto.common.Constants.TICKET_PRICE;
import static lotto.view.ErrorMessages.INVALID_MONEY;

public class Store {

    public int calculateTickets(int money) {
        validateMoney(money);
        return money / TICKET_PRICE;
    }

    private void validateMoney(int money) {
        if (money % TICKET_PRICE != 0) {
            throw new IllegalArgumentException(INVALID_MONEY.getMessage());
        }
    }
}
