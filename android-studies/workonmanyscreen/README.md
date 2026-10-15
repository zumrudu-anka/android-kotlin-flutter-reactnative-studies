# Work on Many Screen

[Örnek Kod Parçası](https://github.com/zumrudu-anka/android-studio-studies/tree/master/workonmanyscreen/app/src/main/java/com/zumrudu_anka/workonmanyscreen)

Intent sınıfı ile aktiviteler arası geçişler kontrol ediliyor.

Diğer aktiviteye veri yollama

```java
String userName = editText.getText().toString();
Intent intent=new Intent(MainActivity.this,Main2Activity.class);

intent.putExtra("userInput",userName);

startActivity(intent);
```

Aktiviteden veri alma

```java
Intent intent=getIntent();
String userName = intent.getStringExtra("userInput");
```

![Manyscreen Screen View](https://github.com/zumrudu-anka/AndroidStudioStudies/blob/master/Presentations/ManyScreen.gif)