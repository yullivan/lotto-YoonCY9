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


}
