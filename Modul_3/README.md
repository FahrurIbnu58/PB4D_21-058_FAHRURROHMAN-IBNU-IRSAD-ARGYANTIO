# PB4D_21-058_FAHRURROHMAN-IBNU-IRSAD-ARGYANTIO
upload project praktikum

Deklarasi kelas MainActivity yang meng-extend kelas AppCompatActivity.
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    
Method onCreate() merupakan method yang dipanggil ketika Activity dibuat. Pada kode ini, method onCreate() memanggil method onCreate() pada kelas AppCompatActivity dengan menggunakan super.onCreate(savedInstanceState). Kemudian, method setContentView(R.layout.activity_main) digunakan untuk menetapkan layout activity_main.xml sebagai tampilan untuk Activity.

val btn1 = findViewById<Button>(R.id.tombolpindah)
btn1.setOnClickListener(View.OnClickListener {
    val intent = Intent(this,ProfileActivity::class.java)
    startActivity(intent)
})

  Kode ini mendapatkan referensi ke button dengan ID tombolpindah dengan menggunakan findViewById<Button>(R.id.tombolpindah), lalu membuat event listener ketika button di-klik dengan memanggil setOnClickListener() dan membuat Intent baru untuk menavigasi ke activity ProfileActivity ketika button di-klik. Lalu, startActivity() digunakan untuk memulai activity.
  
  val btn2 = findViewById<Button>(R.id.tombolpindahbrowser)
btn2.setOnClickListener(View.OnClickListener {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(
        "https://instagram.com/ibn_27?igshid=ZDdkNTZiNTM="))
    startActivity(intent)
})

  Kode ini mirip dengan kode di atas, namun kali ini button dengan ID tombolpindahbrowser diambil referensinya dan membuat event listener ketika button di-klik. Lalu, membuat Intent dengan menggunakan ACTION_VIEW sebagai aksi dan Uri.parse() sebagai data Uri, lalu memulai aktivitas dengan startActivity(). Tujuannya adalah untuk membuka aplikasi browser dan membuka halaman Instagram yang telah ditentukan.

Dengan demikian, kode tersebut berfungsi untuk membuat aplikasi Android sederhana yang terdiri dari dua button yang dapat digunakan untuk menavigasi ke activity lain dan membuka halaman web.
