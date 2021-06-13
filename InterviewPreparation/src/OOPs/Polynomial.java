package OOPs;

public class Polynomial {

	private static final int MAX_POWER = 100;

	private int[] coeffArray = new int[MAX_POWER + 1];

	private int power;

	public Polynomial() {

		power = 0;

	}

	public Polynomial add(Polynomial rhs) {

		Polynomial sum = new Polynomial();

		int[] a = getCoefficientArray();

		int[] b = rhs.getCoefficientArray();

		int[] c = sum.getCoefficientArray();

		for (int i = sum.getPower(); i >= 0; i--) {

			sum.setCoefficient(i, c[i] + a[i] + b[i]);

		}

		return sum;

	}

	public Polynomial multiply(Polynomial rhs) {

		Polynomial product = new Polynomial();

		int[] a = getCoefficientArray();

		int[] b = rhs.getCoefficientArray();

		int[] c = product.getCoefficientArray();

		for (int i = 0; i <= power; i++) {

			for (int j = 0; j <= rhs.getPower(); j++) {

				product.setCoefficient(i + j, c[i + j] + (a[i] * b[j]));
			}
		}
		return product;

	}

	public void print() {
	    	for(int i=0;i<=MAX_POWER;i++){
	            if(coeffArray[i]!=0)
	            System.out.println(coeffArray[i]+"x"+i+" ");
	        }
	}

	public void setCoefficient(int p, int coefficient) {

		try {

			if (p > getPower())

				setPower(p);

			coeffArray[p] = coefficient;

		}

		catch (Exception e) {

			System.exit(0);

		}

	}

	public void setPower(int n) {

		power = n;

	}

	public int getPower() {

		return power;

	}

	public int[] getCoefficientArray() {

		return coeffArray;

	}

}
