package dom.jagadish.com.model;

import com.sun.corba.se.spi.ior.ObjectId;

public class Soap {

	private String productId;
	
	private String productName;
	private ObjectId image_id;
	private double productCost;
	private String productDescription;
	private String productQuantity;
	private String productExpDate;
	private String productMgfDate;
	private String productHighlight;

	public Soap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Soap(String productId, String productName, ObjectId image_id, double productCost, String productDescription,
			String productQuantity, String productExpDate, String productMgfDate, String productHighlight) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.image_id = image_id;
		this.productCost = productCost;
		this.productDescription = productDescription;
		this.productQuantity = productQuantity;
		this.productExpDate = productExpDate;
		this.productMgfDate = productMgfDate;
		this.productHighlight = productHighlight;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ObjectId getImage_id() {
		return image_id;
	}

	public void setImage_id(ObjectId image_id) {
		this.image_id = image_id;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(String productExpDate) {
		this.productExpDate = productExpDate;
	}

	public String getProductMgfDate() {
		return productMgfDate;
	}

	public void setProductMgfDate(String productMgfDate) {
		this.productMgfDate = productMgfDate;
	}

	public String getProductHighlight() {
		return productHighlight;
	}

	public void setProductHighlight(String productHighlight) {
		this.productHighlight = productHighlight;
	}

	
	
	/*
	 * public Soap(String productId, String productName, double productCost, String
	 * productDescription, String productQuantity, String productExpDate, String
	 * productMgfDate, String productHighlight) { super(); this.productId =
	 * productId; this.productName = productName; this.productCost = productCost;
	 * this.productDescription = productDescription; this.productQuantity =
	 * productQuantity; this.productExpDate = productExpDate; this.productMgfDate =
	 * productMgfDate; this.productHighlight = productHighlight; } public String
	 * getProductId() { return productId; } public void setProductId(String
	 * productId) { this.productId = productId; } public String getProductName() {
	 * return productName; } public void setProductName(String productName) {
	 * this.productName = productName; } public double getProductCost() { return
	 * productCost; } public void setProductCost(double productCost) {
	 * this.productCost = productCost; } public String getProductDescription() {
	 * return productDescription; } public void setProductDescription(String
	 * productDescription) { this.productDescription = productDescription; } public
	 * String getProductQuantity() { return productQuantity; } public void
	 * setProductQuantity(String productQuantity) { this.productQuantity =
	 * productQuantity; } public String getProductExpDate() { return productExpDate;
	 * } public void setProductExpDate(String productExpDate) { this.productExpDate
	 * = productExpDate; } public String getProductMgfDate() { return
	 * productMgfDate; } public void setProductMgfDate(String productMgfDate) {
	 * this.productMgfDate = productMgfDate; } public String getProductHighlight() {
	 * return productHighlight; } public void setProductHighlight(String
	 * productHighlight) { this.productHighlight = productHighlight; }
	 */
	
}
