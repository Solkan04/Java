package accessSpecifier_PkgTwo;

import accessSpecifier_PkgOne.BaseClass;

public class Independentclass_AnotherPkg {
	BaseClass bc1 = new BaseClass();

	public Independentclass_AnotherPkg() {
		System.out
				.println("Independentclass_AnotherPkg constructor in same pkg");
		// System.out.println("int_private :"+bc1.int_private);
		System.out.println("int_public :" + bc1.int_public);
		// System.out.println("int_protected :"+bc1.int_protected);
		// System.out.println("int_default :"+bc1.int_default);
	}
}