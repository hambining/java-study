package lotto.view;

public enum Messages {
    ENTER_MONEY("구입금액을 입력해 주세요."),
    ENTER_WINNING_NUMBERS("당첨 번호를 입력해주세요."),
    ENTER_BONUS_NUMBER("보너스 번호를 입력해주세요."),
    TICKETS("%d개를 구매했습니다"),
    LOTTO("%s"),
    RESULT("당첨통계\n---"),
    RESULT_DETAIL("%d개 일치 (%,d원) - %d개"),
    RESULT_WITH_BONUS_NUMBER("%d개 일치, 보너스 볼 일치 (%,d원) - %d개"),
    RATE_OF_RETURN("총 수익률은 %.2f%%입니다.");

    private final String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
