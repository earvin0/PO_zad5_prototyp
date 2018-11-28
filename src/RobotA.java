public class RobotA implements RobotBase{

    String module;

    public RobotA(String module) {
        this.module = module;
    }

    @Override
    public String build() {
        return module;
    }

    @Override
    public RobotBase clone() {
        return new RobotA(this.module);
    }
}
