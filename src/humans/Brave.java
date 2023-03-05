package humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		
		//ヒットポイントの乱数範囲
		int hp = (Dice.get(170, 230));
		setHp(hp);
		
		//攻撃力の乱数範囲
		int offensive = (Dice.get(7, 13));
		setOffensive(offensive);
	}

}