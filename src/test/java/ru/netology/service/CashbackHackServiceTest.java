package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void testRemainLessThenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 400;
        int expected = 600;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainMoreThenBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqualsBoundary() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainZero() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainLessThenBoundaryAPI() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 400;
        int expected = 600;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainMoreThenBoundaryAPI() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 1500;
        int expected = 500;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainEqualsBoundaryAPI() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 1000;
        int expected = 0;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemainZeroAPI() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 0;
        int expected = 1000;
        int actual = cashbackHackService.remain(amount);
        Assertions.assertEquals(expected, actual);
    }
}