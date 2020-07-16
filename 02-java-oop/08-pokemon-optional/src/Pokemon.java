import java.util.*;
public class Pokemon {
	String name;
	int health;
	String type;
	public static int count = 0;
	ArrayList<Pokemon> myPokemons = new ArrayList<>();
	
	public Pokemon() {
		count++;
	}
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++;
	}
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p1 = new Pokemon(name, health, type);
		myPokemons.add(p1);
		return p1;
	}
	
	public String pokemonInfor(Pokemon pokemon) {
		String info = "Name: " + pokemon.name + " Health: " + pokemon.health + " Type: " + pokemon.type;
		return info;
	}
	
	public void listPokemon() {
		for (int i = 0; i < myPokemons.size(); i++) {
			Pokemon p1 = myPokemons.get(i);
			System.out.println(p1.name);
		}
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.health -= 10;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
