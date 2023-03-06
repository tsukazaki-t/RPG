package monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {
	public Oak(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ

		//ヒットポイントの乱数範囲
		//int hp = (Dice.get(70, 30));修正前
		int hp = (Dice.get(170, 230));
		setHp(hp);

		//攻撃力の乱数範囲
		//int offensive = (Dice.get(5, 11));修正前
		int offensive = (Dice.get(9, 15));
		setOffensive(offensive);
	}

}
