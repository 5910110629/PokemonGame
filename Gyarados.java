/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author PAWITRA
 */
public class Gyarados extends Pokemon implements Swimmable{
    private static final int maxGroupHealth = 250;
	public Gyarados(){
		super("Gyarados",
		      (Math.random()*1000) % (maxGroupHealth+1),(Math.random()*1000) % (120+1));
                this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

	public void swim(){
		this.reducedHealth(8);
	}
        
        public void move(){
		this.swim();
	}
}
