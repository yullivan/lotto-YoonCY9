package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ui {
    private int lottoNumbers;
    private List<LottoNumber> randomNumbersList = new ArrayList<>();
    private double purchaseAmount;


    public void enterAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("구입금액을 입력해주세요.");
        LottoCount lottoCount = new LottoCount(scanner.nextInt());
        // 구매장수에 도로 1000을 곱하는게 마음에 안들긴함
        purchaseAmount = lottoCount.count() * 1000;
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
        int sixMatches = 0;
        int fiveMatches = 0;
        int fourMatches = 0;
        int threeMatches = 0;
        for (LottoNumber i : randomNumbersList) {
            rank = result.WhatRank(i);
            if (rank > 5) {
                sixMatches++;
            }
            else if (rank > 4) {
                fiveMatches++;
            }
            else if (rank > 3) {
                fourMatches++;
            } else if (rank == 3) {
                threeMatches++;
            }
        }
        System.out.println("3개일치 (5000원)-" + threeMatches + "개");
        System.out.println("4개일치 (50000원)-"+ fourMatches + "개");
        System.out.println("5개일치 (1500000원)-"+ fiveMatches + "개");
        System.out.println("6개일치 (2000000000원)-"+ sixMatches + "개");
        int threeMatchesPurchaseAmount = threeMatches * 5000;
        int fourMatchesPurchaseAmount = fourMatches * 50000;
        int fiveMatchesPurchaseAmount = fiveMatches * 1500000;
        int sixMatchesPurchaseAmount = sixMatches * 2000000000;
        int totalPurchaseAmount =
                threeMatchesPurchaseAmount +
                        fourMatchesPurchaseAmount+
                        fiveMatchesPurchaseAmount+
                        sixMatchesPurchaseAmount;
        System.out.println("총 수익률은" +
                ((totalPurchaseAmount - purchaseAmount) /
                        purchaseAmount + 1) + " 입니다.");
    }

}
