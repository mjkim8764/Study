package model.dto;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Getter, Setter, Constructor를 어노테이션으로 선언
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//Food 정의
public class Food {
	private String number;
	private String name;
	private String type;
	private int price;
	
	//toString 재정의
	@Override
	public String toString() {
		return name + " : " + type + "이며 가격은 " + price + "원입니다.";
	}
}