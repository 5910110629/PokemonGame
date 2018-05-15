package pokemongame;
public class Bulbasaur extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Bulbasaur(){
		super("Bulbasaur",
		      (Math.random()*1000) % (maxGroupHealth+1), (Math.random()*1000) % (70+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("Tackle");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Double Edge");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedHealth(7);
	}

	public void walk(){
		this.reducedHealth(0.5);
	}
}
