package org.example;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter enemy){
        System.out.println(this.name + " =>  " + enemy.name + " deals " + this.damage + " damage!");
        if (enemy.dodge()){
            System.out.println("******** " + enemy.name + " blocks damage!");
            return enemy.health;
        }
        if (enemy.health - this.damage < 0 ){
            return 0;
        }

        return enemy.health - this.damage;

    }

    public boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
