package app;

public class ATester {
	private Conversion conversion;
	
	/**
	 * @param temperature
	 * @param sens : enum {F2C, C2F}
	 * @return
	 */
	public ATester() {
		conversion = new Conversion();
	}
	
	public double Convertit(double temperature, String sens) {
		if(sens.equals("F2C")) {
			return conversion.convF2C(temperature);
		}
		else if(sens.equals("C2F")) {
			return conversion.convC2F(temperature);
		}
		else {
			throw new IllegalArgumentException("Le sens doit être : F2C ou C2F");
		}
	}
}
