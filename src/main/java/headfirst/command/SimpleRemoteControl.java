package headfirst.command;

/**
 * @author evilhex.
 * @date 2018/4/12 上午11:51.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
