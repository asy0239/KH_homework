package polymorphism_����Ű���.animal.model.vo;

import java.util.Scanner;

public abstract class Animal implements Sleep {
	Scanner sc = new Scanner(System.in);
	private int hp;
	private int weight;
	private int level;
	
	public Animal() {
		
	}

	public Animal(int hp, int weight, int level) {
//		super();
		this.hp = hp;
		this.weight = weight;
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	public void run() {
		System.out.println("�÷��̾� ȥ�� �ݴϴ�.");
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("�������� ��� �ܴ�.. ����..");
	}
	
	public abstract void routing();
	
}

