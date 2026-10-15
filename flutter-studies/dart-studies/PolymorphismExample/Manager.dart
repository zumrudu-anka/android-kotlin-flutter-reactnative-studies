
import 'package:deneme/PolymorphismExample/Staff.dart';

class Manager extends Staff{
  void recruit(Staff s){
    s.recruited();
    print("Mutlu olan: ${s.runtimeType}");
  }
}