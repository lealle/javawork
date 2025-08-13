package _05_interfaceDefault;

public class InterClass implements Inter {

	
	// default static 안들어옴 
	@Override
	public int method1() {
		return 1;
	}

	@Override
	public int method2() {
		return 2;
	}

	@Override
	public int method() {
		return 0;
	}

}
