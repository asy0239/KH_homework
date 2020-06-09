package polymorphism_����Ű���.animal.model.vo;


public class Dog extends Animal implements Sleep{
	
	public Dog() {
		
	}
	
	public Dog(int hp, int weight, int level) {
		super(hp, weight, level);
	}
	
	@Override
	public void run() {
		int minus = (int)(Math.random()*5);
		System.out.println("�������� �Բ� �ݴϴ�!");
		super.setWeight(super.getWeight() - minus);
		System.out.println("��������  " + minus +"kg �����׿�");
	}
	
	public void eatDog() {
		String cho = "";
		char yesNo = 'y';
		do {
			System.out.println("���������� ���̸� �ݴϴ�.");
			System.out.println("� ���̸� �ֽǲ��ϱ�?? : ");
			System.out.println("���, ���, ä��");
			cho = sc.nextLine();
			switch (cho) {
			case "���":
				super.setWeight(super.getWeight() + 2);
				System.out.println("��Ḧ �Կ����ϴ�! �����԰� 2kg �þ����ϴ�!");
				break;
			case "���":
				super.setWeight(super.getWeight() + 3);
				System.out.println("��⸦ �Կ����ϴ�! �����԰� 3kg �þ����ϴ�!");
				break;
			case "ä��":
				super.setWeight(super.getWeight() + 1);
				System.out.println("ä�Ҹ� �Կ����ϴ�! �����԰� 1kg �þ����ϴ�!" );
				break;
			default:
				break;
			}
			System.out.println("���̸� �� �ֽðڽ��ϱ�??(y/n) : ");
			yesNo = sc.nextLine().charAt(0);
			
		} while(yesNo == 'y');
	}
	
	@Override
	public void sleep() {
		System.out.println("���� �ܴ�~~!");
	}

	@Override
	public void routing() {
		// TODO Auto-generated method stub
		System.out.println("�۸�");
	}
	
	
}
