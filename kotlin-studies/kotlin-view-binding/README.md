# View Binding

## Method 1

Bu yöntem kullanılması kolay olsa da deprecated olarak geçiyor.

build.gradle (Module: xxx.app) dosyasının en üstündeki plugins kısmına:
```kotlin
    plugins{
        ...
        ...
        id "kotlin-android-extensions"
        ...
    }
```

satırı eklenir ve daha sonra view lara aktivitelerden ulaşılabilir.

## Method 2

İlk yönteme göre biraz daha profesyonel sayılabilecek bir yöntem.

```kotlin
    val myTextView = findViewById<TextView>(R.id.myTextView)
```

## ⭐ Method 3 ⭐

Bu yöntem ise android in en son çıkardığı ve kullanılmasını önerdiği yöntem

Yine build.gradle (Module: xxx.app) dosyasında android kısmına:

```kotlin
    android {
        ...
        ...
        
        ...
        
        ...
        
        buildFeatures {
            viewBinding true
        }
    }
```

satırı eklenir. Daha sonra hangi aktivitede view binding işlemi kullanılacaksa o aktivitede `Activity<ActivityName>Binding` sınıfından bir nesne oluşturulur. Bu sınıfın adı standart olarak `Activity` ile başlar, daha sonra hangi aktivitede oluşturuluyorsa o aktivitenin adı gelir (Main aktivitesi için örnek: `Main`) ve daha sonra ise `Binding` kelimesi ile tamamlanır. (Profile aktivitesi için tam örnek: `ActivityProfileBinding`) Daha sonra onCreate metodunda bu nesnenin ilk ataması yapılır. Daha sonra contentView bu oluşturulan nesnenin root'u ile setlenir:

```kotlin
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
```

**Not** : Eğer bu işlemde sorun çıkarsa Android Studio menüsünde `Build: CleanProject` ve daha sonrasında `Build: Rebuild Project` seçenekleri seçilerek tekrar build edilmesi sağlanabilir.

Daha sonra ise diğer fonksiyonlar veya satırlardan viewlara ulaşılarak istenilen işlemler yapılabilir:

```kotlin
    fun myFunc(){
        binding.myTextView.text = "Yeni Text"
    }
```
