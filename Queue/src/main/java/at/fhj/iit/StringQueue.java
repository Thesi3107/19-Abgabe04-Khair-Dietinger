package at.fhj.iit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

/**
 * StringQueue class contains an default constructor which sets the size of the
 * queue on 5 There is also an constructor which can set the size on which you
 * want to StringQueue also implements Queue
 * 
 * @author Theresa Dietinger, Patrick Khair
 * @since 31.05.2019
 * @version 1.0
 */

public class StringQueue implements Queue {

	private static final Logger logger = LogManager.getLogger(StringQueue.class);

	private List<String> elements = new ArrayList<String>();
	private int maxSize = 5;

	public StringQueue() {
		logger.info("Default Constructor with size: " + maxSize);
	}

	public StringQueue(int maxSize) {
		logger.info("Constructor called with size: " + maxSize);
		this.maxSize = maxSize;
	}

	/**
	 * Adds the element obj to the queue.
	 * 
	 * @param obj you want to add
	 * @return true if succeeded else false
	 */
	@Override
	public boolean offer(String obj) {
		if (elements.size() != maxSize) {
			logger.info("Adds " + obj + " to the queue");
			elements.add(obj);
		} else {
			logger.info("Can't add " + obj + " because queue is vull");
			return false;
		}
		return true;

	}

	/**
	 * Returns the head (first) element and also deletes it. That is, we cannot get
	 * it again. If no element exists (when queue is empty), the method returns
	 * null.
	 * 
	 * @return if an element exists the head-element else null
	 */
	@Override
	public String poll() {
		String element = peek();

		logger.info("Return und delete: " + element);
		if (elements.size() != 0) {
			elements.remove(0);
		}

		return element;
	}

	/**
	 * It also returns and deletes the head element like poll(), but with a small
	 * difference.
	 * 
	 * @return head-element if exists
	 * @exception NoSuchElementException if queue is empty
	 */
	@Override
	public String remove() {
		String element = poll();
		if (element == null) {
			logger.error("throw NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		logger.info("Return and delete: " + element);
		return element;
	}

	/**
	 * Returns the head element but it does not delete it. That is, we can get it
	 * again.
	 * 
	 * @return return head-element if exists else null
	 */
	@Override
	public String peek() {
		String element;
		if (elements.size() > 0) {
			element = elements.get(0);
			logger.info("Returns: " + element);
		} else {
			element = null;
			logger.info("Returns: " + element);
		}
		return element;
	}

	/**
	 * It works similar to peek() but with a small difference (returns but does not
	 * delete the element). It throws NoSuchElementException when the queue is
	 * empty.
	 * 
	 * @return head element if net empty
	 * @exception NoSuchElementException if the queue is empty
	 */
	@Override
	public String element() {
		String element = peek();
		if (element == null) {
			logger.error("throw NoSuchElementException");
			throw new NoSuchElementException("there's no element any more");
		}
		logger.info("Returns: " + element);
		return element;
	}

}