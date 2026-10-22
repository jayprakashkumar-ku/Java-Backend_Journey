
public class JavaTypeConversionDemo {

	public static void main(String[] args) {

		// ==========================================
		// 1. WIDENING CONVERSION
		// Small data type to larger data type
		// Automatic conversion performed by Java
		// ==========================================

		int number = 100;
		double wideNumber = number;

		System.out.println("Widening: " + wideNumber);

		// ==========================================
		// 2. NARROWING CONVERSION
		// Larger data type to smaller data type
		// Requires explicit casting
		// May cause data loss
		// ==========================================

		double price = 99.99;
		int wholePrice = (int) price;

		System.out.println("Narrowing: " + wholePrice);

		// ==========================================
		// 3. IMPLICIT TYPE CONVERSION
		// Automatic conversion by Java
		// ==========================================

		int age = 25;
		double convertedAge = age;

		System.out.println("Implicit: " + convertedAge);

		// ==========================================
		// 4. EXPLICIT TYPE CONVERSION
		// Manual conversion using a cast
		// ==========================================

		double salary = 45000.75;
		int roundedDownSalary = (int) salary;

		System.out.println("Explicit: " + roundedDownSalary);

		// ==========================================
		// 5. CHARACTER TO INTEGER
		// Stores the Unicode value of the character
		// 'A' has Unicode value 65
		// ==========================================

		char letter = 'A';
		int characterCode = letter;

		System.out.println("Character to Integer: " + characterCode);

		// ==========================================
		// 6. INTEGER TO CHARACTER
		// Casting converts the numeric value to a char
		// ==========================================

		int code = 66;
		char character = (char) code;

		System.out.println("Integer to Character: " + character);

		// ==========================================
		// 7. TYPE PROMOTION
		// byte, short and char become int in arithmetic
		// ==========================================

		byte first = 10;
		byte second = 20;

		int sum = first + second;

		System.out.println("Type Promotion: " + sum);

		// ==========================================
		// 8. STRING TO INTEGER
		// parseInt() converts numeric text to int
		// Invalid numeric text throws NumberFormatException
		// ==========================================

		String quantityText = "150";
		int quantity = Integer.parseInt(quantityText);

		System.out.println("String to Integer: " + quantity);

		// ==========================================
		// 9. INTEGER TO STRING
		// valueOf() converts an int to a String
		// ==========================================

		int productId = 101;
		String idText = String.valueOf(productId);

		System.out.println("Integer to String: " + idText);

		// ==========================================
		// 10. DECIMAL TO BINARY
		// Decimal = Base 10
		// Binary = Base 2 (0 and 1)
		// ==========================================

		int decimal = 25;

		String binary = Integer.toBinaryString(decimal);

		System.out.println("Decimal to Binary: " + binary);

		// ==========================================
		// 11. DECIMAL TO OCTAL
		// Octal = Base 8 (digits 0 to 7)
		// ==========================================

		String octal = Integer.toOctalString(decimal);

		System.out.println("Decimal to Octal: " + octal);

		// ==========================================
		// 12. DECIMAL TO HEXADECIMAL
		// Hexadecimal = Base 16 (0-9 and A-F)
		// ==========================================

		String hexadecimal = Integer.toHexString(decimal);

		System.out.println("Decimal to Hexadecimal: " + hexadecimal);

		// ==========================================
		// 13. BINARY TO DECIMAL
		// Radix 2 means the input is in binary
		// ==========================================

		String binaryValue = "11001";

		int binaryDecimal = Integer.parseInt(binaryValue, 2);

		System.out.println("Binary to Decimal: " + binaryDecimal);

		// ==========================================
		// 14. OCTAL TO DECIMAL
		// Radix 8 means the input is in octal
		// ==========================================

		String octalValue = "31";

		int octalDecimal = Integer.parseInt(octalValue, 8);

		System.out.println("Octal to Decimal: " + octalDecimal);

		// ==========================================
		// 15. HEXADECIMAL TO DECIMAL
		// Radix 16 means the input is hexadecimal
		// ==========================================

		String hexValue = "19";

		int hexDecimal = Integer.parseInt(hexValue, 16);

		System.out.println("Hexadecimal to Decimal: " + hexDecimal);

		// ==========================================
		// 16. BINARY TO HEXADECIMAL
		// First convert binary to decimal integer
		// Then convert the integer to hexadecimal
		// ==========================================

		String binaryNumber = "11001";

		int decimalValue = Integer.parseInt(binaryNumber, 2);

		String hexResult = Integer.toHexString(decimalValue);

		System.out.println("Binary to Hexadecimal: " + hexResult);

		// ==========================================
		// 17. HEXADECIMAL TO BINARY
		// First convert hexadecimal to decimal integer
		// Then convert the integer to binary
		// ==========================================

		String hexadecimalNumber = "19";

		int decimalResult = Integer.parseInt(hexadecimalNumber, 16);

		String binaryResult = Integer.toBinaryString(decimalResult);

		System.out.println("Hexadecimal to Binary: " + binaryResult);
	}
}
