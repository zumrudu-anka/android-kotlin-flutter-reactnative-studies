# Recyler View

RecyclerView göstermek veya listelemek istediğimiz elemanlar için sabit bir alan ayırıyormuş. Örneğin 1000 eleman listelemek istediğimizi düşünürsek ListView'da bunların hepsi sayfada render edilirken veya görüntülenirken, RecyclerView kullandığımızda ise sadece uygulamanın görünür tarafları render oluyor ve scroll ettiğimizde eskileri silinip yenileri render ediliyor. (???)

## Steps

- res -> layout icerisinde recyclerview da her bir elemanın yani satırın yerine gececek yeni bir layout olusturulur.
- 