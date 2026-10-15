Future<void> main () async {
  print("Verilerin Alınması Bekleniyor...");

  String data = await getDataFromDB();
  print("Veri Alınıyor");
  print("Veri Kaynağı: ${data}");

}

Future<String> getDataFromDB() async{
  for (var i = 1; i < 6; i++) {
    Future.delayed(Duration(seconds: i), () => print("Alınan veri miktarı: ${i * 20}"));
  }

  /*return "asdasda";*/
  return Future.delayed(Duration(seconds: 5), () => "Veritabanı");
}
