package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import org.springframework.beans.factory.FactoryBean;

public class ProcessorFactory implements FactoryBean<Processor> {


    @Override
    public Processor getObject() throws Exception {
        return new Processor();
    }

    @Override
    public Class<?> getObjectType() {
        return Processor.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

