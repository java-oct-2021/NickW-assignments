public class Gorilla extends Mammal
{
    public Gorilla(int energylevel)
    {
        super(energylevel);
    }

    public void throwSomething()
    {
        System.out.println("*Throwing 'Stuff'*");
        this.energylevel-=5;
        displayenergy();
    }
    public void eatBananas()
    {
        System.out.println("*Eat Banana*");
        this.energylevel+=10;
        displayenergy();
    }
    public void climb()
    {
        System.out.println("*Climbing Tree*");
        this.energylevel-=10;
        displayenergy();
    }

}