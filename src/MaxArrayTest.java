import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxArrayTest {
    @Test
    public void testFindMaxPositif() {
        assertEquals("Gagal pemeriksaan Positif", 4, MaxArray.findMax(new int[]{1,3,4,2}));
    }
}
