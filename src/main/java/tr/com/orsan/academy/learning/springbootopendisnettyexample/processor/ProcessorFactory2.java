package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import org.springframework.beans.factory.config.AbstractFactoryBean;

public class ProcessorFactory2 extends AbstractFactoryBean<IProcessor> {

    public ProcessorFactory2() {
        setSingleton(false);
    }

    @Override
    public Class<?> getObjectType() {
        return Processor.class;
    }

    @Override
    protected IProcessor createInstance() throws Exception {
        return new Processor();
    }
}
