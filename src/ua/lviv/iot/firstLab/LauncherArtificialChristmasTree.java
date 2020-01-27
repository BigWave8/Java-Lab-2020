package ua.lviv.iot.firstLab;

public class LauncherArtificialChristmasTree {

	static final int countOfExtraTrees = 4;

	static ArtificialChristmasTree[] extraTrees = new ArtificialChristmasTree[countOfExtraTrees];

	static int extraTreeNumber;

	public static void main(String[] args) {

		ArtificialChristmasTree defaultTree = new ArtificialChristmasTree();

		ArtificialChristmasTree tree = new ArtificialChristmasTree("Smereka", 200, 1499, "PVH");

		ArtificialChristmasTree megaTree = new ArtificialChristmasTree("Mega-Elki", 175, 999, "plastic", 2018, false,
				true, 12.8);

		System.out.println(defaultTree.toString());

		System.out.println(tree.toString());

		System.out.println(megaTree.toString());

		ArtificialChristmasTree.setNumberOfLegs(3);

		ArtificialChristmasTree.printStaticNumberOfLegs();

		tree.printNumberOfLegs();

		for (extraTreeNumber = 0; extraTreeNumber < countOfExtraTrees; extraTreeNumber++) {
			extraTrees[extraTreeNumber] = new ArtificialChristmasTree();
		}

		for (ArtificialChristmasTree massifTree : extraTrees) {
			System.out.println(massifTree);
		}

	}

}
