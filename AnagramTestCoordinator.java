import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramTestCoordinator {

	boolean isAnagram(String s1, String s2) {
		String stringOneWithoutSpaces = s1.replaceAll("\\s", "").toLowerCase();
		String stringTwoWithoutSpaces = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = false;

		if (stringOneWithoutSpaces.length() == stringTwoWithoutSpaces.length()) {
			status = true;
			Map<Character, Integer> charCountMap = generateCharCountMap(stringOneWithoutSpaces, stringTwoWithoutSpaces);

			for (int value : charCountMap.values()) {
				if (value != 0) {
					status = false;
				}
			}
		} else if (stringOneWithoutSpaces.contains(stringTwoWithoutSpaces))
			status = true;

		return status;
	}

	private Map<Character, Integer> generateCharCountMap(String stringOneWithoutSpaces, String stringTwoWithoutSpaces) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < stringOneWithoutSpaces.length(); i++) {
			int charCount = 0;
			char key = stringOneWithoutSpaces.charAt(i);
			if (map.containsKey(key)) {
				charCount = map.get(key);
			}
			map.put(key, ++charCount);

			charCount = 0;
			key = stringTwoWithoutSpaces.charAt(i);
			if (map.containsKey(key)) {
				charCount = map.get(key);
			}
			map.put(key, --charCount);
		}
		return map;
	}
}
