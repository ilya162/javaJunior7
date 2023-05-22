package Lesson13;

/**
 * Пользовательский класс исключений
 * 
 * @author nedis
 * @version 1.0
 */
public class CustomException extends Exception {// Написали сами исключение
	public CustomException() {
		super();
	}

	public CustomException(String message) {
		super(message);
	}
}
