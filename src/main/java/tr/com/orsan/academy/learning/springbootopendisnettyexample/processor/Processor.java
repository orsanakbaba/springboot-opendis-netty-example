package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;


import org.springframework.stereotype.Component;

@Component
public class Processor {

    private boolean isConnected = false;
    public Processor() {
    }


    public void init(InitialConfiguration configuration){

    };
    public boolean isReady(){
        return isConnected;
    };
    public void isConnected(){

    };
    public void connect(){

    };
    public void setAutoStartOnConnect(){

    };



}
