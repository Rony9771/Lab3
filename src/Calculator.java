
public class Calculator {
	
		
		private double Number1;
		private double Number2;
		
		
		public Calculator() {

	}


		public Calculator(double number1, double number2) {
			super();
			Number1 = number1;
			Number2 = number2;
		}
		
		public double add() {
			return Number1+Number2;
		}
		
		public double sub() {
			return Number1-Number2;
			

	}
		public double mul() {
			return Number1*Number2;
		}
		public double div() {
			return Number1/Number2;
		}


		@Override
		public String toString() {
			return "Calculator [Number1=" + Number1 + ", Number2=" + Number2 + "]";
		}
	}


	