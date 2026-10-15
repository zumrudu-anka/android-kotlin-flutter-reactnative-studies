
import 'package:deneme/InterfacesExample/Eatable.dart';
import 'package:deneme/InterfacesExample/Squeezable.dart';

class Apple implements Squeezable, Eatable{
  @override
  void howToSqueeze() {
    print('Blender ile sık');
  }

  @override
  void howToEat() {
    print('Dilimle ve ye');
  }


}