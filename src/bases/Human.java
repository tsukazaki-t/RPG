package bases;

import utils.Dice;

//人間を表現する抽象クラス
public abstract class Human extends Living {

	// コンストラクタ
	public Human(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = (Dice.get(1, 10)) * this.offensive;
		
		target.setHp(target.getHp() - damage);

		// 自分の攻撃力を1だけ減らす
		if (offensive <= 0) {
			offensive = 0;
		}else {
			offensive = offensive - 1;
		}

		// コンソールにステータスを表示
		//（〇〇は人間の名前、✕✕は人間の武器の名前、△△はtargetの名前、▲▲はダメージ値）を表示します
		//「〇〇」が「✕✕」で攻撃！「△△」に▲▲のダメージを与えた。
		//しかし自分の攻撃力も1減少した。)
		
		

		System.out.println("「" + this.getName() + "」" + "が" + "「" + (this.getWeapon()) + "」" + "で攻撃" + "！"
				+ "「" + target.getName() + "」" + "に" + damage + "のダメージを与えた。");
		System.out.println("しかし自分の攻撃力も1減少した。");
	}
}
