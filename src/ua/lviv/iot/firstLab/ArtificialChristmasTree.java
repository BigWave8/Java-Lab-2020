package ua.lviv.iot.firstLab;

public class ArtificialChristmasTree {

	private static final String DEFAULT_MATERIAL = "plastic";

	private static final String DEFAULT_NAME_OF_MANUFACTURE = "TreeUA";

	private String nameOfManufacturer;

	private int heightInCentimeters;

	private int priceInHryvnia;

	private String productionMaterial;

	private int yearOfProduction;

	private boolean canBeParsed;

	private static int numberOfLegs;

	protected boolean hasSecondColor;

	protected double weightInKilograms;

	public ArtificialChristmasTree(String nameOfManufacturer, int heightInCentimeters, int priceInHryvnia,
			String productionMaterial, int yearOfProduction, boolean canBeParsed, boolean hasSecondColor,
			double weightInKilograms) {
		this.nameOfManufacturer = nameOfManufacturer;
		this.heightInCentimeters = heightInCentimeters;
		this.priceInHryvnia = priceInHryvnia;
		this.productionMaterial = productionMaterial;
		this.yearOfProduction = yearOfProduction;
		this.canBeParsed = canBeParsed;
		this.hasSecondColor = hasSecondColor;
		this.weightInKilograms = weightInKilograms;
	}

	public ArtificialChristmasTree(String nameOfManufacturer, int heightInCentimeters, int priceInHryvnia,
			String productionMaterial) {
		this(nameOfManufacturer, heightInCentimeters, priceInHryvnia, productionMaterial, 2016, false, false, 15.2);
	}

	public ArtificialChristmasTree() {
		this(DEFAULT_NAME_OF_MANUFACTURE, 180, 1000, DEFAULT_MATERIAL);
	}

	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}

	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}

	public int getHeightInCentimeters() {
		return heightInCentimeters;
	}

	public void setHeightInCentimeters(int heightInCentimeters) {
		this.heightInCentimeters = heightInCentimeters;
	}

	public int getPriceInHryvnia() {
		return priceInHryvnia;
	}

	public void setPriceInHryvnia(int priceInHryvnia) {
		this.priceInHryvnia = priceInHryvnia;
	}

	public String getProductionMaterial() {
		return productionMaterial;
	}

	public void setProductionMaterial(String productionMaterial) {
		this.productionMaterial = productionMaterial;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public boolean getCompanyName() {
		return canBeParsed;
	}

	public void setCompanyName(boolean companyName) {
		this.canBeParsed = companyName;
	}

	public boolean isHasSecondColor() {
		return hasSecondColor;
	}

	public void setHasSecondColor(boolean hasSecondColor) {
		this.hasSecondColor = hasSecondColor;
	}

	public double getWeightInKilograms() {
		return weightInKilograms;
	}

	public void setWeightInKilograms(double weightInKilograms) {
		this.weightInKilograms = weightInKilograms;
	}

	public static void setNumberOfLegs(int numberOfLegs) {
		ArtificialChristmasTree.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "ArtificialChristmasTree [nameOfManufacturer=" + nameOfManufacturer + ", heightInCentimeters="
				+ heightInCentimeters + ", priceInHryvnia=" + priceInHryvnia + ", productionMaterial="
				+ productionMaterial + ", yearOfProduction=" + yearOfProduction + ", canBeParsed=" + canBeParsed
				+ ", hasSecondColor=" + hasSecondColor + ", weightInKilograms=" + weightInKilograms + "]";
	}

	public static int printStaticNumberOfLegs() {
		System.out.println(ArtificialChristmasTree.numberOfLegs);
		return numberOfLegs;
	}

	public int printNumberOfLegs() {
		System.out.println(ArtificialChristmasTree.numberOfLegs);
		return numberOfLegs;
	}

	public void resetValues(String nameOfManufacturer, int heightInCentimeters, int priceInHryvnia,
			String productionMaterial, int yearOfProduction, boolean canBeParsed, boolean hasSecondColor,
			double weightInKilograms) {
		this.nameOfManufacturer = nameOfManufacturer;
		this.heightInCentimeters = heightInCentimeters;
		this.priceInHryvnia = priceInHryvnia;
		this.productionMaterial = productionMaterial;
		this.yearOfProduction = yearOfProduction;
		this.canBeParsed = canBeParsed;
		this.hasSecondColor = hasSecondColor;
		this.weightInKilograms = weightInKilograms;
	}

}
