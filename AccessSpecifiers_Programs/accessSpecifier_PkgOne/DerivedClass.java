package accessSpecifier_PkgOne;

public class DerivedClass extends BaseClass {

	public DerivedClass() {
		System.out.println("DerivedClass constructor in same pkg");
		// System.out.println("int_private :"+int_private);
		System.out.println("int_public :" + int_public);
		System.out.println("int_protected :" + int_protected);
		System.out.println("int_default :" + int_default);
	}
}