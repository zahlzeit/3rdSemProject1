package ProjectWithDB;

public class Supplier {

	private int supplier_Id;
	private String supplier_Name;	
	//default constructor
	public Supplier() {
		this.supplier_Id=0;
		this.supplier_Name="";
	}
	
	//parameterized Constructor
	public Supplier(int supplier_Id,String supplier_Name, double latitude, double longitude) {
		super();
		this.supplier_Id = supplier_Id;
		this.supplier_Name=supplier_Name;
	}
	
	
	public String getsupplier_Name() {
		return supplier_Name;
	}

	public void setsupplier_Name(String supplier_Name) {
		this.supplier_Name = supplier_Name;
	}

	public int getsupplier_Id() {
		return supplier_Id;
	}
	public void setsupplier_Id(int supplier_Id) {
		this.supplier_Id = supplier_Id;
	}
	@Override
	public String toString() {
		return "Supplier [supplier_Id=" + supplier_Id + ", supplier_Name=" + supplier_Name +  "]";
	}
	
	
	
	
}