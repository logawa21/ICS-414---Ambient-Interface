package edu.hawaii.test1;

import junit.framework.TestCase;

/**
 * Created by logawa on 12/4/15.
 */
public class MainActivityTest extends TestCase {
    private MainActivity txt;

    // Runs before all of the @Test methods
    // @Before
    public void setUp() throws Exception {
        txt = new MainActivity();
        super.setUp();
    }

    // Don't need to test this as the the first two lines calls to the base class?
    public void testOnCreate() throws Exception {

    }
}