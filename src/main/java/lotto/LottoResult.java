package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoResult {

    private final List<Integer> winNumberList;

    public LottoResult() {
        this.winNumberList = winNumber();
    }

    // 당첨번호를 입력받고 그걸 리스트에 저장하는 함수
    private List<Integer> winNumber() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> winNumberList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int userInput = scanner.nextInt();
            if (userInput < 0 || userInput > 45) {
                throw new IllegalArgumentException("1부터 45까지의 값이 아닙니다.");
            }
            winNumberList.add(userInput);
        }
        return winNumberList;
    }

    public List<Integer> getWinNumberList() {
        return winNumberList;
    }

    // 당첨번호를 출력해주는 함수
    public void printWinNumbers() {
        System.out.println(winNumberList.toString());
    }

    public int WhatRank(LottoNumber randomNumbers) {
        int count = 0;
        List<Integer> randomNumbersList = randomNumbers.getNumList();
        List<Integer> winNumbersList = getWinNumberList();

        for (Integer num : randomNumbersList) {
            if (winNumbersList.contains(num)) {
                count++;
            }
        }
        return count;
    }






}



