package model;

public class MatrixСipher {
    private final String encryptedData;

    public MatrixСipher(String key, String value) {
        this.encryptedData = encryptData(key, value);
    }

    private String encryptData(String keyStr, String valueStr) {
        String key = keyStr.toUpperCase();
        String value = valueStr.toUpperCase();
        int mSize = (int) Math.floor(Math.sqrt(key.length()));
        StringBuilder result = new StringBuilder();
        value.codePoints().mapToObj(c -> (char) c)
                .forEach(c -> result
                        .append((int) Math.floor(key.indexOf(c) / mSize))
                        .append((key.indexOf(c) - mSize * Character
                                .getNumericValue(result.charAt(result.length()-1)))));
        return result.toString();
    }

    public String getEncryptedData(String patern) {
        String str = patern;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < encryptedData.length(); i += 2) {
            result.append(str
                    .replace('i', encryptedData.charAt(i))
                    .replace('j', encryptedData.charAt(i + 1)));
        }
        return result.toString();
    }
}
