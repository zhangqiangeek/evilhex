package headfirst.command.impl;

import headfirst.command.Command;
import headfirst.command.Light;

/**
 * @author evilhex.
 * @date 2018/4/12 上午11:40.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
