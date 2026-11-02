# Competitive Programming - DIFERA 2026  

Repositori ini berisi daftar soal dan arsip dari kompetisi **DIFERA Competitive Programming** yang diselenggarakan oleh program studi **D3 Rekayasa Perangkat Lunak Aplikasi, Telkom University (2026)**.

---

## Peraturan Kompetisi
* mengikuti keseluruhan peraturan pada _Guidebook_ DIFERA 2026

---

## Daftar Isi 

| Kode Study Case | Judul Soal | Topik / Estimasi Bahasan |
| :--- | :--- | :--- |
| **SC01** | [Mantra Tidur Cheeta](#1-sc01--mantra-tidurcheeta) | Barisan Aritmatika, Matematika Dasar |
| **SC02** | [Rotasi Matriks Ms. Dira](#2-sc02--rotasi-matriks-ms-dira) | Matriks 2D, Manipulasi Array |
| **SC03** | [Puncak di Tengah Lembah](#3-sc03--puncak-di-tengah-lembah) | Unimodal/Peak Array, Two Pointers / DP |
| **SC04** | [Pesan Rahasia](#4-sc04--pesan-rahasia) | String, Palindrom |
| **SC05** | [Warisan Sang Penjelajah](#5-sc05--warisan-sang-penjelajah) | Subset Sum / Backtracking / DP |
| **SC06** | [Bilangan yang Berkhianat](#6-sc06--bilangan-yang-berkhianat) | Happy Number, Simulasi / Set Cycle |
| **SC07** | [Ruang Waktu yang Bertabrakan](#7-sc07--ruang-waktu-yang-bertabrakan) | Interval Scheduling / Overlap Detection |

---

## Detail Deskripsi Soal

### 1. SC01 – Mantra Tidur Cheeta
Cheeta ingin membuat barisan aritmatika yang dimulai dengan suatu nilai awal \(a\) dan beda antar suku \(b\). Diberikan dua bilangan \(N\) dan \(M\), cetaklah seluruh barisan hingga suku ke-\((N+M)\) beserta nilai dari suku terakhirnya.

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** 
  * Baris 1: `a` dan `b` (suku pertama dan beda barisan).
  * Baris 2: `N` dan `M`.
* **Format Keluaran:**
  * Baris 1: Seluruh suku barisan dari pertama hingga suku ke-\((N+M)\) dipisahkan spasi.
  * Baris 2: Nilai suku ke-\((N+M)\).
* **Batasan:** \(1 \le a, b \le 10^3\), dan \(1 \le N, M \le 50\).

**Contoh Kasus:**
* **Masukan:**
  ```text
  2 2
  3 8
  ```
* **Keluaran:**
  ```text
  2 4 6 8 10 12 14 16 18 20 22
  22
  ```
</details>

---

### 2. SC02 – Rotasi Matriks Ms. Dira
Diberikan sebuah matriks berukuran \(N \times M\). Lakukan rotasi elemen matriks tersebut sebesar 90 derajat searah jarum jam (\(M \times N\)).

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Baris pertama `N` dan `M`. \(N\) baris berikutnya masing-masing berisi \(M\) bilangan bulat elemen matriks.
* **Format Keluaran:** Matriks hasil rotasi berukuran \(M \times N\).
* **Batasan:** \(1 \le N, M \le 100\), dan \(1 \le A_{i,j} \le 100\).

**Contoh Kasus:**
* **Masukan:**
  ```text
  4 3
  34 87 15
  66 71 52
  47 47 48
  45 75 35
  ```
* **Keluaran:**
  ```text
  45 47 66 34
  75 47 71 87
  35 48 52 15
  ```
</details>

---

### 3. SC03 – Puncak di Tengah Lembah
Mencari bagian perjalanan terpanjang (panjang minimal 3 titik) dengan pola ketinggian yang meningkat secara ketat hingga satu titik puncak, lalu menurun secara ketat setelahnya.

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Baris pertama `N` (jumlah titik). Baris kedua berisi \(N\) bilangan bulat \(A_i\) (ketinggian titik).
* **Format Keluaran:** Panjang maksimum pola puncak. Jika tidak ada yang valid, cetak `0`.
* **Batasan:** \(1 \le N \le 10^5\), dan \(1 \le A_i \le 10^9\).

**Contoh Kasus:**
* **Masukan:**
  ```text
  10
  1 3 5 4 2 1 2 4 3 1
  ```
* **Keluaran:**
  ```text
  6
  ```
  *(Penjelasan: Pola `1 3 5 4 2 1` memiliki panjang terpanjang yaitu 6)*
</details>

---

### 4. SC04 – Pesan Rahasia
Menentukan apakah sebuah string \(S\) merupakan sebuah palindrom jika dibaca dari arah sebaliknya. Aturan pemeriksaan membedakan huruf besar dan huruf kecil (*case-sensitive*).

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Satu baris berisi string `S` (hanya alfabet tanpa spasi).
* **Format Keluaran:** Cetak `PALINDROM` atau `BUKAN PALINDROM`.
* **Batasan:** \(1 \le \vert{}S\vert{} \le 1000\).

**Contoh Kasus:**
* **Masukan:** `katak` \(\rightarrow\) **Keluaran:** `PALINDROM`
* **Masukan:** `Katak` \(\rightarrow\) **Keluaran:** `BUKAN PALINDROM` *(karena K != t)*
</details>

---

### 5. SC05 – Warisan Sang Penjelajah
Diberikan sebuah deretan bilangan berjumlah \(N\) dan sebuah angka target \(T\). Tentukan apakah mungkin menyisipkan tanda operasi penjumlahan (`+`) atau pengurangan (`-`) di antara bilangan-bilangan tersebut tanpa mengubah urutannya agar menghasilkan tepat nilai target \(T\).

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Baris pertama berisi `N` dan `T`. Baris kedua berisi \(N\) bilangan bulat \(A_i\).
* **Format Keluaran:** Cetak `MUNGKIN` atau `TIDAK MUNGKIN`.
* **Batasan:** \(1 \le N \le 20\), \(0 \le A_i \le 10^4\), dan \(-10^5 \le T \le 10^5\).

**Contoh Kasus:**
* **Masukan:**
  ```text
  4 2
  1 2 3 4
  ```
* **Keluaran:**
  ```text
  MUNGKIN
  ```
  *(Penjelasan: 1 + 2 + 3 - 4 = 2)*
</details>

---

### 6. SC06 – Bilangan yang Berkhianat
Sebuah bilangan diproses dengan menjumlahkan kuadrat dari setiap digitnya secara berulang. Jika proses akhir mencapai angka `1`, maka bilangan tersebut `SETIA`. Jika masuk ke dalam siklus berulang tanpa pernah mencapai angka 1, bilangan disebut `BERKHIANAT`.

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Satu baris berisi bilangan bulat positif `N`.
* **Format Keluaran:** Cetak `SETIA` atau `BERKHIANAT`.
* **Batasan:** \(1 \le N \le 10^9\).

**Contoh Kasus:**
* **Masukan:** `19` \(\rightarrow\) **Keluaran:** `SETIA`
  *(Penjelasan: 19 -> 1²+9²=82 -> 8²+2²=68 -> 6²+8²=100 -> 1²+0²+0²=1)*
</details>

---

### 7. SC07 – Ruang Waktu yang Bertabrakan
Diberikan jadwal \(N\) buah kegiatan laboratorium beserta waktu mulai (\(S_i\)) dan selesai (\(E_i\)). Cari tahu apakah terdapat konflik jadwal di mana ada dua kegiatan atau lebih yang berlangsung bersamaan (bertabrakan).

<details>
<summary><b>🔍 Tampilkan Spesifikasi Soal (Input/Output)</b></summary>

* **Format Masukan:** Baris pertama berisi bilangan bulat `N`. \(N\) baris berikutnya berisi pasangan `Si` dan `Ei` (dalam satuan menit dari 00.00).
* **Format Keluaran:** Cetak `BERTABRAKAN` atau `AMAN`.
* **Batasan:** \(1 \le N \le 1000\), dan \(0 \le S_i < E_i \le 1440\).

**Contoh Kasus:**
* **Masukan:**
  ```text
  3
  60 120
  120 180
  150 210
  ```
* **Keluaran:**
  ```text
  BERTABRAKAN
  ```
</details>

---
⭐ *Selamat mengerjakan dan maksimalkan logika Anda hingga potensi terbaik! Bonne chance!*
