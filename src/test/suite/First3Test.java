package test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.*;

@RunWith(Suite.class)
@SuiteClasses({ DateTest.class, LicensePlateTest.class })
public class First3Test {

}
