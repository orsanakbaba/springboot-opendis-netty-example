package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

public interface IProcessor {



    public void init(InitialConfiguration configuration);
    public boolean isReady();
    public void isConnected();
    public void connect();
    public void setAutoStartOnConnect();



}
