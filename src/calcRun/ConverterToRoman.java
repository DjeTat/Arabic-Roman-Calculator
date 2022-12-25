package calcRun;

public class ConverterToRoman {
    static String resultRoman;

    public static void getRomanNumber() throws InputException {
        if (Calculation.resultArabic > 4000) {
            throw new InputException("\nToo large number to convert. Try again");
        } else {
            int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanValues = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arabicValues.length; i++) {
                while (Calculation.resultArabic >= arabicValues[i]) {
                    Calculation.resultArabic -= arabicValues[i];
                    result.append(romanValues[i]);
                }
            }
            resultRoman = result.toString();
        }
    }
}