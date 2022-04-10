package lambda;

/**
 *
 * @author Md. Aslam Hossain
 * @Date Apr 10, 2022
 *
 */
public class Main {

	public static void main(String[] args) {
		MyFunctionalInterface functionalInterface = (a1, a2) -> {
			return a1 + a2;
		};
		System.out.println(functionalInterface.sum(10, 10));

	}

}
