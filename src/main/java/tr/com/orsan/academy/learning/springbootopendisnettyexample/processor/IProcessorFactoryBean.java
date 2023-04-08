package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

public interface IProcessorFactoryBean {

    IProcessor getObject() throws Exception;
    Class<?> getObjectType();

}

