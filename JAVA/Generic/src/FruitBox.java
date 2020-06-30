//					 T는 타입이라는 의미
// 					 <T> 제네릭 사용
public class FruitBox<T> {
	// 박스에 담긴 과일(사과,포도)
	private T object;	
	
	public T get() {
		return object;
	}
	
	public void set(T obj) {
		object = obj;
	}
	
	public static void main(String[] args) {
		
		FruitBox <Apple> box = new FruitBox<Apple>();
		
		box.set(new Apple());
//		box.set(new Grape());

		System.out.println(box.get().getName());
//		System.out.println(((Apple)box.get()).getName());
		
		FruitBox<Grape> gbox = new FruitBox<Grape>();
		
		gbox.set(new Grape());
		System.out.println(gbox.get().getName());
	}
}
