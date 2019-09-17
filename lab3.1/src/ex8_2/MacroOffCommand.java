package ex8_2;

import java.util.ArrayList;

public class MacroOffCommand implements Command {
	
	ArrayList<Command> macroCommands;
	
	public void MacroCommand(ArrayList<Command> jimbo) {
		macroCommands=jimbo;
	}
		
	public void execute() {
		System.out.println("- Macro Off was pushed - ");
		macroCommands.forEach((n) -> n.execute());
		
	}
	public void undo() {
		System.out.println("- Macro Off undo pushed - ");
	macroCommands.forEach((n) -> n.undo());
	}
}
