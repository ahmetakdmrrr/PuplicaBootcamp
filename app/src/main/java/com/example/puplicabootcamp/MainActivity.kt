package com.example.puplicabootcamp

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.puplicabootcamp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Ödev 2: Soru 1 - İç açıları toplamını hesaplayan metod
    private fun calculateInteriorAngles(sides: Int): Int {
        return (sides - 2) * 180
    }

    // Ödev 2: Soru 2 - Maaş hesaplama
    private fun calculateSalary(days: Int): Int {
        val hoursPerDay = 8
        val hourlyRateNormal = 10
        val hourlyRateOvertime = 20
        val normalHoursLimit = 160

        val totalHours = days * hoursPerDay
        val normalHours = if (totalHours > normalHoursLimit) normalHoursLimit else totalHours
        val overtimeHours = if (totalHours > normalHoursLimit) totalHours - normalHoursLimit else 0

        return (normalHours * hourlyRateNormal) + (overtimeHours * hourlyRateOvertime)
    }

    // Ödev 2: Soru 3 - Kota ücreti hesaplama
    private fun calculateQuotaFee(gb: Int): Int {
        val baseQuota = 50
        val baseFee = 100
        val feePerGb = 4

        return if (gb <= baseQuota) {
            baseFee
        } else {
            val extraGb = gb - baseQuota
            baseFee + (extraGb * feePerGb)
        }
    }

    // Ödev 2: Soru 4 - Kelime harf sayısını hesaplama
    private fun countLetters(word: String): Int {
        return word.length
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        // Ödev 1: Değişkenleri tanımlayıp yazdırma
        val sehir = "İstanbul"
        val ulke = "Türkiye"
        val telefon = "5551234567"
        val postaKodu = "34000"
        val email = "ornek@email.com"
        val meslek = "Mühendis"
        val stokMiktari = "100"
        val musteriAdi = "Ahmet Yılmaz"
        val bakiye = "5000 TL"
        val dogumGunu = "01.01.1990"
        val maas = "10000 TL"
        val medeniDurum = "Evli"
        val urunYorum = "Çok iyi bir ürün"
        val odemeTarihi = "25.04.2025"
        val odeme = "Kredi Kartı"
        val siparisAdeti = "5"
        val arabaModeli = "Toyota Corolla"
        val kitapAdi = "1984"
        val yayinlamaTarihi = "01.06.1949"
        val indirimMiktari = "20%"
        val odaSayisi = "3"
        val enlem = "41.0082"
        val boylam = "28.9784"
        val urunAdi = "Telefon"
        val mark = "Samsung"
        val muzikAdi = "Bohemian Rhapsody"
        val videoSuresi = "6 dakika"
        val urunPuani = "4.5"
        val resimAdi = "profil.jpg"
        val dosyaFormati = "JPEG"
        val renk = "Mavi"
        val renkKodu = "#0000FF"
        val telefonModeli = "Galaxy S21"
        val ekranBoyutu = "6.2 inç"
        val agirlik = "200 gr"
        val ulusalGun = "29 Ekim"
        val tatilGunu = "Cumartesi"
        val rezervasyonTarihi = "01.05.2025"
        val sokakAdi = "Çiçek Sokak"
        val otobusHatti = "E-5"
        val kalanDakika = "15"
        val takipKodu = "TR123456"
        val kuponSuresi = "30 gün"
        val kuponKodu = "INDIRIM20"
        val faturaAdresi = "İstanbul, Kadıköy"

        println("Şehir: $sehir")
        println("Ülke: $ulke")
        println("Telefon: $telefon")
        println("Posta Kodu: $postaKodu")
        println("Email: $email")
        println("Meslek: $meslek")
        println("Stok Miktarı: $stokMiktari")
        println("Müşteri Adı: $musteriAdi")
        println("Bakiye: $bakiye")
        println("Doğum Günü: $dogumGunu")
        println("Maaş: $maas")
        println("Medeni Durum: $medeniDurum")
        println("Ürün Yorum: $urunYorum")
        println("Ödeme Tarihi: $odemeTarihi")
        println("Ödeme: $odeme")
        println("Sipariş Adeti: $siparisAdeti")
        println("Araba Modeli: $arabaModeli")
        println("Kitap Adı: $kitapAdi")
        println("Yayınlama Tarihi: $yayinlamaTarihi")
        println("İndirim Miktarı: $indirimMiktari")
        println("Oda Sayısı: $odaSayisi")
        println("Enlem: $enlem")
        println("Boylam: $boylam")
        println("Ürün Adı: $urunAdi")
        println("Marka: $mark")
        println("Müzik Adı: $muzikAdi")
        println("Video Süresi: $videoSuresi")
        println("Ürün Puanı: $urunPuani")
        println("Resim Adı: $resimAdi")
        println("Dosya Formatı: $dosyaFormati")
        println("Renk: $renk")
        println("Renk Kodu: $renkKodu")
        println("Telefon Modeli: $telefonModeli")
        println("Ekran Boyutu: $ekranBoyutu")
        println("Ağırlık: $agirlik")
        println("Ulusal Gün: $ulusalGun")
        println("Tatil Günü: $tatilGunu")
        println("Rezervasyon Tarihi: $rezervasyonTarihi")
        println("Sokak Adı: $sokakAdi")
        println("Otobüs Hattı: $otobusHatti")
        println("Kalan Dakika: $kalanDakika")
        println("Takip Kodu: $takipKodu")
        println("Kupon Süresi: $kuponSuresi")
        println("Kupon Kodu: $kuponKodu")
        println("Fatura Adresi: $faturaAdresi")

        // Ödev 2: Hesaplamaları yapıp sonuçları yazdırma
        println("\n=== Ödev 2: Hesaplamalar ===")

        // Soru 1: İç açıları toplamı (örneğin, kenar sayısı 5 olan bir şekil için)
        val sides = 5
        val interiorAngles = calculateInteriorAngles(sides)
        println("Soru 1: $sides kenarlı bir şeklin iç açıları toplamı: $interiorAngles derece")

        // Soru 2: Maaş hesaplama (örneğin, 22 gün çalışan biri için)
        val workingDays = 22
        val salary = calculateSalary(workingDays)
        println("Soru 2: $workingDays gün çalışan birinin maaşı: $salary TL")

        // Soru 3: Kota ücreti hesaplama (örneğin, 75 GB kullanım için)
        val dataUsage = 75
        val fee = calculateQuotaFee(dataUsage)
        println("Soru 3: $dataUsage GB kullanım için ücret: $fee TL")

        // Soru 4: Kelime harf sayısını hesaplama (örneğin, "Merhaba" kelimesi için)
        val word = "Merhaba"
        val letterCount = countLetters(word)
        println("Soru 4: \"$word\" kelimesinde $letterCount harf var")
    }
}