package hammy;

public abstract class Dude {
	Ammy ammy;
	Immy immy;
	
	public Dude() {
		
	}
	
	public abstract void shout();
	
	public void doAmmy() {
		ammy.noonah();
	}
	public void doImmy() {
		immy.hoohah();
	}
	public void Magoo() {
		System.out.println("Magoo");
	}
	public void setAmmy(Ammy fudge) {
		ammy=fudge;
	}
	public void setImmy(Immy oyster) {
		immy=oyster;
	}
}
