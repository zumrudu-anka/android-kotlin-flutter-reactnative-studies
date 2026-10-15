import 'dart:math';

import 'package:deneme/ListFiltersExample/Student.dart';

void main () {
  List<Student> students = <Student>[];

  Random randomObject = Random();
  const int maxNo = 1000;
  const int studentCount = 25;
  for (int i = 0; i < studentCount; ++i) {
    int no = randomObject.nextInt(maxNo);
    students.add(Student(no, "Oso${i + 1}", "E${i+1}"));
  }

  /*Iterable<Student> filteredList = students.where((student){
    return student.no > 750;
  });

  students = filteredList.toList();*/

  students = students.where((student){
    return student.no > 750;
  }).toList();

  for (var o in students) {
    print("***********");
    print(o.no);
    print(o.name);
    print(o.className);
  }
}