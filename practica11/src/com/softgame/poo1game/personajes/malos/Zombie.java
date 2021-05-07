package com.softgame.poo1game.personajes.malos;
import com.softgame.poo1game.personajes.Personaje;
public final class Zombie extends Personaje{
	boolean ataque;
	public Zombie(String nombre, int vida, boolean ataque){
		super(nombre,vida);
		this.ataque = ataque;
	}
	public Zombie(String nombre, boolean ataque){
		this(nombre,3,ataque);
	}
	
	public Zombie(String nombre){
		this(nombre,3,false);
	}
	public boolean getAtaque(){
		return ataque;
	}
	public String getDetalle(){
		return super.toString() + " " + ataque;
	}
	
	public void decVida(){
		decVida(1);
	}
	
	public void decVida(int dec){
		if(!ataque){
			super.decVida(dec * 3);
		}else{
			super.decVida(dec * 2);
		}
	}
	public boolean equals(Object x){
		boolean bandera_Z = false;
		if((x != null) && (x instanceof Zombie)){
			Zombie z = (Zombie) x;
			if((nombre == z.nombre) && (vida == z.vida) && (ataque == z.ataque)){
				bandera_Z = true;
			}
		}
		return bandera_Z;
	}
	
	public void setNombre(String nombre){
		if(nombre.length() >= 3 && nombre.length() <= 8){
			this.nombre = nombre;
		}
	}
}