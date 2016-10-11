package chatBot;

public class IramHello implements Topic {
	private boolean inHelloLoop;
	private String helloResponse;
	private int helloCount;
	
	//responses are constant (never change, always exist)
	private static String[] calmResponses = {"We've already said our hellos. Remember?", 
			"Yes, hello to you too. Let's actually talk."};
	private static String[] angryResponses = {"Okay, seriously. This has to stop", 
			"You are beginning to annoy me. We've Said HELLO"};
	
	public IramHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){ 
			helloCount++;
			printResponse();
			helloResponse = Iram.getInput();
			//check if the next line of text is 
			if(isTriggered(helloResponse)){
				inHelloLoop = false;
				Iram.talkForever();
			}
		}
	}
	private void printResponse(){
		int responseIndex = 0;
		//calm response
		if(helloCount < 5){
			responseIndex = (int)(Math.random() * calmResponses.length);
			Iram.print(calmResponses[responseIndex]);
			
		}
		//angry response
		else{
			responseIndex = (int)(Math.random() * angryResponses.length);
			Iram.print(angryResponses[responseIndex]);
		}
	}
	public boolean isTriggered(String userInput){
		if(Iram.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(Iram.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		return false;
	}
}
