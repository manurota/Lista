public class Main {
	public static void main(String[] args) {


    Lista ls = new Lista();
    ls.add("Manuel"); 
    ls.addHead("Sono all'inizio");
    ls.addTail("Sono alla fine");
    System.out.println("Lunghezza totale della lista: " + ls.getLength()); 
    System.out.println("È presente il nome Manuel?" + ":" + ls.exists("Manuel")); 
	}
}
