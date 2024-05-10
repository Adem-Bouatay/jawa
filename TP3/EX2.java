import java.nio.charset.Charset;

class XORCipher{
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private String key;
    public XORCipher(String key){
        this.key = key;
    }
    public String encrypt(String plaintext){
        byte[] textBin = plaintext.getBytes(UTF_8);
        byte[] keyBin = key.getBytes(UTF_8);
        StringBuilder encryptedTextBuilder = new StringBuilder();
        for (int i = 0; i < textBin.length; i++) {
            byte encryptedByte = (byte) (textBin[i] ^ keyBin[i % keyBin.length]);
            encryptedTextBuilder.append((char) encryptedByte);
        }
        String encryptedText = encryptedTextBuilder.toString();
        return encryptedText;
    }
    public String decrypt(String ciphertext){
        byte[] textBin = ciphertext.getBytes(UTF_8);
        byte[] keyBin = key.getBytes(UTF_8);
        StringBuilder decryptedTextBuilder = new StringBuilder();
        for (int i = 0; i < textBin.length; i++) {
            byte decryptedByte = (byte) (textBin[i] ^ keyBin[i % keyBin.length]);
            decryptedTextBuilder.append((char) decryptedByte);
        }
        String decryptedText = decryptedTextBuilder.toString();
        return decryptedText;
    }
}

public class EX2 {
    public static void main(String[] args) {
    // Clé de chiffrement
    String key = "secret";
    // Texte clair à chiffrer
    String plaintext = "bagga";
    // Création de l’objet XORCipher
    XORCipher xorCipher = new XORCipher(key);
    // Chiffrement du texte clair
    String encryptedText = xorCipher.encrypt(plaintext);
    System.out.println("Texte chiffré : " + encryptedText);
    // Déchiffrement du texte chiffré
    String decryptedText = xorCipher.decrypt(encryptedText);
    System.out.println("Texte déchiffré : " + decryptedText);
}
}