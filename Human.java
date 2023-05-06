public class Human {
    private int strength;
    private int intelligence;
    private int stealth;
    private int health;

    public Human() {
        strength = 3;
        intelligence = 3;
        stealth = 3;
        health = 100;
    }

    public void attack(Human target) {
        int damage = this.strength;
        target.health -= damage;
        System.out.println("El humano ha atacado a otro humano. Se ha causado " + damage + " puntos de daño.");
    }

    // Getters and setters

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealth() {
        return health;
    }
}

