
public class SchoolManager {

	private Human[] arr = new Human[100];
	private int count = 0;
	
	public boolean insertHuman(Human h) {
		
		for(int i=0; i<count; i++) {
			Human temp = arr[i];
			
//			boolean result = h.getSn().equals(temp.getSn());
//			return !result;
			if(h.getSn().equals(temp.getSn())) return false;
		}
		
		arr[count++] = h;
		return true;
	}
	
	public void printAll() {
		
		for(int i=0; i<count; i++) {
			System.out.println();
			arr[i].print();
		}
	}
}
