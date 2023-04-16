package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import edu.nps.moves.dis7.EntityID;
import org.springframework.beans.factory.config.AbstractFactoryBean;

public class ProcessorFactory2 extends AbstractFactoryBean<Processor> {

    private int processorSTN = 0 ;
    private EntityID entityID;

    public ProcessorFactory2() {
        setSingleton(false);
    }

    @Override
    public Class<?> getObjectType() {
        return Processor.class;
    }

    @Override
    protected Processor createInstance() throws Exception {
        return new Processor(processorSTN,entityID);
    }
}
