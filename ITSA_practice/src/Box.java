
public abstract class Box {

	int height;
	int weight;
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	public String getName(int a, int b) {
		return name;
	}

	public abstract Integer getHeight();

	public abstract Integer getWeight();

}
