public class Needle {

	public static void main(String args[]) {
		boolean a = (contains("Java programming", "ogr"));
		boolean b = (contains("Java programming", "grammy"));
		
		System.out.println(a);
		System.out.println(b);
	}

	public static boolean contains(String haystack, String needle) {
		if (haystack.length() < needle.length()) {
			return (false);
		} else {
			boolean containsBoolean = false;
			for (int x = 0; x < needle.length(); x++) {
				if (haystack.charAt(x) != needle.charAt(x))
					if ((x + 1) == needle.length()) {
						containsBoolean = false;
						break;
					} else
						break;
				else if ((x + 1) == needle.length()) {
					containsBoolean = true;
					break;
				} else
					continue;
			}
			char[] charCollect = new char[(haystack.length() - 1)];
			for (int y=1; y<charCollect.length; y++) {
				charCollect[y-1] = haystack.charAt(y);
			}
			String newHaystack = new String(charCollect);
			if (containsBoolean == false)
				return (contains(newHaystack, needle));
			else
				return (true);
		}
	}
}