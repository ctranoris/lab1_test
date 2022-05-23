package gr.upatras.rest.example;

/**
 * @author ctranoris
 *
 */
public class Product {

	/**
	 * 
	 */
	private int id;
	/**
	 * 
	 */
	private String pname;
	/** 	 */
	private String batchno;
	/** 	 */
	private double price;
	/** 	 */
	private int noofproduct;

	/**
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return
	 */
	public String getBatchno() {
		return batchno;
	}

	/**
	 * @param batchno
	 */
	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	/**
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return
	 */
	public int getNoofproduct() {
		return noofproduct;
	}

	/**
	 * @param noofproduct
	 */
	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}

	/**
	 * @param id
	 * @param pname
	 * @param batchno
	 * @param price
	 * @param noofproduct
	 */
	public Product(int id, String pname, String batchno, double price, int noofproduct) {
		super();
		this.id = id;
		this.pname = pname;
		this.batchno = batchno;
		this.price = price;
		this.noofproduct = noofproduct;
	}

}
