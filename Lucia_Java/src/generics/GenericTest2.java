package generics;

public class GenericTest2 {

	public static void main(String[] args) {
		GenericPrinter<Powder> powder = new GenericPrinter<>();
		powder.setMaterial(new Powder());
		powder.printing();
		
		
		GenericPrinter<Plastic> plastic = new GenericPrinter<>();
		plastic.setMaterial(new Plastic());
		plastic.printing();

	}

}
