package polymorphism_동물키우기.animal.model.vo;


public class Dog extends Animal implements Sleep{
	
	public Dog() {
		
	}
	
	public Dog(int hp, int weight, int level) {
		super(hp, weight, level);
	}
	
	@Override
	public void run() {
		int minus = (int)(Math.random()*5);
		System.out.println("강아지와 함께 뜁니다!");
		super.setWeight(super.getWeight() - minus);
		System.out.println("강아지가  " + minus +"kg 빠졌네요");
	}
	
	public void eatDog() {
		String cho = "";
		char yesNo = 'y';
		do {
			System.out.println("강아지에게 먹이를 줍니다.");
			System.out.println("어떤 먹이를 주실껍니까?? : ");
			System.out.println("사료, 고기, 채소");
			cho = sc.nextLine();
			switch (cho) {
			case "사료":
				super.setWeight(super.getWeight() + 2);
				System.out.println("사료를 먹였습니다! 몸무게가 2kg 늘었습니다!");
				break;
			case "고기":
				super.setWeight(super.getWeight() + 3);
				System.out.println("고기를 먹였습니다! 몸무게가 3kg 늘었습니다!");
				break;
			case "채소":
				super.setWeight(super.getWeight() + 1);
				System.out.println("채소를 먹였습니다! 몸무게가 1kg 늘었습니다!" );
				break;
			default:
				break;
			}
			System.out.println("먹이를 더 주시겠습니까??(y/n) : ");
			yesNo = sc.nextLine().charAt(0);
			
		} while(yesNo == 'y');
	}
	
	@Override
	public void sleep() {
		System.out.println("개가 잔다~~!");
	}

	@Override
	public void routing() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
	
	
}
