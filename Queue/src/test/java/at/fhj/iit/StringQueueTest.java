package at.fhj.iit;


import junit.framework.TestCase.*;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringQueueTest {
    private StringQueue q1;
    private StringQueue q2;
    private int maxsize = 2;

    @Before
    public void SetUp(){
        q1 = new StringQueue();
        q2 = new StringQueue(maxsize);
    }

    @Test
    public void testOffer() {
        Assert.assertTrue(q1.offer("a"));
    }
    
    @Test
    public void testOffer1() {
    	Assert.assertTrue(q2.offer("b"));
    }
    
    //tests offer if queue is full
    @Test
    public void testOffer2() {
    	q2.offer("a");
    	q2.offer("b");
    	Assert.assertFalse(q2.offer("c"));
    }
    
    @Test
    public void testPoll() {
    	//returns null because q1 is empty
    	Assert.assertNull(q1.poll());
    }
    
    @Test
    public void testPoll1() {
    	//returns null because q2 is empty
    	Assert.assertNull(q2.poll());
    }
    @Test
    public void testPoll2() {
    	//returns null because q1 is empty
    	q1.offer("a");
    	Assert.assertNotNull(q1.poll());
    }
    
    @Test 
    public void testRemove() {
    	q1.offer("a");
    	Assert.assertEquals("a", q1.remove());
    }
    
    @Test (expected = NoSuchElementException.class)
    public void testRemove1() {
    	q1.remove();
    }
    
    @Test (expected = NoSuchElementException.class)
    public void testElement1() {
    	q1.element();
    }
    
    @Test
    public void testElement() {
    	q1.offer("a");
    	Assert.assertEquals("a", q1.element());
    }
    
    

}
