package p13.textbook.s130701;

public class ChildProductAndStorageExample {
public static void main(String[] args) {
	ChildProduct<Tv, String, String> product = new ChildProduct<>();
	product.setKind(new Tv());
	product.setCompany("samsung");
	product.setModel("smart Tv");
	
	Storage<Tv> storage = new StorageImp1<Tv>(100);
	storage.add(new Tv(), 0);
	Tv tv = storage.get(0);
	
	
	
}
}
