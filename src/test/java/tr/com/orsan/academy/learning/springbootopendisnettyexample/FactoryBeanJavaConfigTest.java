package tr.com.orsan.academy.learning.springbootopendisnettyexample;

import jakarta.annotation.Resource;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.IProcessor;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.Processor;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.ProcessorBeanFactoryConfig;
import tr.com.orsan.academy.learning.springbootopendisnettyexample.processor.ProcessorFactory;

import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProcessorBeanFactoryConfig.class)
public class FactoryBeanJavaConfigTest  extends TestCase {

    @Autowired
    private Processor iProcessor;

    @Resource(name = "&processor")
    private ProcessorFactory processorFactory;

    @Test
    public void testConstructWorkerByJava() {
        assertEquals(iProcessor.isConnected(), false);
        assertEquals(iProcessor.isReady(), false);
    }
}


