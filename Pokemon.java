package pokemongame;
abstract class Pokemon{
	public final double maxHealth;
	protected double health;
        protected double weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;

	public Pokemon(String name, double maxHealth, double weight){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.weight = weight;
	}

	public double getHealth(){
		return this.health;
	}
        
        public double getWeight(){
		return this.weight;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                this.weight += 1.5;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
                this.weight -= 0.6;
		if(this.health < 0)
			this.health = 0;
                if(this.weight < 0)
			this.weight = 0;
	}

	abstract public void move();

}
