package ch12_errorhandlingwithexceptions.exercise30;
//Exercise 30: (2) Modify Human.java so that the exceptions inherit from RuntimeException. Modify main( ) so that the
//technique in TurnOffChecking.java is used to handle the different types of exceptions.

class Annoyance extends RuntimeException {
}

class Sneeze extends Annoyance {
}

public class Human {
		public static void main(String[] args) {
// Catch the exact type:
				try {
						throw new Sneeze();
				} catch (Sneeze e) {
						try {
								throw new RuntimeException(e);
						} catch (RuntimeException re) {
								try {
										throw re.getCause();
								} catch (Sneeze s) {
										System.out.println("Sneez");
								} catch (Annoyance a) {
										System.out.println("Annoyance");
								} catch (Throwable t) {
										System.out.println("Throwable");
								}
						}
				}
		}
}