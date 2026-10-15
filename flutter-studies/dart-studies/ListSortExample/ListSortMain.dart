import 'dart:math';

import 'package:deneme/ListSortExample/Student.dart';

void main () {
  List<Student> students = <Student>[];

  Random randomObject = Random();
  const int maxNo = 1000;
  const int studentCount = 25;
  for (int i = 0; i < studentCount; ++i) {
    int no = randomObject.nextInt(maxNo);
    students.add(Student(no, "Oso${i + 1}", "E${i+1}"));
  }

  Comparator<Student> sortAscending = (x, y) => x.no.compareTo(y.no);

  students.sort(sortAscending);

  for (var o in students) {
    print('********');
    print(o.no);
    print(o.name);
    print(o.className);
  }

  Comparator<Student> sortDescending = (y, x) => x.no.compareTo(y.no);

  students.sort(sortDescending);

  for (var o in students) {
    print('********');
    print(o.no);
    print(o.name);
    print(o.className);
  }

  Comparator<Student> sortByName = (x, y) => x.name.compareTo(y.name);

  students.sort(sortByName);

  for (var o in students) {
    print('********');
    print(o.no);
    print(o.name);
    print(o.className);
  }
}