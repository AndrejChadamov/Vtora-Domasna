package zadaca01;

public class MainClass {
	public static void main(String[] args) {
		Student object1 = new Student (); //Креирање објект со default конструкторот
		object1.firstname = "Стефан"; //Доделување на вредности (инцијализација)
		object1.lastname = "Стефановски"; /*/ /*/
		object1.index = 2222; /*/ /*/
		System.out.println("Податоци за прв објект:");
		System.out.println(object1.firstname + " " + object1.lastname + " " + object1.index);
		Student object2 = new Student("Ангела","Ангелоска",3333); //Креирање објект со
		//динамичен конструктор

		System.out.println ("Податоци за втор објект:");
		System.out.println (object2.firstname + " " + object2.lastname + " " + object2.index);
	}

}
