package chp10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();
        archer1.shoot(); //Archer의 Shoot
        ma.shoot(); //MasterArcher의 Shoot
        archer2.shoot();//MasterArcher의 Shoot
        archer3.shoot();//MasterArcher의 shoot
    }
}
