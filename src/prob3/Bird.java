package prob3;

public abstract class Bird {
	protected String name;
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected abstract void fly();
	protected abstract void sing();

	
}
