package model;

public class Pet{

	private String specie;			//private variable for the pet´s species
	private String name;			//private variable for the pet´s name
	private String age;				//private variable for the pet´s age
	private String race;			//private variable for the pet´s rac
	private String symptoms;		//private variable for the pet´s
	private Owner owner;			//private variable for the pet´s
	private Priority priority;		//private variable for the pet´s
	private Status status;			//private variable for the pet´s


	//constructors for pet objects


	/**
	*Constructor method to creted an object of type Pet
	*initialized the attend variable in null, another by parameters
	*@param specie     type String
	*@param name       type String
	*@param age        type String 
	*@param race       type String
	*@param symptoms   type String
	*@param owner      type owner
	*@param priority   type priority
	*@param status     type Status
	*/

	public Pet(String specie, String name, String age, String race, String symptoms, Owner owner, Priority priority ){
		this.specie = specie;
		this.name = name;
		this.age = age;
		this.race = race;
		this.symptoms = symptoms;
		this.owner = owner;
		this.priority = priority;
		this.status = Status.WAITING;

	}


	//getters for pet objects


    public String getSpecies(){
		return specie;
	}

	public String getName(){
		return name;
	}

	public String getAge(){
		return age;
	}

	public String getRace(){
		return race;
	}

	public String getSymptoms(){
		return symptoms;
	}

	public Owner getOwner(){
		return owner;
	}

	public Priority getPriority(){
		return priority;
	}

	public Status getStatus(){
		return status;
	}

	





	//setters for pet objects


	/**
	*Change the species of pet
	*Change the species saved in variable
	*@param specie type String
	*/

	public void setSpecies(String specie){
		this.specie = specie;
	}


	/**
	*Change pets's name 
	*Change name that is saved in variable
	*@param name type String
	*/

	public void setName(String name){
		this.name = name;
	}


	/**
	*Change pets's age 
	*Change age that is saved in variable
	*@param name type String
	*/

	public void setAge(String age){
		this.age = age;
	}


	/**
	*Change pets's race 
	*Change race that is saved in variable
	*@param race type String
	*/

	public void setRace(String race){
		this.race = race;
	}


	/**
	*Change pets's symptoms 
	*Change symptoms that is saved in variable
	*@param symptoms type String
	*/

	public void setSymptoms(String symptoms){
		this.symptoms = symptoms;
	}


	/**
	*Change pets's priority 
	*@param priority type Priority
	*/

	public void setPriority(Priority priority){
		this.priority = priority;
	}



	/**
	*Change pets's status 
	*@param status type Status
	*/

	public void setStatus(Status status){
		this.status = status;
	}



}

