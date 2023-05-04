# Notes:

How to break String s into List<Character>:
```java
String s = "aaaaabbbbbbooooollllltttmmmmm";
List<Character> characterList = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
```

How to create a hashmap of String|Character and Count (Long)
```java
Map<Character, Long> mapCount = list.stream()
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
```

Find The Largest sum of Subarray
```java
int maxSum = Arrays.stream(arr)
                .reduce((sum, i) -> sum > 0 ? sum + i : i)
                .getAsInt();
```

How to find max in hashMap
```java
Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
```