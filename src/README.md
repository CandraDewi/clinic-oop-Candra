# Deskripsi
Klinik manajemen sistem ini dirancang untuk mengelola data dokter, pasien, dan janji temu dengan cara yang terstruktur. Sistem menerapkan prinsip Enkapsulasi melalui penggunaan private fields serta metode getter and setter untuk menjaga keamanan data. Selain itu, sistem ini juga menggunakan Packages (seperti `unguided2.entities`) serta memanfaatkan Relasi Kelas, di mana kelas `Appointment` berfungsi sebagai penghubung antara `Doctor` dan `Patient`. Fitur tambahan seperti `DataChecker` dan `DiagnosisCounter` turut diimplementasikan untuk memastikan keakuratan serta keteraturan data dalam sistem.
# Project Structure
```
| src/
│   └── Guided
│   └── Unguided         
│       └── entities/     
│           ├── Appointment.java
│           ├── DataChecker.java
|           ├── DiagnosisCounter.java
|           ├── Doctor.java
│           └── Patient.java
|        └── Main.java
└── README.md
```
# Project Detail
### Class Pasien
#### Atribut:
- id (String) → ID unik pasien.
- name (String) → Nama pasien.
- age (int) → Usia pasien.
#### Method:
- Inisialisasi pasien dengan `Konstruktor`.
- Akses data pasien dengan `Getter and Setter`.

### Class Dokter
#### Atribut:
- id (String) → ID unik dokter.
- name (String) → Nama dokter.
- specialty (String) → Spesialisasi dokter.
- appointments (List) → Daftar janji temu dokter.
#### Method:
- Inisialisasi dokter dengan `Konstruktor`.
- Akses data dokter dengan `Getter and Setter`.
- addAppointment(Appointment appointment) → Menambahkan jadwal janji dengan dokter

### Class Appointment 
#### Atribut:
- doctor (Doctor) → Dokter yang menangani.
- patient (Patient) → Pasien yang membuat janji.
- date (LocalDate) → Tanggal janji temu.
- diagnosis (String) → Diagnosis yang diberikan.
#### Method:
- Inisialisasi janji temu dengan `Konstruktor`.
- Akses data janji temu dengan `Getter and Setter`.

### Class DataChecker 
#### Method:
- isValidName(String name) → Validasi nama hanya berisi huruf dan spasi.
- isValidAge(int age) → Validasi usia pasien  (antara 0-120).

### Class DiagnosisCounter 
#### Atribut:
- totalDiagnoses (static int) → Menyimpan jumlah total diagnosis.
#### Method:
- addDiagnosis() → Menambahkan jumlah diagnosis.
- getTotalDiagnoses() → Mengembalikan jumlah total diagnosis.

### Class Main (Point Program)
#### Fungsi:
- Create objek dokter dan pasien.
- Validasi data pasien menggunakan `DataChecker`.
- Membuat janji temu menggunakan `Appointment`.
- Menampilkan informasi `dokter`, `pasien`, dan `janji temu`.
- Menghitung total diagnosis yang diberikan menggunakan `DiagnosisCounter`.

# Output
![image](https://github.com/user-attachments/assets/355f5bf4-3775-45e7-92c4-854f7048cbcb)

# Kesimpulan
Proyek Clinic Management System membantu memahami konsep `Encapsulation`, `Packages`, dan `Class Relationships` dalam OOP, sehingga dapat membangun sistem yang aman, terstruktur, dan mudah dikembangkan. Encapsulation diterapkan dengan menjadikan atribut dalam kelas dan bersifat private, dengan tujuan memastikan bahwa data tetap terlindungi serta hanya dapat diakses melalui metode `getter and setter`, yang menjaga validitas serta keamanannya. Sementara itu, penggunaan `Packages` memungkinkan pengelompokan kode secara sistematis. Dalam hal `Class Relationships`, hubungan antarobjek dalam sistem diwujudkan melalui kelas `Appointment` yang berperan sebagai penghubung antara `Doctor` dan `Patient`, mencerminkan penerapan konsep Association dan Aggregation.
