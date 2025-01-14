		public class Hourly extends Worker{
			private int ahourly;
			private double hwage;

			@Override
			public double income(){
					return ahourly * hwage;
			}

			@Override
			public String toString(){
				return super.toString() + "\nAnnual Hours:" + ahourly + "\nHourly Wage:" + hwage;
			}

			public Hourly(String last, String first, int ahourly, double hwage){
				super(first,last);
				this.ahourly = ahourly;
				this.hwage = hwage;
			}
		}
