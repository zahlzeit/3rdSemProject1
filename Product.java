package ProjectWithDB;

public class Product {
		int product_Id;
		private Supplier supplier_Id;
		private Supplier supplier_Name;
		private String product_Name;
		
		public Product() {
			product_Id=0;
			this.supplier_Id = null;
			this.supplier_Name = null;
			this.product_Name = "Rice";
		}
		
		public Product(int product_Id,Supplier supplier_Id, Supplier supplier_Name, String product_Name) {
			super();
			this.supplier_Id = supplier_Id;
			this.supplier_Name = supplier_Name;
			this.product_Name = product_Name;
		}
		
		public Supplier getsupplier_Id() {
			return supplier_Id;
		}
		public void setsupplier_Id(Supplier supplier_Id) {
			this.supplier_Id = supplier_Id;
		}
		public Supplier getsupplier_Name() {
			return supplier_Name;
		}
		public void setsupplier_Name(Supplier supplier_Name) {
			this.supplier_Name = supplier_Name;
		}
		public String getproduct_Name() {
			return product_Name;
		}
		public void setproduct_Name(String product_Name) {
			this.product_Name = product_Name;
		}

		@Override
		public String toString() {
			return "Edge [supplier_Id=" + supplier_Id + ", supplier_Name=" + supplier_Name + ", product_Name=" + product_Name + "]";
		}
}
