package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name,weapon);
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = (Dice.get(1, 10)) * this.offensive;
		
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - damage);
		
		// コンソールにステータスを表示
		//〇〇はモンスターの名前、✕✕はモンスターの武器の名前、△△はtargetの名前、▲▲はダメージ値）を表示します
		//「〇〇」が「✕✕」で攻撃！
		//「△△」に▲▲のダメージを与えた。
		System.out.println("「" + this.getName() +"」" + "が" + "「" + this.getWeapon() +"」" + "で攻撃！"
			+ "「" + target.getName() + "」 " + "に" +  damage + "のダメージを与えた。");
	}
}
