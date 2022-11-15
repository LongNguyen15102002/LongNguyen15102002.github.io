package com.example.miniexamplebuoi2spring;

import com.example.miniexamplebuoi2spring.service.ColorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class Miniexamplebuoi2springApplicationTests {

    @Autowired
    private ColorService colorService;

    @Test
    void test_randomRgbColor() {
        String rs = colorService.randomRgbColor();

        assertThat(rs).isNotNull();
        assertThat(rs).isEqualTo("rgb(11,23,124)");
        assertThat(rs).startsWith("rgb");
    }
}
