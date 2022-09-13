package model;

import java.util.Random;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Sep 13, 2022
 */
public class CrossfitWorkOut {

	private String workOutType;
	
	private String movement1;
	private String movement2;
	private String movement3;
	
	public CrossfitWorkOut() {
		super();
	}
	
	public CrossfitWorkOut(String workOutType) {
		super();
		this.workOutType = workOutType;
		setMovements(workOutType);
	}

	//getters and setters
	public String getWorkOutType() {
		return workOutType;
	}

	public void setWorkOutType(String workOutType) {
		this.workOutType = workOutType;
	}

	public String getMovement1() {
		return movement1;
	}

	public void setMovement1(String movement1) {
		this.movement1 = movement1;
	}

	public String getMovement2() {
		return movement2;
	}

	public void setMovement2(String movement2) {
		this.movement2 = movement2;
	}

	public String getMovement3() {
		return movement3;
	}

	public void setMovement3(String movement3) {
		this.movement3 = movement3;
	}
	
	public String assignGymnasticsMovement(int randomNumber) {		
		String movement = "";
		
		switch (randomNumber) {
		case 1:
			movement = "50 Pull Ups";
			break;
		case 2:
			movement = "25 Foot Handstand Walk";
			break;
		case 3:
			movement = "3 Rope Climbs";
			break;
		case 4:
			movement = "20 Handstand Push Ups";
			break;
		case 5:
			movement = "40 Toes To Bar";
			break;
		case 6:
			movement = "5 Muscle Ups";
			break;
		}
		
		return movement;
	}
	
	public String assignWeightliftingMovement(int randomNumber) {
		String movement = "";
		
		switch (randomNumber) {
		case 1:
			movement = "10 Back Squats @ 60% 1 RM";
			break;
		case 2:
			movement = "25 Deadlifts @ 60% 1 RM";
			break;
		case 3:
			movement = "5 Snatches @ 75% 1 RM";
			break;
		case 4:
			movement = "40 Hang Cleans @ 65% 1 RM";
			break;
		case 5:
			movement = "15 Front Squats @ 50% 1 RM";
			break;
		case 6:
			movement = "50 Bench Press @ 55% 1 RM";
			break;
		}
		
		return movement;
	}
	
	public String assignCardioMovement (int randomNumber) {
		String movement = "";
		
		switch (randomNumber) {
		case 1:
			movement = "Bike 50 Calories";
			break;
		case 2:
			movement = "Ski 30 Calories";
			break;
		case 3:
			movement = "Row 1000 Meters";
			break;
		case 4:
			movement = "Run 1600 Meters";
			break;
		case 5:
			movement = "200 Double Unders";
			break;
		case 6:
			movement = "100 Air Squats";
			break;
		}
		
		return movement;
	}
	public void setMovements(String workOutType) {
		String type = workOutType;
		
		Random r = new Random();
		final int RANDOM_SMALLEST = 1;
		final int RANDOM_LARGEST = 6;
		
		int randomNumber1 = r.nextInt((RANDOM_LARGEST - RANDOM_SMALLEST) + 1) + RANDOM_SMALLEST;
		int randomNumber2 = r.nextInt((RANDOM_LARGEST - RANDOM_SMALLEST) + 1) + RANDOM_SMALLEST;
		int randomNumber3 = r.nextInt((RANDOM_LARGEST - RANDOM_SMALLEST) + 1) + RANDOM_SMALLEST;
		
		while (randomNumber1 == randomNumber2) {
			randomNumber2 = r.nextInt((RANDOM_LARGEST - RANDOM_SMALLEST) + 1) + RANDOM_SMALLEST;
		}
		
		while (randomNumber3 == randomNumber1 || randomNumber3 == randomNumber2) {
			randomNumber3 = r.nextInt((RANDOM_LARGEST - RANDOM_SMALLEST) + 1) + RANDOM_SMALLEST;
		}
		
		if (type.equalsIgnoreCase("Gymnastics")) {
			setMovement1(assignGymnasticsMovement(randomNumber1));
			setMovement2(assignGymnasticsMovement(randomNumber2));
			setMovement3(assignGymnasticsMovement(randomNumber3));
		} else if (type.equalsIgnoreCase("Weightlifting")) {
			setMovement1(assignWeightliftingMovement(randomNumber1));
			setMovement2(assignWeightliftingMovement(randomNumber2));
			setMovement3(assignWeightliftingMovement(randomNumber3));
		} else if (type.equalsIgnoreCase("Cardio")) {
			setMovement1(assignCardioMovement(randomNumber1));
			setMovement2(assignCardioMovement(randomNumber2));
			setMovement3(assignCardioMovement(randomNumber3));
		}
	}

	@Override
	public String toString() {
		return "CrossfitWorkOut [workOutType=" + workOutType + ", movement1=" + movement1 + ", movement2=" + movement2
				+ ", movement3=" + movement3 + "]";
	}
	
	
}
