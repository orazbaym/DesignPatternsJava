package com.company;

public abstract class Organism {

    private SurvivalBehavior survivalBehavior;

    public Organism(SurvivalBehavior survivalBehavior){
        this.survivalBehavior = survivalBehavior;
    }

    public void performEat(){
        this.survivalBehavior.eat();
    }

    abstract void display();

    public SurvivalBehavior getSurvivalBehavior() {
        return survivalBehavior;
    }
    public void setSurvivalBehavior(SurvivalBehavior survivalBehavior) {
        this.survivalBehavior = survivalBehavior;
    }
}
/*package com.company;

    public void performEat(){
        this.survivalBehavior.eat();
    }

    abstract void display();

    public survivalBehavior getSurvivalBehavior() {
        return survivalBehavior;
    }

    public void setSurvivalBehavior(SurvivalBehavior survivalBehavior) {
        this.survivalBehavior = survivalBehavior;
    }



public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public Character(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }

    public void performHit(){
        this.weaponBehavior.hit();
    }

    abstract void display();

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

}


 */