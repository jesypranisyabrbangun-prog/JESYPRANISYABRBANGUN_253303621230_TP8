# Character Manager — TP3 (Java Visual SIH-6406)

## Deskripsi

Character Manager adalah aplikasi berbasis Java untuk membuat dan mengelola data karakter. Aplikasi ini menerapkan konsep *encapsulation* melalui atribut `private`, getter dan setter, validasi nilai mana, serta method `isAlive()` untuk memeriksa status hidup karakter. Informasi karakter ditampilkan menggunakan method `toString()`.

Aplikasi ini juga menyediakan fitur penambahan karakter, pencarian berdasarkan nama, penghapusan karakter, pencegahan nama karakter duplikat, perhitungan rata-rata level, pencarian berdasarkan tipe, dan pencarian karakter dengan level tertinggi.

## Screenshot Hasil Eksekusi

Berikut adalah screenshot hasil eksekusi program Character Manager melalui Terminal.

![Output Terminal Character Manager](docs/terminal-output.png)

## Struktur Folder Project

```text
CharacterManager/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── unpri/
│                   └── charactermanager/
│                       ├── model/
│                       │   ├── Character.java
│                       │   ├── CharacterType.java
│                       │   └── CharacterManager.java
│                       └── Main.java
├── docs/
│   └── terminal-output.png
└── README.md
```

## Fitur Utama

1. **Menambahkan karakter:** menyimpan karakter baru ke dalam koleksi.
2. **Mencegah duplikasi:** menolak karakter dengan nama yang sudah terdaftar.
3. **Mencari karakter:** menemukan karakter berdasarkan nama.
4. **Menghapus karakter:** menghapus karakter yang terdaftar berdasarkan nama.
5. **Menghitung karakter:** menampilkan jumlah karakter yang tersimpan.
6. **Menghitung rata-rata level:** mengembalikan `0.0` jika daftar kosong.
7. **Mencari berdasarkan tipe:** menampilkan karakter berdasarkan `CharacterType`.
8. **Mencari karakter terkuat:** menggunakan method `findStrongest()` untuk menemukan karakter dengan level tertinggi.
9. **Mengembalikan salinan koleksi:** `getAllCharacters()` menghasilkan salinan daftar agar perubahan pada daftar hasil tidak mengubah struktur daftar internal.

## Bagian C — Fitur Analitik Rancangan Sendiri

### 1. Nama Fitur

`findStrongest()`

### 2. Deskripsi Fitur

Method `findStrongest()` digunakan untuk mencari karakter dengan level tertinggi dalam koleksi Character Manager.

### 3. Cara Kerja

Method memeriksa apakah daftar karakter kosong. Jika kosong, method mengembalikan `null`. Jika terdapat karakter, method membandingkan level setiap karakter dan mengembalikan karakter dengan level tertinggi.

### 4. Rasional Perancangan

Fitur ini dibuat untuk memudahkan pengguna mengetahui karakter dengan level tertinggi secara otomatis tanpa harus membandingkan level setiap karakter secara manual. Fitur ini menambahkan kemampuan analitik yang melengkapi fungsi dasar pengelolaan karakter.

### 5. Penerapan Encapsulation

Method `findStrongest()` tidak mengembalikan objek koleksi internal `ArrayList`. Method hanya mengembalikan objek `Character` yang memiliki level tertinggi. Dengan demikian, struktur daftar karakter tetap dikelola oleh `CharacterManager`.

### 6. Dokumentasi Javadoc
s
Method `findStrongest()` dilengkapi dokumentasi Javadoc yang menjelaskan fungsi method dan nilai yang dikembalikan. Jika daftar karakter kosong, method mengembalikan `null`.

### 7. Kompleksitas

Kompleksitas waktu method `findStrongest()` adalah **O(n)**, dengan `n` sebagai jumlah karakter dalam daftar. Hal ini karena setiap karakter diperiksa paling banyak satu kali.

### 8. Kesimpulan

Fitur `findStrongest()` menambahkan kemampuan analitik untuk mencari karakter dengan level tertinggi. Fitur ini melengkapi pengelolaan karakter serta menerapkan prinsip encapsulation dan dokumentasi menggunakan Javadoc.

### 9. Hasil Pengujian

Pengujian dilakukan melalui `Main.java` dengan memanggil method `findStrongest()`. Program menampilkan nama karakter dengan level tertinggi beserta levelnya. Pengujian daftar kosong juga dilakukan untuk memastikan method mengembalikan `null` ketika tidak ada karakter.

## Identitas Mahasiswa

- **Nama lengkap:** Jesy Pranisyabr Bangun
- **NIM:** 253303621230

## Dokumentasi Bagian D

