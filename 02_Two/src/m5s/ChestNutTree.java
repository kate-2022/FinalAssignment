package m5s;

public class ChestNutTree extends Tree{
	
	public String leafShape;
	
	public ChestNutTree(String leafShape) {
		super("ChestNutTree", 10, 3.5);
		this.leafShape = leafShape;
		System.out.println("Child class constructor is called: this is a ChestNutTree!");
	
		
		/* 
		* By default there is always a NoArgsConstructor if you do not define another one explicitly
		* Constructor always has the name of the class in capitals
		* If on wants to avoid object creation outside the class(e.g.Singleton pattern) make the constructor private
		* Every constructor calls parent class NoArgsConstructor first, if you mention super() or not
		*/
	}

}
