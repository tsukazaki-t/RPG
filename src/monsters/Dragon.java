package monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {
	public Dragon(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		
		//ヒットポイントの乱数範囲
		int hp = (Dice.get(270, 330));
		setHp(hp);
		
		//攻撃力の乱数範囲
		int offensive = (Dice.get(12, 18));
		setOffensive(offensive);
		
	}
	

}
