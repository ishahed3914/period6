package gui.simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gui.components.TextLabel;
import gui.components.Visible;
import gui.screens.ClickableScreen;

import gui.simon.MoveInterfaceIram;
import gui.simon.ProgressInterfaceIram;

public class SimonScreenIram extends ClickableScreen implements Runnable {
	
	private ArrayList<MoveInterfaceIram> move;
	private ProgressInterfaceIram progress;
	private TextLabel label;
	private int roundNumber;
	private boolean acceptingInput;
	private int sequenceIndex;
	private int lastSelectedButton;
	
	public SimonScreenIram(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		move = new ArrayList<MoveInterfaceIram>();
		//add 2 moves to start
		lastSelectedButton = -1;
		move.add(randomMove());
		move.add(randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);

	}

	private MoveInterfaceIram randomMove() {
		ButtonInterfaceIram[] b;
		//code that randomly selects a ButtonInterfaceIram
		int chosen = (int)(Math.random()*b.length);
		while(chosen == lastSelectedButton){
			chosen = (int)(Math.random()*b.length);
		}
		return getMove(b);
	}
	private ProgressInterfaceIram getProgress() {
		/**
		Placeholder until partner finishes implementation of ProgressInterface
		*/
		return null;
	}

	private void addButtons() {
		int numberOfButtons = 5;
		Color[] colors = {Color.blue, Color.red, Color.yellow, Color.orange, Color.green};
		for(int i = 0; i < numberOfButtons; i++){

		}
		
	}
	
}
