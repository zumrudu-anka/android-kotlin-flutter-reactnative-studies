# Activity Life Cycle

## On Create

Aktivite ilk kez başlatıldığında devreye girer

## On Resume

On Create'den sonra ve aktivite her Resume edildiğinde, yani aktiviteye başka aktiviteden dönüldüğünde veya arka plana alınıp tekrar uygulamaya(aktiviteye) dönüldüğünde devreye girer

## On Pause

Uygulama(aktivite) arka plana alınırken veya aktivite değiştirilirken On Stop'dan önce devreye girer

## On Stop

Uygulama(aktivite) arka plana alındığında veya aktivite değiştirildiğinde devreye girer

## On Destroy

Uygulama tamamen kapatıldığında veya aktivite `finish()` edildiğinde devreye girer
