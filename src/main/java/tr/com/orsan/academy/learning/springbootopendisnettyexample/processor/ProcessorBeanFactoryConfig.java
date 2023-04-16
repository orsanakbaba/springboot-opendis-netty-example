package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessorBeanFactoryConfig {
    @Resource(name = "&processor")
    public ProcessorFactory processorFactory() {
        ProcessorFactory factory = new ProcessorFactory();
        return factory;
    }

    @Bean
    public Processor processor() throws Exception {
        return processorFactory().getObject();
    }

}
