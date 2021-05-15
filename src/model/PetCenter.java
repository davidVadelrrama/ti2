package model;

/**
*descripction:  name of the principal class of model
*/

public class PetCenter{
    private Pet[] pett;
    public static final int MAX_PET = 120;

    private Veterinary[] vets;
    public static final int MAX_VETS = 7;

    private Owners[] owns;
    public static final int MAX_OWNERS =120


    public PetCenter(){
      pett = new Pet[MAX_PET];

      vets = new Veterinary[MAX_VETS];

      owns = new Owners[MAX_OWNERS];


    }


    public void addvet(String id, String name, String lastName, String vetRegister){
	 	Veterinary vet = new Veterinary(id, name, lastName, vetRegister);

	 	for(int i=0; i<MAX_VETS; i++){
	 		if(vets[i] == null){
	 			vets[i] = vet;
	 		}
	 	}
	}



	public void removevet(){
		System.out.print("this the method to remove a some vet")
	}







	public void addpet(String specie, String name, String age, String race, String symptoms, Owner owner, Priority priority){
		
		Owner owner = null;
		for(int i=0; i<MAX_OWNERS;i++){
    			if(owners[i] != null && owners[i].getId().equalsIgnoreCase(id)){
        		owner = owners[i];
    		}
		}

		Pet pet = new Pet(specie,name,age,race,symptoms,owner,priority);

	    for(int i=0;i<MAX_PET;i++){
	    	if(pett[i] == null){
	    		pett[i] = pet;
	    	}
	    }


	}

	/**
	*This method is made to change the status of a pet
	*Object of type pet must be in status WAITING
	*Change pet status to DEPARTURE_WITHOUT_ATTENTION
	*@param name type String, pett[i].getName().equals(name)
	*@param nameeOwn type String, pett[i].getOwner().getName().equals(nameOwn)
	*/


	public void removepet(String name, String owner){
		boolean find = false;
		for(int i=0; i< pett.length && !find &&(pett[i].getStatus() == Status.WAITING);i++){	
				if(pett[i] != null){
			 		if(pett[i].getName().equals(name) && (pett[i].getOwner().getName().equals(owner))){
			 		System.out.print("Your pet"+pett[i].getName()+"has been succesfully remove from de waiting list");
			 		pett[i].setStatus(Status.DEPARTURE_WITHOUT_ATTENTION);
			 		find = true;
			 		}

			 		else{
			 			System.out.print("This pet cannot be remove because it has already been attended or it is in consult right now");
			 		}
				}
	 	}	

	}


	public void startconsultation(){
		System.out.print("this the method to remove a some vet")	
	}


	public void endconsultation(){
		System.out.print("this the method to ..")	
	}

	

	public void amountconsultation(){
		System.out.print("this the method to ..")	
	}


	public void dailyclosing(){
		System.out.print("this the method to ...")	
	}

}