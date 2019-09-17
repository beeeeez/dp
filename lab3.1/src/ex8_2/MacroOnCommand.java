package ex8_2;

import java.util.ArrayList;

public class MacroOnCommand implements Command {
	
	ArrayList<Command> macroCommands;
	
	public MacroOnCommand(ArrayList<Command> jimbo) {
		macroCommands=jimbo;
	}
		
	public void execute() {
		System.out.println("- Macro On was pushed - ");
		macroCommands.forEach((n) -> n.execute());
		
	}
	public void undo() {
		System.out.println("- Macro On undo pushed - ");
	macroCommands.forEach((n) -> n.undo());
	}
}
