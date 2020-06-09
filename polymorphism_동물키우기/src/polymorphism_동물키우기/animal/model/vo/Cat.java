package polymorphism_동물키우기.animal.model.vo;

public class Cat extends Animal implements Sleep{
	private String NyangNyangPunch;
	
	public Cat() {
		
	}
	
	public Cat(int hp, int weight, int level, String NyangNyangPunch) {
		super(hp, weight, level);
		this.NyangNyangPunch = NyangNyangPunch;
	}
	
	public void punch() {
		System.out.println("고양이가 펀치를 날립니다.");
		System.out.println(NyangNyangPunch);
		System.out.println("움직여서 살이 1만큼 빠졌어요");
		super.setWeight(super.getWeight() - 1);
	}

	@Override
	public void routing() {
		// TODO Auto-generated method stub
		System.out.println("냐앙");
	}	
	
	@Override
	public void sleep() {
		System.out.println("고양이 잠");
	}
	
}
