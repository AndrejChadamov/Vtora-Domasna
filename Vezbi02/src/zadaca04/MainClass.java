package zadaca04;

public class MainClass {
public static void main(String[] arg) {
	Avtomobil object1= new Avtomobil();
	object1.marka="Opel";
	object1.model="Corsa";
	object1.pominatiKm=50000;
	
	Avtomobil object2= new Avtomobil("Audi", "a6", 60000);
	System.out.println(object1.marka+ " " +object1.model+ " " +object1.pominatiKm);
	System.out.println(object2.marka+ " " +object2.model+ " " +object2.pominatiKm);
	
}
}
