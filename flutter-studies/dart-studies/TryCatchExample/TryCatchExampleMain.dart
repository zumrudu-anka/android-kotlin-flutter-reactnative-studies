void main () {
  List<int> numbers = <int>[];

  numbers.add(24);
  numbers.add(25);

  numbers[0] = 12;

  print(numbers);

  try{
    numbers[3] = 245;
    print(numbers);
  }catch(e){
    print(e.toString());
    print("Listenin boyutunu astiniz");
  }



}