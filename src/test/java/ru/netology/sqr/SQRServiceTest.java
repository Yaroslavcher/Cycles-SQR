package ru.netology.sqr;
import static org.junit.jupiter.api.Assertions.*;
public class SQRServiceTest {
    @org.junit.jupiter.api.Test
    void shouldOverMax() {
        SQRService service = new SQRService();

        //подготавливаем данные:
        long min = 100;
        long max = 10001;
        long expected = 90;

        //вызываем целевой метод:
        long actual = service.HowMnySqrsWithin(min, max);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldMaxRange() {
        SQRService service = new SQRService();

        //подготавливаем данные:
        long min = 100;
        long max = 9801;
        long expected = 90;

        //вызываем целевой метод:
        long actual = service.HowMnySqrsWithin(min, max);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldOverMinUnderMax() {
        SQRService service = new SQRService();

        //подготавливаем данные:
        long min = 101;
        long max = 9800;
        long expected = 88;

        //вызываем целевой метод:
        long actual = service.HowMnySqrsWithin(min, max);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldOverMinNoIteration() {
        SQRService service = new SQRService();

        //подготавливаем данные:
        long min = 101;
        long max = 120;
        long expected = 0;

        //вызываем целевой метод:
        long actual = service.HowMnySqrsWithin(min, max);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldOverMinOneIteration() {
        SQRService service = new SQRService();

        //подготавливаем данные:
        long min = 101;
        long max = 121;
        long expected = 1;

        //вызываем целевой метод:
        long actual = service.HowMnySqrsWithin(min, max);

        //производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
