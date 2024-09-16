// Base class Cipher
abstract class Cipher {
    String plainText;
    int key;

    // Constructor
    public Cipher(String plainText, int key) {
        this.plainText = plainText;
        this.key = key;
    }

    // Abstract methods for Encryption and Decryption
    abstract String Encryption();
    abstract String Decryption();
}

// Substitution_Cipher class
class Substitution_Cipher extends Cipher {
    // Substitution mapping for letters
    private static final String plainAlphabet = "abcdefghijklmnopqrstuvwxyz";
    private static final String cipherAlphabet = "qazwsxedcrfvtgbyhnujmikolp";

    //  Constructor
    public Substitution_Cipher(String plainText, int key) {
        super(plainText, key); // key can be ignored in this case
    }

    // Overriding Encryption method
    @Override
    public String Encryption() {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int index = plainAlphabet.indexOf(ch);
            if (index != -1) {
                encryptedText.append(cipherAlphabet.charAt(index));
            } else {
                encryptedText.append(ch); // Handle non-alphabetic characters
            }
        }
        return encryptedText.toString();
    }

    // Overriding Decryption method
    @Override
    public String Decryption() {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            int index = cipherAlphabet.indexOf(ch);
            if (index != -1) {
                decryptedText.append(plainAlphabet.charAt(index));
            } else {
                decryptedText.append(ch); // Handle non-alphabetic characters
            }
        }
        return decryptedText.toString();
    }
}

// Caesar_Cipher class
class Caesar_Cipher extends Cipher {

    // Constructor
    public Caesar_Cipher(String plainText, int key) {
        super(plainText, key);
    }

    // Overriding Encryption method
    @Override
    public String Encryption() {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                encryptedText.append((char) ((ch - base + key) % 26 + base));
            } else {
                encryptedText.append(ch); // Handle non-alphabetic characters
            }
        }
        return encryptedText.toString();
    }

    // Overriding Decryption method
    @Override
    public String Decryption() {
        StringBuilder decryptedText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                decryptedText.append((char) ((ch - base - key + 26) % 26 + base));
            } else {
                decryptedText.append(ch); // Handle non-alphabetic characters
            }
        }
        return decryptedText.toString();
    }
}

// Test the functionality
public class P4_2 {
    public static void main(String[] args) {
        // Substitution Cipher example
        Cipher substitutionCipher = new Substitution_Cipher("gcet", 0);
        String encryptedSub = substitutionCipher.Encryption();
        System.out.println("Substitution Cipher - Encrypted Text: " + encryptedSub);
        
        substitutionCipher = new Substitution_Cipher(encryptedSub, 0);
        String decryptedSub = substitutionCipher.Decryption();
        System.out.println("Substitution Cipher - Decrypted Text: " + decryptedSub);

        // Caesar Cipher example
        Cipher caesarCipher = new Caesar_Cipher("gcet", 3);
        String encryptedCaesar = caesarCipher.Encryption();
        System.out.println("Caesar Cipher - Encrypted Text: " + encryptedCaesar);
        caesarCipher = new Caesar_Cipher(encryptedCaesar, 3);
        String decryptedCaesar = caesarCipher.Decryption();
        System.out.println("Caesar Cipher - Decrypted Text: " + decryptedCaesar);
    }
}
