import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ageRestrictedTest1.class, ageRestrictedTest2.class, ageRestrictedTest3.class, getPriceTest1.class,
		getPriceTest2.class, getPriceTest3.class })
public class AllTests {

}
