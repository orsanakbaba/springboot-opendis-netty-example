package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;


import edu.nps.moves.dis7.EntityID;
import edu.nps.moves.dis7.EntityType;
import org.springframework.stereotype.Component;

@Component
public class Processor implements IProcessor {

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

    @Override
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }
    @Override
    public void init(InitialConfiguration configuration){
        if (this.isAutoStartOnConnect) {
            this.connect();
        }
    };
    @Override
    public boolean isReady(){
        return isReady();
    };
    @Override
    public boolean isConnected(){
        return isConnected;
    };
    @Override
    public void connect(){
        this.isConnected = true;
    };
    @Override
    public void setAutoStartOnConnect(boolean isAutoStart){
        this.isAutoStartOnConnect = isAutoStart;
    };



}
