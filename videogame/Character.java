import javax.net.ssl.HostnameVerifier;

public class Character{
//replace the lifePoints to energy and include new private lifes when playing video game
    private String name;
    private int energy;
    private int lifes;
    private int attackPoints;

    // constructor
    public Character(String name, int energy, int attackPoints){
        this.name=name;
        this.energy=energy;
        this.attackPoints=attackPoints;
        this.lifes=3;
    }

        // where lifes represent 3

    // getters
    public String getName(){
        return this.name;
    }

        public int getenergy(){
            return this.energy;
        }

        public int getAttackPoints(){
            return this.attackPoints;
        }
    // methods
    public void display(){
        System.out.println("------------------ ");
        System.out.println("Name: " + this.name);
        System.out.println("=D" + this.lifes);
        System.out.println("Life Points: " + this.energy);
        System.out.println("Attack Points: " + this.attackPoints);
        // where D represent motion
        // suppose we have an opponent for attacking
    }
    

    public void attack(Character opponent){
        System.out.println(this.name +  "is attacking ... " + opponent.name);

            // we need to modify our element bc we need to know the lifepoint of our opponent
            // int opponentLP=opponent.getlifePoints();
            // int attackp=getAttackPoints();
            // we can write this in  a shorter code and saving it in variable
            // int opponentLP=opponent.lifePoints;
            // int attackp=this.attackPoints;
            // we need a new lifepoints and  so we have 
            // int newLP = opponentLP-attackp;
            // opponent.lifePoints=newLP;
            // these 3 lines of code can be replaced to one and we can put the display here which we can rewrite as
        
        int newLP = opponent.energy-this.attackPoints;

        opponent.energy=newLP;
        opponent.display();

            // we want to see the reaction if the energy is low or running low

        if(opponent.energy <= 0){
            opponent.lifes=opponent.lifes-1;
            opponent.energy=100;
            opponent.display();

            // making toad more powerful we determine the lifes left so we change toad =50 and mario=20 to make the game end more quickly
            // observation is lifePoints which is our energy is 0 and -50 which is impossible so we need to restart our energy so we make opponent.energy to be 100%

            // In this analysis where you have to get the files/Character to be = 0

            if(opponent.lifes== 0){
                System.out.println("Game is complete over");
                System.exit(2);

            }

        }


        


    }
}

