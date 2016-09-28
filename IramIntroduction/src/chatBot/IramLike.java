package chatBot;

public class IramLike implements Topic {
	private boolean inLikeLoop;
	private String likeResponse;
	public void talk(){
		Iram.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = Iram.getInput();
			int likePsn = Iram.findKeyword(likeResponse, "like", 0);
			if(likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn + 5);
				Iram.print("You are such an interesting person, because you like" +thingsLiked);
				if(Iram.findKeyword(thingsLiked, "school", 0)>= 0){
					inLikeLoop = false;
					Iram.school.talk();
				}
				else
				{
					inLikeLoop = false;
					Iram.talkForever();
				}
				Iram.talkForever();
				}
			else {
				Iram.print("I don't understand you!");
			}
		}
	}
	@Override
	public boolean isTriggered(String userInput) {
		String[]triggers = {"school", "class", "teacher"};
		//you could use a for loop
		//to iterate through an array
		if(Iram.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(Iram.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}

}
