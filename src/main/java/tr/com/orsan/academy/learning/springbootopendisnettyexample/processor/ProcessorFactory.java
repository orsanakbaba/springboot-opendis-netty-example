package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import edu.nps.moves.dis7.EntityID;
import org.springframework.beans.factory.FactoryBean;

public class ProcessorFactory implements FactoryBean<IProcessor> {

    private int processorSTN = 0 ;
    private EntityID entityID;
    @Override
    public IProcessor getObject() throws Exception {
        return new Processor(processorSTN,entityID);
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