[Google Docs — Analisis Desain dan Ekosistem Java](https://docs.google.com/document/d/1ZTkId9hr_S5cxrdCIq3WxPFXBGRw4CD4WTnswI29dlI/edit?usp=sharing)

## TP8 — Character Manager Sprint #3

### 1. Implementasi GUI

Aplikasi Character Manager menggunakan `MainWindow` yang mewarisi `JFrame` untuk menampilkan data karakter melalui antarmuka grafis. Data karakter disiapkan oleh `Main.java` menggunakan `CharacterManager`, kemudian dikirim ke `MainWindow` melalui constructor. View menampilkan setiap karakter secara dinamis menggunakan perulangan dan `JLabel`. Statistik rata-rata level ditampilkan di bawah daftar karakter.

### 2. Karakter Baru

- **Bima — WARRIOR, Level 6:** dipilih sebagai karakter petarung dengan level lebih tinggi.
- **Luna — MAGE, Level 2:** ditambahkan untuk menambah variasi karakter penyihir.

### 3. Hasil Pengujian

Sebelum penambahan karakter, aplikasi menampilkan tiga karakter dengan rata-rata level 4.00. Setelah penambahan Bima dan Luna, aplikasi menampilkan lima karakter dengan rata-rata level 4.00. Nilai tersebut benar karena jumlah level seluruh karakter adalah 20, kemudian dibagi dengan 5 karakter.

### 4. Screenshot

**Sebelum perubahan data**

![Screenshot sebelum perubahan](docs/tp8-sebelum.png)

**Sesudah perubahan data**

![Screenshot sesudah perubahan](docs/tp8-sesudah.png)

### 5. Analisis GUI dan MVC
[Google Docs — Analisis Desain dan Ekosistem Java](https://docs.google.com/document/d/1ZTkId9hr_S5cxrdCIq3WxPFXBGRw4CD4WTnswI29dlI/edit?usp=sharing)



## TP10 — AppTheme dan MainWindow v0.4

### 1. Implementasi AppTheme

Pada TP10, aplikasi Character Manager dikembangkan menggunakan
AppTheme untuk mengatur warna, font, dan border tampilan.
Pengaturan tema dipisahkan dari MainWindow agar tampilan
aplikasi lebih terstruktur dan mudah diperbarui.

### 2. Screenshot Sebelum dan Sesudah

**Sebelum perubahan (v0.3)**

![Screenshot Character Manager v0.3](docs/screenshot-v03.png)

**Sesudah perubahan (v0.4)**

![Screenshot Character Manager v0.4](docs/screenshot-v04.png)

### 3. Penerapan Mini-Challenge

Karakter dengan level 5 atau lebih ditampilkan menggunakan
teks berwarna emas dan font tebal. Batas level disimpan
dalam konstanta GOLD_LEVEL_THRESHOLD dengan nilai 5.
Dengan cara ini, perubahan batas level dapat dilakukan
dengan mudah tanpa mengubah banyak bagian kode.

### 4. Pemisahan AppTheme dan Model

Warna disimpan di AppTheme karena warna merupakan bagian
dari tampilan aplikasi. Character sebagai Model hanya
bertanggung jawab menyimpan data karakter seperti nama,
role, level, HP, dan ATK. Dengan pemisahan ini, perubahan
desain tidak mengharuskan perubahan pada class Character.
Selain itu, pemisahan tersebut membuat program lebih
mudah dirawat dan sesuai dengan konsep MVC.

### 5. Dua Properti Tambahan

**a. Tooltip HP dan ATK**

Tooltip digunakan untuk menampilkan informasi nama,
HP, dan ATK ketika pengguna mengarahkan kursor ke kartu
karakter. Fitur ini membantu pengguna melihat informasi
tambahan tanpa memenuhi tampilan utama.

**b. Status Enabled pada Kartu Karakter**

Kartu karakter dengan level 1 diberikan status
setEnabled(false). Properti ini menandai komponen
sebagai nonaktif sehingga dapat digunakan sebagai
dasar pengaturan interaksi pada pengembangan berikutnya.

### 6. Hasil Pengujian

Aplikasi berhasil menampilkan enam karakter dengan
variasi role dan level. Warna kartu mengikuti role
masing-masing karakter. Karakter dengan level 5 atau
lebih memiliki teks berwarna emas dan tebal.
Statistik rata-rata level juga berhasil ditampilkan.

### 7. Analisis Bagian D

Dokumen analisis properti Swing dan konsep MVC:

[Google Docs — Analisis TP10](https://docs.google.com/document/d/1ZTkId9hr_S5cxrdCIq3WxPFXBGRw4CD4WTnswI29dlI/edit?usp=sharing)
