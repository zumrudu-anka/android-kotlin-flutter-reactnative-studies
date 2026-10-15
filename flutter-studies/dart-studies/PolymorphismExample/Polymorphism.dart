import 'package:deneme/PolymorphismExample/Manager.dart';
import 'package:deneme/PolymorphismExample/Staff.dart';
import 'package:deneme/PolymorphismExample/Teacher.dart';
import 'package:deneme/PolymorphismExample/Worker.dart';

void main () {
  Staff teacher = new Teacher();
  Staff worker = new Worker();

  Manager manager = new Manager();

  manager.recruit(teacher);
  manager.recruit(worker);
}