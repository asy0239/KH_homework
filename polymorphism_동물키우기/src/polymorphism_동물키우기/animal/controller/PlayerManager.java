package polymorphism_동물키우기.animal.controller;

import polymorphism_동물키우기.animal.model.vo.Animal;
import polymorphism_동물키우기.animal.model.vo.Cat;
import polymorphism_동물키우기.animal.model.vo.Dog;

public class PlayerManager {
	Animal dog = new Dog(100, 15, 1);
	Animal cat = new Cat(100, 15, 1, "냥냥");
	public void startplay() {
		((Dog) dog).eatDog();
		((Dog) dog).run();
		System.out.println("hp가 " + dog.getHp() + " 만큼 남았습니다.");
		System.out.println("몸무게는 " + dog.getWeight());
		((Dog)dog).routing();
		((Dog)dog).sleep();
		
		cat.routing();
		((Cat)cat).punch(); 
		System.out.println("고양이 몸무게는 " + cat.getWeight());
	}
	
	
}
