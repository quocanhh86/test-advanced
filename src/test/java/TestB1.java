import org.example.Bai1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestB1 {
    Bai1 bai1 = new Bai1();

    @Test
    public void testDivideSix() {
        String exp = "Số có chia hết cho 6";
        String act = bai1.divideSix(36);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testNotDivideSix() {
        String exp = "Số không chia hết cho 6";
        String act = bai1.divideSix(20);
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void testDivideSix_Ex() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bai1.divideSix(-2));
    }
}
