package gr.upatras.rest.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ctranoris
 *
 */
public class Category {

	/**
	 * 
	 */
	private int id;

	/**
	 * name of category
	 */
	private String name;


	/**
	 * list of products in category
	 */
	private List<Product> products = new ArrayList<>();
	
	
	/**
	 * 
	 * constructire
	 * @param id
	 * @param name
	 */
	/**
	 * @param id
	 * @param name
	 */
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


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
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * @param products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}
