package accessSpecifier_PkgTwo;

import accessSpecifier_PkgOne.BaseClass;

public class DerivedClass_AnotherPkg extends BaseClass {
	public DerivedClass_AnotherPkg() {
		System.out.println("DerivedClass_AnotherPkg constructor in same pkg");
		// System.out.println("int_private :"+int_private);
		System.out.println("int_public :" + int_public);
		System.out.println("int_protected :" + int_protected);
		// System.out.println("int_default :"+int_default);
	}
}