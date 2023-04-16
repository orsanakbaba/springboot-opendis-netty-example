package tr.com.orsan.academy.learning.springbootopendisnettyexample.processor;

import edu.nps.moves.dis7.EntityType;

public interface IProcessor {
    void setEntityType(EntityType entityType);

    void init(InitialConfiguration configuration);

    boolean isReady();

    boolean isConnected();

    void connect();

    void setAutoStartOnConnect(boolean isAutoStart);
}
