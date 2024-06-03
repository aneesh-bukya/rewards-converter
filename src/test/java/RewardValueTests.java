import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double testCashValue = 50;
        int expectedMilesValue = (int)(testCashValue / RewardValue.MILES_TO_CASH);
        var rewardValue = new RewardValue(testCashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int testMilesValue = 50;
        double expectedCashValue = testMilesValue * RewardValue.MILES_TO_CASH;
        var rewardValue = new RewardValue(testMilesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
