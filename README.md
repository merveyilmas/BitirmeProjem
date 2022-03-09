# Bitki Tanıma Uygulaması

### Sistem Bileşenleri

Uygulamamız Android Studio platformunda Java dili kullanılarak geliştirilmiştir.Firebase’nin eşzamanlı Veritabanı desteği, kullanıcı girişlerinde yetkilendirme, depolama, makine öğrenme kiti, ortak fonksiyon gibi temel ve avantajlı özelliklerini kullanarak, Verilerimizi Firebase ortamına kaydettik ve veri çekme işlemini Firebase sayesinde yaptık.

### Uygulamanın Amacı

İnsanlar geçmişten günümüze bitkileri çeşitli amaçlarla kullanmaktadır. Hastalıklarını tedavi etmek, beslenmek, barınmak, savunmak ve ısınmak için bitkilerden faydalanılmıştır ve hala faydalanılmaya devam edilmektedir. Fakat bilgiler hakkında yeni jenerasyon yeterli bilgiye sahip değildir. Bu proje ile Trabzon yöresindeki bitkiler hakkında insanların bu bitkileri daha kolay ve eğlenceli bir şekilde bilgi sahibi olması amaçlanıyor. 

### Uygulama hakkında;


Uygulamamız Android cihazlarda çalışır ve bitkiler hakkında bilgi edinme, blog sayfasında bitki paylaşımı ile diğer kullanıcılarla etkileşim kurabilme özeliklerine sahip bir uygulamadır. Uygulamadan kısaca bahsedecek olursak; Bitki tanıma uygulaması, içerisinde bitki bilgilerini resimli ve detaylı bulunduruyor. Bunlara ek olarak, bahçem sayfasına kendi bitkilerini ekleyebiliyor, profilim sayfasında bitki paylaşabiliyor, blog sayfasında diğer kullanıcıların paylaştığı gönderileri görebiliyor, galeriden resim seçerek gönderi oluşturabiliyor. 

Uygulamamız ilk açıldığında kullanıcı giriş sayfası açılmaktadır. Eğer kullanıcı daha önceden kayıt olmuş ise buradan kullanıcı bilgileriyle giriş yapabilir. Eğer kullanıcı kayıtlı değil ise kayıt ol butonuna tıklayarak ve istenilen bilgileri doldurarak uygulamaya kayıt olabilmektedir. Kullanıcı giriş yaptıktan sonra kullanıcıyı hoşgeldiniz ekranı karşılar. Buradan ise anasayfaya geçiş yapılır. Anasayfada bulunan bitki görselleri üzerine tıklanarak detaylı bilgi edinebilmek için bitki bilgi sayfasına yönlendirilir. Bitki bilgi sayfasında bitkinin görseli ve hakkında detaylı bilgiye ulaşılabilir. Blog sayfasında tüm kullanıcıların paylaştığı gönderiler görülebilir. Kullanıcı profil sayfasında blog sayfasına eklediği gönderilerin listesini görebilir. Buradan gönderi ekle butonuna tıklayarak, bloğuna gönderi ekleyebilir, ayarlar butonuna tıklayarak ise ayarlar sayfasına ulaşabilir. Kullanıcı, ayarlar sayfasında profil resmi seçebilir ve oturumunu sonlandırabilir.


## Uygulamadan Ekran Görüntüleri

<Br>Giriş Ekranı&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kayıt Ol Ekranı&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Hoşgeldiniz Ekranı</Br>                                          
<img height="400" src="https://imgyukle.com/f/2022/03/09/EiMQrM.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiMdsI.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZVds.png" />

-----------------------------------------

<Br>Anasayfa Ekranı&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bitki Bilgi Sayfası&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blog Sayfası</Br>                                          
<img height="400" src="https://imgyukle.com/f/2022/03/09/EiZCSR.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZSse.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZN96.png" />

--------------------------------------------

<Br>Kamera Okutma Sayfası&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Bahçem Sayfası&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Profilim Sayfası</Br>                                          
<img height="400" src="https://imgyukle.com/f/2022/03/09/EiZjSp.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZcFM.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZhnh.png" />

--------------------------------------------

<Br>Fotoğraf Yükleme Sayfası&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Ayarlar Sayfası&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Kullanıcı Profili Seçme Sayfası</Br>                                          
<img height="400" src="https://imgyukle.com/f/2022/03/09/EiZDao.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZGzU.png" /> <img height="400" src="https://imgyukle.com/f/2022/03/09/EiZ1B1.png" />

--------------------------------------------
Bu uygulamayı ben dahil 3 kişi (Dilber Aslan, Burcu Bıyık), Avrasya Üniversitesi Bilgisayar Mühendisliği Bölümü'nde bitirme projesi olarak yaptık.
