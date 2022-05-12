     //abstract!
public abstract class Atelier {
	
	public boolean isAProviderMethod(Method method) {
		return method.getName().startsWith("fournir");
	}

	public void valider() {
		validateTestCases();

		launchApp();
		
		Validator.validate(this);
	}
	
            //abstract!
	protected abstract void executer();
	protected abstract boolean siExecutable();
}
