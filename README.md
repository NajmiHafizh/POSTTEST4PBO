# Najmi Hafizh Mauludan Zain - 2409116028 - A'24

## >> Deskripsi sistem Manajemen Kantor Pos <<

Manajemen Kantor Pos merupakan program Java yang dibuat untuk membantu mengelola data paket di kantor pos. Dengan program ini, pengguna dapat melihat, menambah, memperbarui, dan menghapus,mencari data paket sehingga pengelolaan informasi menjadi lebih terstruktur, efisien, dan informatif.

Selain itu, program ini juga dilengkapi dengan fitur pencarian paket berdasarkan nomor resi dan nama penerima, sehingga memudahkan pengguna dalam menemukan data secara cepat.

Program ini juga dilengkapi dengan menerapkan abstraction serta menerapkan polymorphism dan juga menggunakan kombinasi abstract class dan interface secara bersamaan dalam program.

## >> Penjelasan alur program <<

Saat memulai program pengguna akan di berikan pilihan menu, di menu tersebut terdapat 1 - 6 pilihan yang dapat di pilih oleh pengguna. yaitu Tambah Data Paket, Tampilkan Data Paket, Update Data Paket, Hapus Data Paket, Cari Data Paket, dan Keluar.

<img width="460" height="188" alt="image" src="https://github.com/user-attachments/assets/88ba69be-af4e-4df3-9c50-30dab0b13f2d" />


## ------------------------------------------------------------------------------------

- Sebelum melakukan progres menambah data paket, pengguna dapat melihat data paket yang telah ada dengan memilih angka "2" pada menu pilihan.

<img width="1820" height="289" alt="image" src="https://github.com/user-attachments/assets/434331e0-e092-43e7-a834-2bd9a0105c3a" />


## ------------------------------------------------------------------------------------

- Lalu Jika pengguna memilih angka "1" maka pengguna akan masuk ke pilihan tambah data paket yang dimana pengguna bisa melakukan progres untuk menambah sebuah data paket, lalu bisa memilih mau paket reguler atau paket kilat.

<img width="674" height="409" alt="image" src="https://github.com/user-attachments/assets/e32bc127-4b06-404b-9ab8-13e592d35984" />

<img width="658" height="406" alt="image" src="https://github.com/user-attachments/assets/35186848-b7c5-4fbe-a61e-e492b4eced6e" />


## ------------------------------------------------------------------------------------

- Lalu jika pengguna memilih angka "2" lagi maka pengguna dapat melihat semua data paket yang telah di tambahkan pada menu sebelumnya.

<img width="1832" height="168" alt="image" src="https://github.com/user-attachments/assets/d084f2c2-245a-4c03-85c1-f41a502a453f" />


## ------------------------------------------------------------------------------------

- Setelah itu jika pengguna memilih angka "3" maka pengguna akan masuk ke pilihan update data paket, yang dimana pengguna dapat melakukan perubahan data jika terdapat kesalahan pada data yang telah di tambahkan sebelumnya. pengguna dapat memilih bagian mana saja yang mau di update dari nomor 1 sampai 11. pastikan data yang diubah telah sesuai dengan yang diinginkan jika pengguna merasa sudah selesai dengan apa yang ingin dirubah maka dapat memilih angka "12" untuk kembali ke pilihan menu.

<img width="1821" height="910" alt="image" src="https://github.com/user-attachments/assets/e6579446-0ec3-4be8-9afc-19f6bb658f0b" />


- setelah itu pengguna dapat memilih angka "2" untuk melihat perubahan yang di lakukan setelah melakukan update pada sebuah data paket.

<img width="1836" height="323" alt="image" src="https://github.com/user-attachments/assets/f60d54a7-6d58-4e4f-8f55-48fd17bf2e24" />


## ------------------------------------------------------------------------------------

- Setelah itu jika pengguna memilih angka "5" maka pengguna akan masuk ke pilihan cari data paket, yang dimana pengguna dapat melakukan pencarian data paket dengan memasukkkan no paket yang akan di cari. Dapat dilihat juga paket mana yang masuk ke paket reguler dan paket kilat.

- Melakukan pencarian menggunakan nomor resi
<img width="468" height="521" alt="image" src="https://github.com/user-attachments/assets/2a048db2-d25d-4a8e-8ae7-cc2ef7ccfb9d" />

- Melakukan pencarian menggunakan nama penerima
<img width="425" height="514" alt="image" src="https://github.com/user-attachments/assets/65c469d3-b581-488d-8f51-691d62411dd5" />


## ------------------------------------------------------------------------------------

- Lanjut, jika pengguna memilih angka "4" pengguna dapat menghapus data paket yang tidak diinginkan

<img width="1833" height="365" alt="image" src="https://github.com/user-attachments/assets/e4d980fd-011c-485b-a6c6-f9867cd3a308" />


- setelah itu pengguna dapat memilih angka "2" untuk melihat perubahan yang di lakukan setelah menghapus sebuah data paket.
  
<img width="1829" height="312" alt="image" src="https://github.com/user-attachments/assets/9a77ca0c-638d-43e8-9521-a76819b77053" />


## ------------------------------------------------------------------------------------

- Dan yang terakhir jika pengguna memilih angka "6" maka pengguna dapat keluar dari program.

<img width="610" height="288" alt="image" src="https://github.com/user-attachments/assets/25672a15-2240-44d0-8c65-af13b0c51d1c" />


## ------------------------------------------------------------------------------------

## >> Penerapan Abstraction <<
- Pada program ini, abstraction diterapkan melalui penggunaan class Paket yang dibuat sebagai abstract class. Class ini tidak bisa dibuat objek secara langsung, tetapi harus diturunkan ke subclass. Subclass yang dibuat adalah PaketReguler dan PaketKilat. Keduanya memiliki implementasi masing-masing untuk method infoPaket().

- Selain itu, terdapat juga interface Trackable yang diimplementasikan oleh subclass. Dengan begitu, program ini tidak hanya menggunakan abstract class saja, tetapi juga mengombinasikannya dengan interface. Hal ini menjadi contoh penerapan abstraction secara lengkap.

## >> Penerapan Polymorphism <<
Polymorphism dalam program ini ditunjukkan dalam dua bentuk, yaitu:

- Pertama, overriding, yaitu method infoPaket() yang ada di class abstract Paket di-override oleh subclass PaketReguler dan PaketKilat. Dengan overriding ini, setiap jenis paket dapat menampilkan informasi yang berbeda sesuai kebutuhannya.

- Kedua, overloading, yaitu pada fitur pencarian data paket. Program menyediakan dua cara pencarian, yaitu pencarian berdasarkan nomor resi dan pencarian berdasarkan nama penerima. Kedua method ini sama-sama bernama searchPaket, tetapi memiliki parameter yang berbeda.
