package templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBerverageWithHook {
	@Override
	public void brew() {
	}

	@Override
	public void addCondiments() {
	}

	@Override
	boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y"))
			return true;
		else
			return false;
	}

	private String getUserInput() {
		String answer = null;

		System.out.println("커피에 우유와 설탕을 넣을까여? (y/n) ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException e) {
			System.out.println("IO Error!");
		}

		if (answer == null)
			return "no";

		return answer;
	}
}
