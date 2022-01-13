package controller;

import model.FoodModel;
import model.dto.Food;
import view.FailView;

public class FoodController {
	
	//��� ������ ���� ���
	public static void printAll() {
		FoodModel.printAll();		
	}
	
	//���� �߰�(= Create)
	public static void addFood(Food food) {
		FoodModel.addFood(food);		
	}
	
	//���� �˻�(= Read)
	public static void searchFood(String name) {
		try {
			FoodModel.searchFood(name);	
		} catch(Exception e) {
			FailView.messageView(e.getMessage());
		}
	}
	
	//���� �̸��� �˻��Ͽ� ���� ����(= Update)
	public static void updateFood(String name, int price) {
		try {
			FoodModel.updateFood(name, price);
		} catch (Exception e) {
			FailView.messageView(e.getMessage());
		}
	}

	//���� �̸��� �˻��Ͽ� ��Ͽ��� ����(= Delete)
	public static void deleteFood(String name) {
		try {
			FoodModel.deleteFood(name);
		} catch(Exception e) {
			FailView.messageView(e.getMessage());
		}
	}
}