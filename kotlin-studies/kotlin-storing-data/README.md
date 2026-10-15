# Shared Preferences

Uygulama içi küçük verileri (genellikle uygulama izin verilerini) key-value formatında saklayabileceğimiz dosya.

`getSharedPreferences(name, mode)` fonksiyonu ile çağrılıyor ve fonksiyon 2 parametre alıyor.

- İlk Parametre: Kullandığımız veya kullanacağımız sharedPreferences dosyasının adı
- İkinci Parametre: Bu dosyanın modu. 3 mod bulunuyor
    1. MODE_PRIVATE: Oluşturulan dosyaya yalnızca çağıran uygulama tarafından erişilir (File creation mode: the default mode, where the created file can only be accessed by the calling application (or all applications sharing the same user ID).)
    2. MODE_WORLD_READABLE: Diğer uygulamalar dosyayı okuyabilir fakat değiştiremez (File creation mode: allow all other applications to have read access to the created file.)
    3. MODE_WORLD_WRITABLE: Diğer uygulamalar dosyayı okuyabilir ve değiştirebilir (File creation mode: allow all other applications to have write access to the created file.)

1	
MODE_APPEND

This will append the new preferences with the already existing preferences

2	
MODE_ENABLE_WRITE_AHEAD_LOGGING

Database open flag. When it is set , it would enable write ahead logging by default

3	
MODE_MULTI_PROCESS

This method will check for modification of preferences even if the sharedpreference instance has already been loaded

4	
MODE_PRIVATE

By setting this mode, the file can only be accessed using calling application

5	
MODE_WORLD_READABLE

This mode allow other application to read the preferences

6	
MODE_WORLD_WRITEABLE

This mode allow other application to write the preferences
