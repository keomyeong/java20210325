package p06.textbook.exercise.ex18;

public class ShopServiceExample {
public static void main(String[] args) {
	ShopService obj1 = 	ShopService.getInstance();
	ShopService obj2 = 	ShopService.getInstance();
	
	if(obj1 == obj2) {
		System.out.println("같은 ShopSevice 객체입니다.");
		
	}else {
		System.out.println("다른 ShopSevice 객체입니다.");

	}

}
}
