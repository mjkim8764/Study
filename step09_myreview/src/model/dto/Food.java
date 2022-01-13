package model.dto;

import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//Getter, Setter, Constructor�� ������̼����� ����
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

//Food ����
public class Food {
	private String number;
	private String name;
	private String type;
	private int price;
	
	//toString ������
	@Override
	public String toString() {
		return name + " : " + type + "�̸� ������ " + price + "���Դϴ�.";
	}
}