class Student{
  late int no;
  late String name;
  late String className;

  Student(this.no, this.name, this.className);

  @override
  int get hashCode => no;

  @override
  bool operator ==(Object other) {
    if(no == (other as Student).no){
      return true;
    }
    return false;
  }
}