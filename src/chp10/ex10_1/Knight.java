package chp10.ex10_1;

public class Knight extends Novice{
    int stamina;
    void slash(){
        System.out.printf("%s(HP: %d, Stamina: %d)의 슬래쉬///////\n",name,hp,stamina);
    }
}
