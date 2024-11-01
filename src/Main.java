/**
 * Mewakili seorang siswa dengan nama, usia, dan ID siswa.
 * Kelas ini menunjukkan enkapsulasi melalui field privat dan metode getter/setter publik.
 */
class Student {
    private String name;
    private int age;
    private String studentId;

    /**
     * Membangun objek Student baru dengan nama, usia, dan ID siswa yang ditentukan.
     *
     * @param name      nama siswa
     * @param age       usia siswa
     * @param studentId ID siswa
     */
    public Student(String name, int age, String studentId) {
        setName(name);
        setAge(age);
        setStudentId(studentId);
    }

    /**
     * Mengembalikan nama siswa.
     *
     * @return nama siswa
     */
    public String getName() {
        return name;
    }

    /**
     * Mengatur nama siswa.
     *
     * @param name nama baru siswa
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Mengembalikan usia siswa.
     *
     * @return usia siswa
     */
    public int getAge() {
        return age;
    }

    /**
     * Mengatur usia siswa.
     *
     * @param age usia baru siswa
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Mengembalikan ID siswa.
     *
     * @return ID siswa
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * Mengatur ID siswa.
     *
     * @param studentId ID siswa baru
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }


    /**
     * Mengembalikan representasi string dari detail siswa.
     *
     * @return string yang berisi nama, usia, dan ID siswa
     */
    private String getStudentDetails() {
        return "Nama Siswa: " + name + "\nUsia: " + age + "\nID Siswa: " + studentId;
    }

    /**
     * Menampilkan informasi siswa ke konsol.
     */
    public void displayStudentInfo() {
        System.out.println(getStudentDetails());
    }

    /**
     * Metode utama untuk menjalankan contoh pembuatan objek Student
     * dan menampilkan informasinya.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Student student = new Student("Alice", 21, "S12345");
        student.displayStudentInfo();
    }
}
