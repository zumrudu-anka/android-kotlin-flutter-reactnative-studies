import 'dart:collection';

void main () {
  HashMap<int, String> persons = HashMap<int, String>();
  persons[1] = "Osman";
  persons[22] = "Aslı";

  for (var o in persons.entries) {
    print(o.key);
    print(o.value);
  }

  print(persons);

  persons[1] = "YeniOsman";
  print(persons);

  Iterable<int> keys = persons.keys;

  for (var o in keys) {
    print(persons[o]);
  }

  persons[12] = "Deneme";
  print(persons);

  persons.remove(12);

  print(persons);
}