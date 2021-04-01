package thinkinginjava;

import static thinkinginjava.Utils.print;

public class LambdasTest {
		public static void main(String[] args) {
				GetPi pi;
				EasyFormatString efs;
				GenericConverter<Integer, String> gc;

				pi = () -> {return 3.1415f;};
				print(pi.getPi());

				efs = (str, i) -> {return str + i;};
				print(efs.getEasyFormattedString("It is number ", 24));

				gc = a -> a.length() < 10 ? a.length() * 100 : a.length();
				print(gc.doAction("Three Four Five"));
				print(gc.doAction("Three"));

		}
}

interface GetPi {
		float getPi();
}

interface EasyFormatString {
		String getEasyFormattedString(String s, int it);
}

interface GenericConverter<Z, Y> {
		Z doAction(Y y);
}