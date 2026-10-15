import 'package:deneme/TypeControl/Worker.dart';
import 'package:deneme/TypeControl/Staff.dart';
import 'package:deneme/TypeControl/Teacher.dart';

class Manager extends Staff{
  void recruit(Staff s){
    s.recruited();
    print("Mutlu olan: ${s.runtimeType}");
  }

  void promote(Staff s){
    // Henuz tip kontrolu yapilmadigi icin alt sinifin ozelligini kullanabilmek
    // icin downcasting islemi yapilmalidir.

    // Downcasting keyword = as
    /*(s as Teacher).increaseSalary();*/

    if (s is Teacher){
      // Tip kontrolu yaptiktan sonra direk downcasting yapilmis gibi islem
      // yapilabiliyor
      s.increaseSalary();
    }
    if (s is Worker){
      print('İşçiler terfi alamaz');
    }
  }
}