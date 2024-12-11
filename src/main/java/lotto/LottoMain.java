package lotto;

public class LottoMain {
    public static void main(String[] args) {


        Ui lotto = new Ui();

        // 구입금액입력해서 금액에 맞게 로또 자동생성
        lotto.enterAmount();

        // 당첨번호입력하고 구입한 로또랑 비교
        lotto.winNumber();



    }
}
