import java.util.HashMap;
import java.util.Map;

public class RobotManager {
    Map<String,RobotBase> prototypes = new HashMap<>();

    public void addPrototype(String module){
        prototypes.put(module,new RobotA(module));
    }

    public void delPrototype(String module){
        prototypes.remove(module);
    }

    public RobotBase getClone(String module){
        return prototypes.get(module).clone();
    }
}
