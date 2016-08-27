import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityQueueTest {
    @Test public void insertAndGetMaxWithOneItem() {
	PriorityQueue queue = new PriorityQueue();
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(1, max);
    }
}
