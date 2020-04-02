
/**
 * TiminigExtension.class 
 *
 * to compute the time for each test method
 *
 * @author  Abel Ticona
 * @version 1.0
 * @since   2020
 *
 */
import java.util.HashMap;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TimingExtension {

  private final HashMap<String, Long> times = new HashMap<String, Long>();
  private static final Logger logger = Logger.getLogger(TimingExtension.class.getName());

  @BeforeEach
  public void beforeTestExecution(TestInfo testInfo) {
    this.times.put(testInfo.getDisplayName(), System.currentTimeMillis());
  }

  @AfterEach
  public void afterTestExecution(TestInfo testInfo) {
    String nameKey = testInfo.getDisplayName();
    this.times.put(nameKey, System.currentTimeMillis() - this.times.get(nameKey));
  }

  @AfterAll
  public void logTime() {

    for (String nameKey : times.keySet()) {
      logger.info(() -> String.format("This method took %s ms.", nameKey, this.times.get(nameKey)));
    }
  }
}