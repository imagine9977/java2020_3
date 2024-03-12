package behavioral.command;

public class Button {
	private Command theCommand;

	public Button(Command theCommand) {
		super();
		this.theCommand = theCommand;
	}

	public void pressed(boolean sw) {
		// TODO Auto-generated method stub
		theCommand.execute(sw);
	}
	
	
	
}
