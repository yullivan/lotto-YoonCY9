package lotto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

class ApplicationTests {

    @Test
    void name() {

        LottoCount a = new LottoCount(10000);
        assertThat(a.count()).isEqualTo(10);

    }

    @Test
    void 랜덤넘버테스트() {
        LottoNumber lottoNumber = new LottoNumber();
        System.out.println(lottoNumber.getNumList());
    }

    @Test
    void 당첨번호테스트() {
        // 스캐너는 테스트가 안되어서 메인메서드에서 대신함

        LottoResult result = new LottoResult();
        LottoNumber lottoNumber = new LottoNumber();
        System.out.println(lottoNumber.getNumList());
        result.WhatRank(lottoNumber);
        LottoResult result1 = new LottoResult();
        result1.getWinNumberList();
    }
}
