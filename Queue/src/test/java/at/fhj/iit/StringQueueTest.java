package at.fhj.iit;


import java.util.NoSuchElementException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Testcases for StringQueue which implements Queue
 * 
 * @author Patrick Khair, Theresa Dietinger
 *
 */
public class StringQueueTest {
    private StringQueue q1;
    private StringQueue q2;
    private int maxsize = 2;
    private final Logger l = LogManager.getLogger(StringQueue.class);

    /**
     * creates one queue with relative size and another one with maxsize as 2
     */
    @Before
    public void SetUp(){
        q1 = new StringQueue();
        q2 = new StringQueue(maxsize);
    }

    /**
     * tests if offer adds an element correctly and returns true
     */
    @Test
    public void testOffer() {
        Assert.assertTrue(q1.offer("a"));
    }
    
    /**
     * tests the same but with q2
     */
    @Test
    public void testOffer1() {
    	Assert.assertTrue(q2.offer("b"));
    }
    
    /**
     * tests offer if queue is full - should return false
     */
    @Test
    public void testOffer2() {
    	q2.offer("a");
    	q2.offer("b");
    	Assert.assertFalse(q2.offer("c"));
    }
    
    /**
     * tests if poll returns null if there is no element added/offered
     */
    @Test
    public void testPoll() {
    	//returns null because q1 is empty
    	Assert.assertNull(q1.poll());
    }
    
    /**
     * tests the same but with q2
     */
    @Test
    public void testPoll1() {
    	//returns null because q2 is empty
    	Assert.assertNull(q2.poll());
    }
     
    /**
     * tests if poll does not return null if queue contains elements
     */
    @Test
    public void testPoll2() {
    	//returns  not null because q1 isn't empty
    	q1.offer("a");
    	Assert.assertNotNull(q1.poll());
    }
    
    
    /**
     * tests if element is removed correctly
     */
    @Test 
    public void testRemove() {
    	q1.offer("a");
    	Assert.assertEquals("a", q1.remove());
    }
    
    /**
     * tests if exception is thrown correctly if there is no element to be removed
     */
    @Test (expected = NoSuchElementException.class)
    public void testRemove1() {
    	q1.remove();
    }
    
    /**
     * tests if exception is thrown correctly if there is no element in queue
     */
    @Test (expected = NoSuchElementException.class)
    public void testElement1() {
    	q1.element();
    }
    
    /**
     * tests if element is returned correctly 
     */
    @Test
    public void testElement() {
    	q1.offer("a");
    	Assert.assertEquals("a", q1.element());
    }
    
    

}
