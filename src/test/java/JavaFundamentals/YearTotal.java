package JavaFundamentals;

public class YearTotal implements Comparable < YearTotal > {
	private double temp;
	private int year;
	private double rain;

	public YearTotal() {

	}
	public YearTotal(double temp, int year, double rain) {
		this.temp = temp;
		this.year = year;
		this.rain = rain;

	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	@Override
	public String toString() {
		return "YearTotal [rain=" + String.format("%3.2f",rain) + 
				", temp=" + String.format("%3.2f",temp) + ", year=" + year + "]";
	}
	public String toCSV() {
		return this.getTemp() + "," + 
				this.getYear() + "," + 
				this.getRain();
	}
	@Override
	public int compareTo(YearTotal arg0) {
		Double d1 = Double.valueOf(this.rain);

		return d1.compareTo(Double.valueOf(arg0.rain));
	}
}