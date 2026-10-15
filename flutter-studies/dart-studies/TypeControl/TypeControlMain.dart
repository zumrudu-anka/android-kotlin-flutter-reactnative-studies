import 'package:deneme/TypeControl/Manager.dart';
import 'package:deneme/TypeControl/Staff.dart';
import 'package:deneme/TypeControl/Teacher.dart';
import 'package:deneme/TypeControl/Worker.dart';

void main () {
  Staff teacher = Teacher();
  Staff worker = Worker();

  Manager manager = Manager();

  manager.promote(teacher);
  manager.promote(worker);

  // Downcasting
  Staff s = Teacher();
  (s as Teacher).increaseSalary();

  // Upcasting
  Teacher t2 = Teacher();
  Staff s2 = t2;

  s2.recruited();
  (s2 as Teacher).increaseSalary();

}