package model;

import java.util.HashMap;

import model.dto.Food;
import view.SuccessView;

public class FoodModel {
	private static HashMap<String, Food> foods = new HashMap<>();
	
	//초기 DB 입력
	static {
		foods.put("01a", new Food("1", "된장찌개", "한식", 6000));
		foods.put("02a", new Food("2", "스파게티", "양식", 5000));
		foods.put("03a", new Food("3", "짜장면", "중식", 7000));
	}

	//모든 음식의 정보 출력
	public static void printAll() {
		for(String key : foods.keySet()) {
			SuccessView.printFood(foods.get(key));
		}
	}

	//음식 추가(= Create)
	public static void addFood(Food food) {
		foods.put("4", food);		
	}

	//음식 검색(= Read)
	public static void searchFood(String name) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				SuccessView.printFood(foods.get(key));
				return;
			}
		}
		throw new Exception(name + " : 존재하지 않습니다");
	}

	//음식 이름을 검색하여 가격 수정(= Update)
	public static void updateFood(String name, int price) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				foods.get(key).setPrice(price);
				return;
			}
		}
		throw new Exception(name + " : 존재하지 않습니다");
	}

	//음식 이름을 검색하여 목록에서 삭제(= Delete)
	public static void deleteFood(String name) throws Exception{
		for(String key : foods.keySet()) {
			if(foods.get(key).getName().equals(name)) {
				foods.remove(key);
				return;
			}
		}
		throw new Exception(name + " : 존재하지 않습니다");
		
	}
	
}
