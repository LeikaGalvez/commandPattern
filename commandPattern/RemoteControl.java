package commandPattern;

public class RemoteControl {
    private Command command;

    public void flickSwitch(){
        command.execute();
    }
    public void decreaseBrightness(){
        command.execute();
    }
    public void increaseBrightness(){
        command.execute();
    }
    public void clickButton(){
        command.execute();
    }
    public void increaseVolume(){
        command.execute();
    }
    public void decreaseVolume(){
        command.execute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
