package model;

public class WordsMatrix {

    public String encryptData(String matrixStr, String wordStr, String patern) {
        String matrix = matrixStr.toUpperCase();
        String word = wordStr.toUpperCase();
        if (Math.sqrt(matrix.length()) % 1 != 0) {
            return "Square matrix can not be formed.";
        }
        int matrixSize = (int) Math.floor(Math.sqrt(matrix.length()));
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int position = matrix.indexOf(word.charAt(i));
            if (position == -1) {
                return "Symbol: " + word.charAt(i) + " doesnt exist in Matrix.";
            }
            int row = (int) Math.floor(position / matrixSize);
            int column = position - matrixSize * row;
            if (i > 0 && !(Character.getNumericValue(result.charAt((i - 1) * 2)) != row
                    || Character.getNumericValue(result.charAt((i - 1) * 2 + 1)) != column)) {
                return "Way not finded.";
            }
            result.append(row).append(column);
        }
        return getEncryptedData(result.toString(), patern);
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
