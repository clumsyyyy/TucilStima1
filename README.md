# Penyelesaian Word Search Puzzle dengan Algoritma Brute Force

> Program penyelesaian _word search puzzle_ menggunakan bahasa pemrograman _Java_ dan algoritma _brute force_
> sebagai Tugas Kecil 1 Mata Kuliah IF2211Strategi Algoritma

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
2. Ekstraksi folder ini ke _local_

## Penggunaan

1. Pastikan sedang berada di folder `root`
2. Apabila ingin menambahkan _test case_, tambahkan di folder `test`
3. Jalankan `run.bat`. _Batch file_ akan mengkompilasi file `.class` di folder `src` dan mengalokasikan _executables_ ke folder `bin`
4. Setelah program terbuka, masukkan nama file **tanpa ekstensi .txt** (mis. nama file: `case.txt`, input: `case`)
5. Program akan melakukan pengecekan, dan memberikan output berupa _puzzle_ dan informasi eksekusi :D

##Identitas
NIM: 13520124
Nama: Owen Christian Wijaya
