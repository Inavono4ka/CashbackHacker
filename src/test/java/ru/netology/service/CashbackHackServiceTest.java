package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void remain2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}
