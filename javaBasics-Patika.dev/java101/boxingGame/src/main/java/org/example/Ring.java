package org.example;

public class Ring {
    Fighter fighter1;
    Fighter fighter2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    public void toss(){
        Fighter tempFighter = this.fighter1;
        if (Math.random() * 100 >= 50){
            this.fighter1 = this.fighter2;
            this.fighter2 = tempFighter;
        }
            System.out.println(this.fighter1.name + " will start to fight.");
    }

    public void run(){

        if (checkWeight()){
            this.toss();
            int round = 1;
            while (this.fighter1.health > 0 && this.fighter2.health >0){
                System.out.println("<<<<<  ROUND " + round + " BEGINS  >>>>>");
                printScore();
                this.fighter2.health = this.fighter1.hit(this.fighter2);
                if (isWin())
                    break;
                this.fighter1.health = this.fighter2.hit(this.fighter1);
                if (isWin())
                    break;
                round++;
            }
        }else {
            System.out.println("Fighter's weights do not match!");
        }
    }
    public boolean checkWeight(){
        return  this.fighter1.weight >= this.minWeight &&
                this.fighter1.weight <= this.maxWeight &&
                this.fighter2.weight >= this.minWeight &&
                this.fighter2.weight <= this.maxWeight;
    }

    public boolean isWin(){
        if (this.fighter1.health == 0){
            System.out.println("Winner => " + this.fighter2.name);
            return true;
        } else if (this.fighter2.health == 0) {
            System.out.println("Winner => " + this.fighter1.name);
            return true;
        }
        return false;
    }
    public void  printScore(){

        System.out.println(this.fighter1.name + " health: " + this.fighter1.health);
        System.out.println(this.fighter2.name + " health: " + this.fighter2.health);
        System.out.println("============================");
    }
}
