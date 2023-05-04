# Notes:

How to break String s into List<Character>:
```
String s = "aaaaabbbbbbooooollllltttmmmmm";
List<Character> characterList = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
```

How to create a hashmap of String|Character and Count (Long)
```
Map<Character, Long> mapCount = list.stream()
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));
```
