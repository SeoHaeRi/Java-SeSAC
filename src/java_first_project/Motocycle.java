package java_first_project;

public class Motocycle extends Vehicle {
	private boolean helmet;
	private boolean glove;
	
	public Motocycle(String name, int wheel, String color, int passengers) {
		super(name,wheel,color,passengers);
	}

	public void isHelmet() {
		if(helmet) {
			System.out.println("헬멧이 있습니다!");
		} else {
			System.out.println("헬멧이 없습니다,,");
		}
	}

	public void setHelmet(boolean helmet) {
		this.helmet = helmet;
	}

	public void isGlove() {
		if(glove) {
			System.out.println("장갑이 있습니다!");
		} else {
			System.out.println("장갑이 없습니다,,");
		}
	}

	public void setGlove(boolean glove) {
		this.glove = glove;
	}
	
}
