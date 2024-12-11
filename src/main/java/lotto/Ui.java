package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ui {
    private int lottoNumbers;
    private List<LottoNumber> randomNumbersList = new ArrayList<>();


    public void enterAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해주세요.");
        LottoCount lottoCount = new LottoCount(scanner.nextInt());

        System.out.println(lottoCount.count() + "개를 구매했습니다.");
        // 몇개구매했는지를 lottoNumbers에 복사
        this.lottoNumbers = lottoCount.count();
        // 구매한 갯수만큼 반복
        // 랜덤넘버리스트 첫번째와 내가 인풋한 리스트 첫번째와 비교 ~ 두번째 ~ 세번째
        for (int i = 0; i < lottoNumbers; i++) {
            LottoNumber randomNumbers = new LottoNumber();
            System.out.println(randomNumbers.getNumList());
            randomNumbersList.add(randomNumbers);
        }

    }
    public void winNumber() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        LottoResult result = new LottoResult();
        result.printWinNumbers();
        int rank;
        int 육개 = 0;
        int 오개 = 0;
        int 사개 = 0;
        int 삼개 = 0;
        for (LottoNumber i : randomNumbersList) {
            rank = result.WhatRank(i);
            if (rank > 5) {
                육개++;
            }
            else if (rank > 4) {
                오개++;
            }
            else if (rank > 3) {
                사개++;
            } else if (rank == 3) {
                삼개++;
            }
        }
        System.out.println("3개일치 (5000원)-" + 삼개 + "개");
        System.out.println("4개일치 (10000원)-"+ 사개 + "개");
        System.out.println("5개일치 (9000000원)-"+ 오개 + "개");
        System.out.println("6개일치 (10000000000000원)-"+ 육개 + "개");
    }

}
