# Penyelesaian Word Search Puzzle dengan Algoritma Brute Force

> Program penyelesaian _word search puzzle_ menggunakan bahasa pemrograman _Java_ dan algoritma _brute force_
> sebagai Tugas Kecil 1 Mata Kuliah IF2211 Strategi Algoritma

## Daftar Isi
- [Deskripsi Singkat](#deskripsi-singkat)
- [Instalasi](#instalasi)
- [Penggunaan](#penggunaan)
- [Identitas](#identitas)

## Deskripsi Singkat

Word search puzzle adalah permainan kata dimana pemain harus menemukan beberapa kata 
tersembunyi dalam kumpulan huruf acak. Kumpulan huruf tersebut biasa diletakkan pada “papan” 
berbentuk segi empat atau dapat disebut juga matriks huruf. Kata-kata pada matriks huruf ini dapat 
ditemukan dalam delapan arah yang mungkin, yaitu, vertikal ke atas, vertikal ke bawah, horizontal 
ke kanan, horizontal ke kiri, diagonal ke kanan atas, diagonal ke kanan bawah, diagonal ke kiri 
atas, dan diagonal ke kiri bawah. 

Program ini dibuat berdasarkan algoritma _brute force_, yang menggunakan pendekatan yang sederhana untuk 
menyelesaikan _word search puzzle_. Program membaca masukan dari file berekstensi `.txt` dengan _puzzle_
dan _keywords_ yang harus didapatkan. Setelah itu, program akan mencoba mencari _keywords_ yang ada dengan
mencocokkan karakter pertama dari _keyword_ dengan tiap karakter di dalam matriks _puzzle_ secara sekuensial
serta menghitung waktu eksekusi dan jumlah perbandingan yang dilakukan. Pewarnaan matriks akan dilakukan apabila
ada _keyword_ yang ditemukan. Di akhir program, matriks berupa _puzzle_ dengan pewarnaan _keywords_ yang ditemukan.

## Instalasi

1. **[RECOMMENDED]** Menggunakan Java(TM) SE Runtime Environment (build 17+35-LTS-2724) (versi 2021-09-14)
2. **[RECOMMENDED]** Menjalankan program di **terminal Visual Studio Code** di OS Windows 10 (Program diuji di Windows 10, namun dapat dijalankan di WSL2 dengan Ubuntu 20.04)
3. Ekstraksi folder ini ke komputer Anda

## Penggunaan

### Melalui Terminal _Visual Studio Code_ / _WSL 2_
**[IMPORTANT]** Untuk menjalankan di WSL 2, pastikan sudah melakukan instalasi Java dengan perintah:
```
sudo apt update
sudo apt-get install openjdk-17-jre-headless
java -version //untuk mengecek versi Java
```

1. Pastikan sedang berada di folder `root`
2. Navigasi ke folder `src` dengan perintah `cd src`
3. Ketikkan perintah berikut: 
```
javac -d ../bin ./*.java
```
Perintah ini akan mengkompilasi file `.class` di folder `src` ke dalam folder `bin`.
4. Navigasi ke folder `bin` dengan perintah:
```
cd ..
cd bin
```
5. Jalankan perintah `java MainProgram` untuk menjalankan program.
### Melalui _Batch File_

[**IMPORTANT**] Metode ini akan melakukan kompilasi secara otomatis, namun untuk dapat melihat pewarnaan _puzzle_, pengguna harus
mengubah nilai variabel di Registry Editor. Untuk melakukannya:
1. Buka Registry Editor (dapat melalui _search bar_ atau _shortcut_ `Win + R` dan mengisikan `regedit`)
2. Navigasikan ke folder `HKEY_CURRENT_USER/CONSOLE`. Klik kanan di area putih, pilih `New > DWORD (32-bit value)`
3. Pada dialog pembuatan, isikan nama variabel dengan `VirtualTerminalLevel`. Setelah dibuat, variabel akan terinisialisasi di layar.
4. Klik `VirtualTerminalLevel` dan pilih opsi `Modify`. Ubah isian _value data_ menjadi 1.

Setelah itu, lakukan langkah-langkah berikut untuk menjalankan program:
1. Pastikan sedang berada di folder `root`
2. Apabila ingin menambahkan _test case_, tambahkan di folder `test`
3. Jalankan `run.bat`. _Batch file_ akan mengkompilasi file `.class` di folder `src` dan mengalokasikan _executables_ ke folder `bin`
4. Setelah program terbuka, masukkan nama file **tanpa ekstensi .txt** (mis. nama file: `case.txt`, input: `case`)
5. Program akan melakukan pengecekan, dan memberikan output berupa _puzzle_ dan informasi eksekusi :D

## Identitas
NIM: 13520124
Nama: Owen Christian Wijaya
