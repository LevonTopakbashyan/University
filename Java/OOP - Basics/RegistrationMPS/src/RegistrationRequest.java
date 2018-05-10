public class RegistrationRequest {

    private String currentOwnerName;
    private String newOwnerName;
    private String regNumber;
    public int entranceNumber = 0;

    public String getCurrentOwnerName(){
        return this.currentOwnerName;
    }

    public String getNewOwnerName(){
        return this.newOwnerName;
    }

    public String getRegNumber(){
        return this.regNumber;
    }

    public int getEntranceNumber(){
        return this.entranceNumber;
    }

    public RegistrationRequest(String currentOwnerName, String newOwnerName, String regNumber, int entranceNumber){
        this.currentOwnerName = currentOwnerName;
        this.newOwnerName= newOwnerName;
        this.regNumber= regNumber;
        this.entranceNumber= entranceNumber;
    }

    public RegistrationRequest(){

    }

    @Override
    public String toString() {
        return String.format("%s current owner.  %s new owner. Number of car %s. Number of request %d",
                this.currentOwnerName,
                this.newOwnerName,
                this.regNumber,
                this.entranceNumber);
    }
}
