package polymorphism_����Ű���.animal.model.vo;

public class Cat extends Animal implements Sleep{
	private String NyangNyangPunch;
	
	public Cat() {
		
	}
	
	public Cat(int hp, int weight, int level, String NyangNyangPunch) {
		super(hp, weight, level);
		this.NyangNyangPunch = NyangNyangPunch;
	}
	
	public void punch() {
		System.out.println("����̰� ��ġ�� �����ϴ�.");
		System.out.println(NyangNyangPunch);
		System.out.println("�������� ���� 1��ŭ �������");
		super.setWeight(super.getWeight() - 1);
	}

	@Override
	public void routing() {
		// TODO Auto-generated method stub
		System.out.println("�ľ�");
	}	
	
	@Override
	public void sleep() {
		System.out.println("����� ��");
	}
	
}
