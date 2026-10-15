import 'package:deneme/InterfacesExample/AmasyaApple.dart';
import 'package:deneme/InterfacesExample/Apple.dart';
import 'package:deneme/InterfacesExample/Chicken.dart';
import 'package:deneme/InterfacesExample/Eatable.dart';
import 'package:deneme/InterfacesExample/Lion.dart';

void main () {

  Lion lion = Lion();

  Apple amasyaElmasi = AmasyaApple();
  Apple apple = Apple();
  Eatable chicken = Chicken();

  chicken.howToEat();

  apple.howToEat();
  apple.howToSqueeze();

  amasyaElmasi.howToSqueeze();
  amasyaElmasi.howToEat();

  AmasyaApple amasyaElmasi2 = AmasyaApple();
  amasyaElmasi2.howToEat();
  amasyaElmasi2.howToSqueeze();
}