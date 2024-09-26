package chp08.pr8;

//두 Monster 객체가 임의의 공격을 주고받는 프로그램을 만들려고 한다. 실행 코드는 다음과 같다.

public class MainMonster {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("스켈레톤");
        Monster.battle(orc, skeleton);
    }
}

/* 나와야 하는 결과의 예시(실행 때마다 결과가 달라질 수 있음):
[오크]의 공격 -> 해골의 체력: 20/30
[해골]의 공격 -> 오크의 체력: 20/30
[오크]의 공격 -> 해골의 체력: 10/30
[해골]의 공격 -> 오크의 체력: 10/30
[오크]의 공격 -> 해골의 체력: 0/30
 */