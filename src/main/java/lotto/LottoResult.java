package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoResult {

    private final List<Integer> winNumberList;

    public LottoResult() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
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

    public void printWinNumbers() {
        System.out.println(winNumberList.toString());
    }
}



