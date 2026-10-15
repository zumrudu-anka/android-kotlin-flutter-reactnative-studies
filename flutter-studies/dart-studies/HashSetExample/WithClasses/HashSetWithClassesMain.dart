import 'dart:collection';

import 'package:deneme/HashSetExample/WithClasses/Student.dart';

void main () {
  Student s = Student(100, "Oso", "E1");
  Student s1 = Student(200, "Osi", "E2");
  Student s2 = Student(300, "Osili", "E3");

  HashSet<Student> students = HashSet<Student>();

  students.add(s);
  students.add(s1);
  students.add(s2);

  for (var o in students) {
    print("------------");
    print(o.no);
  }

  /* NOTE
      Siniflarla calistigimizda degerler tam olarak ayni olsa bile iki farkli
      nesne olustugu icin hashset'e bu eklenebiliyor.
      Bunu engellemek icin sinifin yapisinda bazi degisiklikler yapmaliyiz.
        1.  Sinifin HashCode degerinin degistirilmesi:
              Sinifin Hashcode'unu sinifin herhangi bir degiskenini isaret edecek
              sekilde degistirebiliriz. Bu sayede, bu sinifin nesnelerinin
              hashCode degeri sinifin belirledigimiz bir ozelligine isaret
              edecektir.
        2.  == operatorunun asiri yuklenmesi:
              == operatoru zaten bu sinifa ait iki nesnenin ayni olup
              olmadiginin ele alindigi ve asiri yuklendiginde bu durumun
              istege bagli olarak farkli bir sekilde degerlendirilmesini
              sagladigimiz bir operator. Bu operatoru asiri yukleyerek ve
              sinifin nesnelerinin birbirinin aynisi olup olmama durumunu
              sinifin bir degiskenine bagli olacak sekilde ele alirsak HashSet
              bunu baz alarak degerlendirme yapacaktir.
  */
  Student s3 = Student(300, "Osili", "E3");
  students.add(s3);
  print(students.length);
  for (var o in students) {
    print("------------");
    print(o.no);
  }
}