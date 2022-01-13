package model;

import java.util.HashMap;

import model.dto.Food;
import view.SuccessView;

public class FoodModel {
	private static HashMap<String, Food> foods = new HashMap<>();
	
	//�ʱ� DB �Է�
	static {
		foods.put("01a", new Food("1", "�����", "�ѽ�", 6000));
		foods.put("02a", new Food("2", "���İ�Ƽ", "���", 5000));
		foods.put("03a", new Food("3", "¥���", "�߽�", 7000));
	}

	//��� ������ ���� ���
	public static void printAll() {
		for(String key : foods.keySet()) {
			SuccessView.printFood(foods.get(key));
		}
	}

	//���� �߰�(= Create)
	public static void addFood(Food food) {
		foods.put("4", food);		
	}

	//���� �˻�(= Read)
	public static void searchFood(String name) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				SuccessView.printFood(foods.get(key));
				return;
			}
		}
		throw new Exception(name + " : �������� �ʽ��ϴ�");
	}

	//���� �̸��� �˻��Ͽ� ���� ����(= Update)
	public static void updateFood(String name, int price) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				foods.get(key).setPrice(price);
				return;
			}
		}
		throw new Exception(name + " : �������� �ʽ��ϴ�");
	}

	//���� �̸��� �˻��Ͽ� ��Ͽ��� ����(= Delete)
	public static void deleteFood(String name) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				foods.remove(key);
				return;
			}
		}
		throw new Exception(name + " : �������� �ʽ��ϴ�");
		
	}
	
}
