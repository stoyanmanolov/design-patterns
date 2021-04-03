package project;

public class StandUpCommand implements Command {

	private Trainee trainee;
	
	public StandUpCommand(Trainee trainee) {
		this.trainee = trainee;
	}

	@Override
	public void execute() {
		trainee.setExercise("Stand up.");
	}


}