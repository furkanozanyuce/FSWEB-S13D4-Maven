package org.example;

public enum Weapon {
    SWORD(10, 5.0),
    AXE(15, 3.0),
    BOW(8, 6.0),
    SPEAR(20, 4.0);

    private int damage;
    private double attackSpeed;


    //constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    //getter
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
