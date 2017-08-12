package com.commandscontainer;

import com.commands.CommandAddition;
import com.commands.CommandDeduct;
import com.commands.CommandDivision;
import com.commands.CommandMultiply;
import java.util.HashMap;

public class CommandContainer {
    private HashMap<String, Object> allCommand = new HashMap<String, Object>();

    public CommandContainer() {
        allCommand.put("+", new CommandAddition());
        allCommand.put("-", new CommandDeduct());
        allCommand.put("*", new CommandMultiply());
        allCommand.put("/", new CommandDivision());
    }

    public Object getCommand(String key) {
        return allCommand.get(key);
    }

}
