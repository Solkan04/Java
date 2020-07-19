package accessSpecifier_PkgOne;

public class BaseClass {
	private int int_private = 10;
	public int int_public = 20;
	protected int int_protected = 30;
	int int_default = 40;

	public BaseClass() {
		System.out.println("BaseClass constructor in same pkg");
		System.out.println("int_private :" + int_private);
		System.out.println("int_public :" + int_public);
		System.out.println("int_protected :" + int_protected);
		System.out.println("int_default :" + int_default);
	}
}