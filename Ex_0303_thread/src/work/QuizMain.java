package work;

public class QuizMain {
	public static void main(String[] args) {
		QuizThread qt = new QuizThread();
		qt.start(); //run() 메서드를 호출하는 메서드
		qt.startGame();
	}
	
}
