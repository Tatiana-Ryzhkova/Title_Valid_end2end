package core;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import core.SeleniumTest;

@RunWith(Suite.class)
@SuiteClasses({
	SeleniumTest.class
})
public class AllTests {

}
