package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @BeforeAll
    public static void setUp(){
        System.out.println("before all");
    }

    @BeforeEach
    public void setUpEach(){
        System.out.println("before each");
    }

    @AfterAll
    public static void setUpAll(){
        System.out.println("after all");
    }

    @AfterEach
    public void setUpAllEach(){
        System.out.println("after each");
    }

    @Test
    @DisplayName("Проверка суммирования 1")
    @Timeout(10)
    @Tag("summ")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result, "Не тот ответ");
    }

    @RepeatedTest(10)
    @DisplayName("Проверка суммирования 2")
    @Timeout(10)

    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(1, 6);
        Assertions.assertEquals(7, result,"Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - сложение {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @DisplayName("Проверка суммирования 3")
    @Tag("param")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result,"Не тот ответ");
    }

    @ParameterizedTest(name = "Тесты на проверку падения")
    @CsvSource({"1, 2, 4", "-1, -2, 5"})
    @DisplayName("Проверка суммирования 4")
    @Tag("param")
    @Tag("summ")
    void summ4(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int result = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }

    @Test
    @DisplayName("Проверка вычитания")
    void subt1() {
        Calc calc = new Calc();
        int result = calc.subt(1, 6);
        Assertions.assertEquals(-5, result, "Не тот ответ");
    }

    @ParameterizedTest(name = "#{index} - вычитание {0} и {1}, ожидаем {2}")
    @CsvSource({"1, 1, 0", "-1, -2, 1"})
    @DisplayName("Проверка вычитания 2")
    @Tag("param")
    @Tag("subt")
        void subt2(int c, int d, int expectedResult) {
            Calc calc = new Calc();
            int result = calc.subt(c, d);
            Assertions.assertEquals(expectedResult, result, "Не тот ответ");
    }
}