package com.linuxea.command;

import java.util.LinkedList;
import java.util.List;

public class Stuff {

    private final List<Command> commands;


    public Stuff() {
        this.commands = new LinkedList<>();
    }

    public boolean ask(Command command) {
        return this.commands.add(command);
    }

    public void doCommands(){
        this.commands.forEach(Command::execute);
        this.commands.clear();
    }


}
