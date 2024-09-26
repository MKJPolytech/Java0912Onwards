package chp08.pr8;

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        this.name = s; // 이름 설정
        this.hp = maxHp; // 체력을 설정된 최대값으로
    }

    public void attack(Monster enemy) {
        // 공격 때 고정 피해라고 가정
        int damage = 10;
        enemy.hp -= damage; // 적 체력 감소
        if (enemy.hp < 0) enemy.hp = 0; // 0 이하로 떨어지는 거 방지
        System.out.printf("[%s]의 공격 -> [%s]의 체력: %d/%d\n", this.name, enemy.name, enemy.hp, maxHp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender); // 공격 실행
        }
//        // 옵션: 승자 선언(쓰지 말 것)
//        if (a.hp > 0) {
//            System.out.printf("[%s]가 승리했습니다!\n", a.name);
//        } else {
//            System.out.printf("[%s]가 승리했습니다!\n", b.name);
//        }
    }
}
