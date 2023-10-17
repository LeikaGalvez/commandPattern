package commandPattern;

public class DecreaseBrightness implements Command{
    private Lights lights;

    public DecreaseBrightness(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.decreaseBrightness();
    }
}
