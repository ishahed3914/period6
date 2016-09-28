package chatBot;

public class School implements Topic {

	private boolean inSchoolLoop;
	private String schoolResponse;

	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			Iram.print("Tell me about school.");
			schoolResponse = Iram.getInput();
			if(schoolResponse.indexOf("stop")>= 0){
				inSchoolLoop = false;
				Iram.talkForever();
			}
			else{
				Iram.print("That's my favorite "
						+ "part about school too!" );
			}
		}

	}
}