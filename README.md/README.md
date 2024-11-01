## Penjelasan 

# Student Class

Kelas `Student` merepresentasikan seorang siswa dengan nama, usia, dan ID siswa. 

## Fitur

- **Enkapsulasi**: Menggunakan field privat dan akses melalui getter/setter.
- **Metode Utama**: `main` - Membuat objek `Student` dan menampilkan informasinya di konsol.
- **Method**:
    - `getName()`, `setName(String name)`: Mengakses dan mengatur nama siswa.
    - `getAge()`, `setAge(int age)`: Mengakses dan mengatur usia siswa.
    - `getStudentId()`, `setStudentId(String studentId)`: Mengakses dan mengatur ID siswa.
    - `displayStudentInfo()`: Menampilkan informasi lengkap siswa di konsol.

## Contoh Penggunaan

```java
public static void main(String[] args) {
    Student student = new Student("Alice", 21, "S12345");
    student.displayStudentInfo();
}
