package bytebean;

import java.util.regex.Pattern;

public class Client {

    private String FullName;
    private String PhoneNumber;
    private String Gmail;
    private String City;
    private String Message;

    /*IIB = Excutes each timewhen an instance of the class is created */
    {
        FullName = "";
        PhoneNumber = "";
        Gmail = "";
        City = "";
        Message = "";
    }

    // getter & setter
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        if (FullName.length() != 0 && FullName.length() >= 10) {
            this.FullName = FullName;
            
        } else {
            Message += "Invalid Full Name\n";
           
        }
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        if ((PhoneNumber.startsWith("010") || PhoneNumber.startsWith("011") || PhoneNumber.startsWith("012") || PhoneNumber.startsWith("015")) && PhoneNumber.length() == 11) {
            this.PhoneNumber = PhoneNumber;
           
            /*
          Using Regex
          
          if (Pattern.matches("01[0125][0-9]{8}",PhoneNumber)
          this.PhoneNumber=PhoneNumber;
             */
        } else {
            Message += "Invalid Phone Number\n";
            
        }
    }

    public String getGmail() {
        return Gmail;
    }

    public boolean GmailCheck(String Gmail) {
        return Pattern.matches("[a-z0-9]{5,25}@[a-z]{3,10}\\.[a-z]{3,10}", Gmail.toLowerCase());
    }

    public void setGmail(String Gmail) {
        if (GmailCheck(Gmail)) {
            this.Gmail = Gmail;
            
        } else {
            Message += "Invalid Gmail\n";
            
        }
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        if (City.length() >= 4 && City.length() <= 30) {
            this.City = City;
           
        } else {
            Message += "Invalid City\n";
            
        }
    }

    public String getMessage() {
        return Message;
    }

   
    /*Constructor to Initialize 4 Variables*/
    public Client(String FullName, String PhoneNumber, String Gmail, String City) {
        setFullName(FullName);
        setPhoneNumber(PhoneNumber);
        setGmail(Gmail);
        setCity(City);
    }
}
