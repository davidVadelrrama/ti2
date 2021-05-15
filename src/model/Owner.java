package model

public class Owner{

	private String name;
	private String address;
	private String cell;
	private String id;

	//constructors

	/**
	*Constructor method to creates an object named Owner
	*@param name     type String
	*@param address     type String
	*@param cell     type String
	*@param id   type String
	*/

	public Owner(String name, String address, String cell, String id){
		this.name = name;
		this.address = address;
		this.cell = cell;
		this.id = id;
	}

	//getters

	public String name(){
		return name;
	}
	public String address(){
		return address;
	}
	public String cell(){
		return cell;
	}
	public String id(){
		return id;
	}

	//setters

	/**
	*Change name of the pet owner
	*Change name that is saved in the variable
	*@param name type String
	*/

	public void setName(String name){
		this.name = name;
	}

	/**
	*Change address of the pet owner
	*Change address is saved in the variable
	*@param address type String
	*/

	public void setaddress(String address){
		this.address = address;
	}

	/**
	*Change cell of the pet owner
	*Change cell that is saved in the variable
	*@param cell type String
	*/

	public void setCell(String cell){
		this.cell = cell;
	}

	/**
	*Change id of the pet owner
	*Change id that is saved in the variable
	*@param id type String
	*/

	public void setId(String id){
		this.id = id;
	}


}