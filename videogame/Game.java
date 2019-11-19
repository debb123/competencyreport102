public class Game{

    public static void main(String args[])
    {
        
        Character toad = new Character("Toad", 100, 50);
        Character mario = new Character("Mario", 100, 20);
        // here we pass on 4 parameters instead 3 but  stick to 3 by what we choose
        // System.out.println(toad.getName() +"\n" + toad.getAttackPoints() + "\n" + toad.getLifePoints());

        // System.out.println(mario.getName() +"\n" + mario.getAttackPoints() + "\n" + mario.getLifePoints());

        // toad.display();
        // mario.display();
        // removed to character.java

        // toad.attack(mario);
        // mario.attack(toad);
        // mario.attack(toad);

        // toad.attack(mario);
        // toad.attack(mario);
        // toad.attack(mario);
        // toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        toad.attack(mario);
        mario.attack(toad);
    
        


       
    }
}