package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProcessorBeanFactoryConfig {


    @Bean(name = "Processor")
    public ProcessorFactory processorFactory() {
        ProcessorFactory factory = new ProcessorFactory();
        return factory;
    }

    @Bean
    public Processor processor() throws Exception {
        return processorFactory().getObject();
    }

}
