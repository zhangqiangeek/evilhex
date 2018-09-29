package headfirst.command;

import headfirst.command.impl.LightOnCommand;

/**
 * @author evilhex.
 * @date 2018/4/12 下午6:40.
 */
public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
    }
}
