package project;

public class Instructor {
	private String name;
	private Trainee trainee;
	private Command command;
	
	public Instructor(String name) {
		this.setName(name);
	}

	public void setCommand(Command command) {
		this.command = command;
		this.command.execute();
	}

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
