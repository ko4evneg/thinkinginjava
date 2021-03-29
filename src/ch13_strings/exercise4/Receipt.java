package ch13_strings.exercise4;

import java.util.Formatter;
//Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of constant values. The goal
//is to allow you to easily change a width by changing a single value in one place.

public class Receipt {
		private final static int STRING_LEN = 15;
		private final static int QTY_LEN = 5;
		private final static int PRICE_LEN = 10;
		private final static int PRICE_PREC = 2;
		private final static int STRING_PREC = 15;

		private double total = 0;
		private Formatter f = new Formatter(System.out);
		public void printTitle() {
				f.format("%-" + STRING_LEN + "s %" + QTY_LEN + "s %" + PRICE_LEN + "s\n", "Item", "Qty", "Price");
				f.format("%-" + STRING_LEN + "s %" + QTY_LEN + "s %" + PRICE_LEN + "s\n", "----", "---", "-----");
		}
		public void print(String name, int qty, double price) {
				f.format("%-" + STRING_LEN + "." + STRING_PREC + "s %" + QTY_LEN + "s %" + PRICE_LEN + "." + PRICE_PREC +"f\n", name, qty, price);
				total += price;
		}
		public void printTotal() {
				f.format("%-" + STRING_LEN + "s %" + QTY_LEN + "s %" + PRICE_LEN + "." + PRICE_PREC +"f\n", "Tax", "", total*0.06);
				f.format("%-" + STRING_LEN + "s %" + QTY_LEN + "s %" + PRICE_LEN + "s\n", "", "", "-----");
				f.format("%-15s %5s %10.2f\n", "Total", "",
								total * 1.06);
		}
		public static void main(String[] args) {
				Receipt receipt = new Receipt();
				receipt.printTitle();
				receipt.print("Jack’s Magic Beans", 4, 4.25);
				receipt.print("Princess Peas", 3, 5.1);
				receipt.print("Three Bears Porridge", 1, 14.29);
				receipt.printTotal();
		}
}