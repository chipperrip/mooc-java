
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String country;
    private final String regCode;
    
    public RegistrationPlate(String country, String regCode) {
       
        this.country = country; 
        this.regCode = regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object object) {

        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (       !compared.regCode.equals(regCode)
                ||  compared.regCode == null
                || !compared.country.equals(country)
                ||  compared.country == null) {
            return false;
        }

        return true;
    }
    
    public int hashCode (){
        if(this.regCode == null){
            return 7;
        }
        
        return this.regCode.hashCode()+this.country.hashCode();
    }

}
