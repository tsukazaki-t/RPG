package humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {

	public Fighter(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		
		//ヒットポイントの乱数範囲
		int hp = (Dice.get(240, 300));
		setHp(hp);
		
		//攻撃力の乱数範囲
		int offensive = (Dice.get(17, 23));
		setOffensive(offensive);
	}

}
