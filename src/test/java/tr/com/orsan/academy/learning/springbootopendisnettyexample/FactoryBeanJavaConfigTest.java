package tr.com.orsan.academy.learning.springbootopendisnettyexample;

import jakarta.annotation.Resource;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.Processor;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.ProcessorBeanFactoryConfig;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.ProcessorFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProcessorBeanFactoryConfig.class)
public class FactoryBeanJavaConfigTest  extends TestCase {

    @Autowired
    private Processor processor;

    @Resource(name = "&processor")
    private ProcessorFactory processorFactory;

    @Test
    public void testConstructWorkerByJava() {
        assertEquals(processor.isConnected(), false);
        assertEquals(processor.isReady(), false);
    }
}


