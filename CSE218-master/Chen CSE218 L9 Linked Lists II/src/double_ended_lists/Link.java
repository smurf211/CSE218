package double_ended_lists;

public class Link {
	public double dData;
	public Link next;

	public Link(double dData) {
		super();
		this.dData = dData;
	}

	public void displayLink() {
		System.out.println("{" + dData + "}");
	}
}
