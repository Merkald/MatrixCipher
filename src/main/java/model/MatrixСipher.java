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
        for (int i = 0; i < value.length(); i++) {
            int position = key.indexOf(value.charAt(i));
            int n = (int) Math.floor(position / mSize);
            int m = position - mSize * n;
            result.append(n).append(m);
        }
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
