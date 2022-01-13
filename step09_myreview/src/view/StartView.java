package view;

import org.junit.Test;

import controller.FoodController;
import model.dto.Food;

public class StartView {
	
	@Test
	//모든 음식의 정보 출력
	public void printAll() {
		System.out.println(" *** 1. 메뉴판 ***");
		FoodController.printAll();		
	}
	
	
	@Test
	//음식 추가(= Create)
	public void addFood() {
		System.out.println(" *** 2. 피자 추가 *** ");
		Food food = new Food("44", "피자", "양식", 15000);
		FoodController.addFood(food);
		FoodController.printAll();
	}
	
	@Test
	//음식 검색(= Read)
	public void searchFood() {
		System.out.println(" *** 3. 짜장면 정보 검색 ***");
		FoodController.searchFood("짜장면");
		FoodController.searchFood("깐풍기");
	}
	
	@Test
	//음식 이름을 검색하여 가격 수정(= Update)
	public void updateFood() {
		System.out.println(" *** 4. 된장찌개 가격 수정 ***");
		FoodController.updateFood("된장찌개", 9000);
		FoodController.updateFood("깐풍기", 8000);
		FoodController.printAll();
	}
	
	@Test
	//음식 이름을 검색하여 목록에서 삭제(= Delete)
	public void deleteFood() {
		System.out.println(" *** 5. 스파게티 삭제 ***");
		FoodController.deleteFood("스파게티");
		FoodController.deleteFood("깐풍기");
		FoodController.printAll();
	}
}
