public class Java9_13 {
    public String encrypt(String input){
        String encryptedString = "";
        for(int i=0; i<input.length(); i++){
            char encryptedChar = input.charAt(i);
            if(encryptedChar >= 'a' && encryptedChar <= 'z'){
                if(encryptedChar > 'm'){
                    encryptedChar -= 13;
                }else{
                    encryptedChar += 13;
                }
                encryptedString += encryptedChar;
            }else if(encryptedChar >= 'A' && encryptedChar <= 'Z'){
                if(encryptedChar > 'M'){
                    encryptedChar -= 13;
                }else{
                    encryptedChar += 13;
                }
                encryptedString += encryptedChar;
            }else{
                encryptedString += encryptedChar;
            }
        }
        return encryptedString;
    }

    public String octal(int input){
        String octalString = "";
        int power = 10;
        while(power >= 0){
            if(input < Math.pow(8, power)){
                power -= 1;
                octalString += "0";
            }else{
                int number = 0;
                while(input - number * Math.pow(8, power) >= 0){
                    number += 1;
                }
                number -= 1;
                input -= number * Math.pow(8, power);
                power -= 1;
                octalString += String.valueOf(number);
            }
        }
        return octalString;
    }

    public static void main(String args[]){
        Java9_13 object = new Java9_13();
        System.out.println(object.encrypt("Hello!"));
        System.out.println(object.encrypt("How's it going?"));

        System.out.println(object.octal(8));
        System.out.println(object.octal(35));
        System.out.println(object.octal(175));
    }
}

