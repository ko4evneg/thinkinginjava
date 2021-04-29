package outofscopelearning;

import static thinkinginjava.util.Utils.print;

public class Test {
		public static void main(String[] args) {
				Tezt<Base> teztObj = new Tezt<>();
				teztObj.t = new Base();
				Tezt2<Inn> teztStr = new Tezt2<>();
				teztStr.t = new Inn();
				System.out.println(teztObj.t.getClass().getCanonicalName());
				System.out.println(teztStr.t.getClass().getCanonicalName());
		}

}

class Tezt<T> {
		T t;
}

class Tezt2<T extends Base>{
		T t;
}

class Base {
}

class Inn extends Base {
}