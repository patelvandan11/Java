public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a message and a key.");
            return;
        }

        String plaintext = args[0];
        int key = Integer.parseInt(args[1]);

        System.out.println("Message: " + plaintext);
        System.out.println("Key: " + key);

        Secret secret = new Secret();

        // Encrypt the plaintext using the provided key
        String ciphertext = secret.encrypt(plaintext, key);
        System.out.println("Encrypted Text: " + ciphertext);

        // Decrypt the ciphertext using the same key
        String decryptedText = secret.decrypt(ciphertext, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}

class Secret {

    public String encrypt(String plaintext, int key) {
        // Convert String to char[]
        char[] ptArray = plaintext.toCharArray();
        // Create char[] with the same length as plaintext
        char[] ctArray = new char[ptArray.length];

        for (int i = 0; i < ptArray.length; i++) {
            // Shift each character by the key
            ctArray[i] = (char) (ptArray[i] + key);
        }

        // Convert char[] to String
        return String.valueOf(ctArray);
    }

    public String decrypt(String ciphertext, int key) {
        // Convert String to char[]
        char[] ctArray = ciphertext.toCharArray();
        // Create char[] with the same length as ciphertext
        char[] ptArray = new char[ctArray.length];

        for (int i = 0; i < ctArray.length; i++) {
            // Reverse the shift by subtracting the key
            ptArray[i] = (char) (ctArray[i] - key);
        }

        // Convert char[] to String
        return String.valueOf(ptArray);
    }
}
