package humans;

import  bases.Human;
import utils.Dice;

public class Wizard extends Human {

	public Wizard(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		
		//ヒットポイントの乱数範囲
		int hp = (Dice.get(120, 180));
		setHp(hp);
		
		//攻撃力の乱数範囲
		int offensive = (Dice.get(12, 18));
		setOffensive(offensive);
	}

}
