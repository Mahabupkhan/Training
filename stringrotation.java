// Java program to check if a string is two time
// rotation of another string.

class stringrotation
{
	// Method to check if string2 is obtained by
	// string 1
	static boolean isRotated(String str1, String str2)
	{
		if (str1.length() != str2.length())
			return false;
		if(str1.length() < 2)
		{
			return str1.equals(str2);
		}
	
		String clock_rot = "";
		String anticlock_rot = "";
		int len = str2.length();
	
		// Initialize string as anti-clockwise rotation
		anticlock_rot = anticlock_rot +
						str2.substring(len-2, len) +
						str2.substring(0, len-2) ;
	
		// Initialize string as clock wise rotation
		clock_rot = clock_rot +
					str2.substring(2) +
					str2.substring(0, 2) ;
	
		// check if any of them is equal to string1
		return (str1.equals(clock_rot) ||
				str1.equals(anticlock_rot));
	}
	
	// Driver method
	public static void main(String[] args)
	{
		String str1 = "geeks";
		String str2 = "eksge";
	
		System.out.println(isRotated(str1, str2) ? "Yes"
							: "No");
	}
}
