package ch14_typeinformation.exercise25.hiddenclass;

public class HiddenMethods {
		private void privateMethod(){
				System.out.println("private method!");
		}

		void packageMethod(){
				System.out.println("package method!");
		}

		protected void protectedMethod(){
				System.out.println("protected method!");
		}
}
