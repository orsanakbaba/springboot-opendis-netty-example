package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;


import org.springframework.stereotype.Component;

@Component
public class Processor {

    private boolean isConnected = false;
    private boolean isReady = false;
    private boolean isAutoStartOnConnect = false;
    public Processor() {
    }


    public void init(InitialConfiguration configuration){
        if (this.isAutoStartOnConnect) {
            this.connect();
        }
    };
    public boolean isReady(){
        return isReady();
    };
    public boolean isConnected(){
        return isConnected;
    };
    public void connect(){
        this.isConnected = true;
    };
    public void setAutoStartOnConnect(boolean isAutoStart){
        this.isAutoStartOnConnect = isAutoStart;
    };



}
