public class Salaried extends Worker{
			private double asalary;

			@Override
			public double income(){
					return asalary;
			}

			@Override
			public String toString(){
				return super.toString()+ "\nAnnual Salary:" + asalary;
			}

			public Salaried(String last, String first, double asalary){
				super(first,last);
				this.asalary = asalary;
			}

}
