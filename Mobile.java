/*
*Mobile.java
*18 11 2020
*N Varadi
*/

public class Mobile{

	private String number;
	private String validity;


	public Mobile(){
		number = "";
		validity = "";
	}

	public void setNumber(String number){
		this.number = number;
	}

	public void compute(){
		if(number.length() == 10){
			if(number.charAt(0) =='0' && number.charAt(1) =='8'){
				if(number.charAt(2) == '3' ||number.charAt(2) == '5' ||number.charAt(2) == '6' || number.charAt(2) =='7'){
					validity = "valid";
				}
				else{
					validity = "invalid";
				}
			}
		}

	}


	public String getValidity(){
		return validity;
	}

}