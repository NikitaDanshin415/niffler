package niffler.tests.baseTest;

import niffler.jupiter.AroundSuiteExtension;
import niffler.jupiter.NifflerExtension;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({AroundSuiteExtension.class, NifflerExtension.class})
public abstract class BaseTestApi {
}
