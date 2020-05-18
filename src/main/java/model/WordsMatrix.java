package model;

public class WordsMatrix {

    public String encryptData(String matrixStr, String wordStr) {
        String matrix = matrixStr.toUpperCase();
        String word = wordStr.toUpperCase();
        int matrixSize = (int) Math.floor(Math.sqrt(matrix.length()));
        StringBuilder result = new StringBuilder();
        word.codePoints().mapToObj(c -> (char) c)
                .forEach(c -> result
                        .append((int) Math.floor(matrix.indexOf(c) / matrixSize))
                        .append((matrix.indexOf(c) - matrixSize * Character
                                .getNumericValue(result.charAt(result.length() - 1)))));
        return result.toString();
    }

    public String getEncryptedData(String encryptedData, String patern) {
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
