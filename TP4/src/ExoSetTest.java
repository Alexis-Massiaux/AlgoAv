import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExoSetTest {
    Set<Integer> ens1;
    Set<Integer> ens2;
    Set<Integer> inter;
    Set<Integer> union;

    @Before
    public void ready() {
        ens1 = new HashSet<Integer>();
        ens2 = new HashSet<Integer>();
        inter = new HashSet<Integer>();
        union = new HashSet<Integer>();
        ens1.add(18);
        ens1.add(22);
        ens1.add(33);
        ens2.add(18);
        ens2.add(22);
        ens2.add(33);
        ens2.add(49);
        ens2.add(86);
        inter.add(18);
        inter.add(22);
        inter.add(33);
        union.add(18);
        union.add(22);
        union.add(33);
        union.add(18);
        union.add(22);
        union.add(33);
        union.add(49);
        union.add(86);
    }

    @Test
    public void testInter() {
        Set<Integer> result = new HashSet<Integer>();
        result = ExoSet.inter(ens1, ens2);
        assertEquals(result, inter);
    }

    @Test
    public void testUnion() {
        Set<Integer> result = new HashSet<Integer>();
        result = ExoSet.union(ens1, ens2);
        assertEquals(result, union);
    }

    @Test
    public void testIsIn() {
        boolean test = ExoSet.isIn(ens1, ens2);
        assertTrue(test);
    }
}
