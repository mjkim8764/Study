package controller;

import model.FoodModel;
import model.dto.Food;
import view.FailView;

public class FoodController {
	
	//모든 음식의 정보 출력
	public static void printAll() {
		FoodModel.printAll();		
	}
	
	//음식 추가(= Create)
	public static void addFood(Food food) {
		FoodModel.addFood(food);		
	}
	
	//음식 검색(= Read)
	public static void searchFood(String name) {
		try {
			FoodModel.searchFood(name);	
		} catch(Exception e) {
			FailView.messageView(e.getMessage());
		}
	}
	
	//음식 이름을 검색하여 가격 수정(= Update)
	public static void updateFood(String name, int price) {
		try {
			FoodModel.updateFood(name, price);
		} catch (Exception e) {
			FailView.messageView(e.getMessage());
		}
	}

	//음식 이름을 검색하여 목록에서 삭제(= Delete)
	public static void deleteFood(String name) {
		try {
			FoodModel.deleteFood(name);
		} catch(Exception e) {
			FailView.messageView(e.getMessage());
		}
	}
}