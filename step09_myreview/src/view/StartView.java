package view;

import org.junit.Test;

import controller.FoodController;
import model.dto.Food;

public class StartView {
	
	@Test
	//��� ������ ���� ���
	public void printAll() {
		System.out.println(" *** 1. �޴��� ***");
		FoodController.printAll();		
	}
	
	
	@Test
	//���� �߰�(= Create)
	public void addFood() {
		System.out.println(" *** 2. ���� �߰� *** ");
		Food food = new Food("44", "����", "���", 15000);
		FoodController.addFood(food);
		FoodController.printAll();
	}
	
	@Test
	//���� �˻�(= Read)
	public void searchFood() {
		System.out.println(" *** 3. ¥��� ���� �˻� ***");
		FoodController.searchFood("¥���");
		FoodController.searchFood("��ǳ��");
	}
	
	@Test
	//���� �̸��� �˻��Ͽ� ���� ����(= Update)
	public void updateFood() {
		System.out.println(" *** 4. ����� ���� ���� ***");
		FoodController.updateFood("�����", 9000);
		FoodController.updateFood("��ǳ��", 8000);
		FoodController.printAll();
	}
	
	@Test
	//���� �̸��� �˻��Ͽ� ��Ͽ��� ����(= Delete)
	public void deleteFood() {
		System.out.println(" *** 5. ���İ�Ƽ ���� ***");
		FoodController.deleteFood("���İ�Ƽ");
		FoodController.deleteFood("��ǳ��");
		FoodController.printAll();
	}
}
