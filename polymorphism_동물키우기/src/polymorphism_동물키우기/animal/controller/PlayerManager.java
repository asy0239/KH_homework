package polymorphism_����Ű���.animal.controller;

import polymorphism_����Ű���.animal.model.vo.Animal;
import polymorphism_����Ű���.animal.model.vo.Dog;

public class PlayerManager {
	Animal dog = new Dog(100, 15, 1);
	
	public void startplay() {
		((Dog) dog).eatDog();
		((Dog) dog).run();
		System.out.println("hp�� " + dog.getHp() + " ��ŭ ���ҽ��ϴ�.");
		System.out.println("�����Դ� " + dog.getWeight());
		((Dog)dog).routing();
		((Dog)dog).sleep();
	}
	
}
