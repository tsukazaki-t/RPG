package monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {
	public Slime(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
		
		//ヒットポイントの乱数範囲
		int hp = (Dice.get(70, 130));
		setHp(hp);
		
		//攻撃力の乱数範囲
		int offensive = (Dice.get(5, 11));
		setOffensive(offensive);
	}

}
