import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    private PriorityQueue queue;

    @Before public void setup() {
	queue = new PriorityQueue();
    }

    @After public void teardown() {
	queue = null;
    }
    
    @Test public void insertAndGetMaxWithOneItem() {
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(1, max);
    }

    @Test public void insertAndGetMaxWithTwoItems() {
	queue.insert(2);
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(2, max);
    }

    @Test public void insertAndGetMaxWithUnorderedItems() {
	queue.insert(8);
	queue.insert(153);
	queue.insert(1);
	int max = queue.getMax();

	assertEquals(153, max);
    }

    @Test public void insertAndGetMaxWithMultipleInsertionsAndRetrievals() {
	queue.insert(5);
	queue.insert(1);
	queue.getMax();
	queue.insert(3);
	int max = queue.getMax();	
	assertEquals(3, max);
    }
    
}
