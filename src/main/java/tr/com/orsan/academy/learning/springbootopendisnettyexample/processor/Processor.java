package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;


import edu.nps.moves.dis7.EntityID;
import edu.nps.moves.dis7.EntityType;
import org.springframework.stereotype.Component;

@Component
public class Processor {

    private boolean isConnected = false;
    private boolean isReady = false;
    private boolean isAutoStartOnConnect = false;
    private int processorSTN;
    private final EntityID entityID;
    private EntityType entityType;


    public Processor(int processorSTN , EntityID entityID) {
        this.processorSTN = processorSTN;
        this.entityID = entityID;
    }

    public void setEntityType(EntityType  entityType) {
        this.entityType = entityType;
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
