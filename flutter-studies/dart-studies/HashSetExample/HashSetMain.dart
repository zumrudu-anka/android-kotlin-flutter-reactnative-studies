import 'dart:collection';

void main () {
  Set<String> fruits = <String>{};

  fruits.add("Apple");
  fruits.add("Banana");
  fruits.add("Orange");
  fruits.add("PineApple");

  for (var o in fruits) {
    print(o);
  }

  fruits.add("apple");
  for (var o in fruits) {
    print(o);
  }

  HashSet<int> numbers = HashSet<int>();

  numbers.add(5);
  numbers.add(15);
  numbers.add(25);
  numbers.add(35);
  numbers.add(35);

  for (var o in numbers) {
    print(o);
  }

  HashSet<String> names = HashSet.from(["Osman", "Aslı"]);

  for (var o in names) {
    print(o);
  }
}