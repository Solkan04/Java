package accessSpecifier_PkgOne;

public class IndependentInSamePkg {
	BaseClass bc = new BaseClass();

	public IndependentInSamePkg() {
		System.out.println("IndependentInSamePkg constructor in same pkg");
		// System.out.println("int_private :"+bc.int_private);
		System.out.println("int_public :" + bc.int_public);
		System.out.println("int_protected :" + bc.int_protected);
		System.out.println("int_default :" + bc.int_default);
	}
}
