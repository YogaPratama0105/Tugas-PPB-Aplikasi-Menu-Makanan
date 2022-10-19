package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private ArrayList<Integer> hargaMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, hargaMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        namaMakanan.add("Mie Gacoan");
        fotoMakanan.add("https://blog.trawlbens.id/wp-content/uploads/2021/11/Mie-Gacoan.jpg");
        infoMakanan.add("Nama Mie Gacoan diambil dari kata Gaco yang artinya jagoan / andalan dalam bahasa jawa. Tidak heran jika Mie Gacoan menjadi tempat bersantap favorit bagi masyarakat indonesia, khususnya mahasiswa, pelajar dan keluarga. Dengan mengusung suasana restoran yang atraktif, keren dan lega, dan juga dilengkapi berbagai fasilitas membuat setiap pengunjung makin betah dan selalu ingin kembali lagi. Selain itu menu makanan yang ada di Gacoan beraneka macam menunya dan juga harganya terjangkau.");
        hargaMakanan.add(10000);

        namaMakanan.add("Nasi Goreng");
        fotoMakanan.add("https://i0.wp.com/resepkoki.id/wp-content/uploads/2016/09/Resep-Nasi-Goreng-Ikan-Teri.jpg?fit=1920%2C1440&ssl=1");
        infoMakanan.add("Nasi goreng adalah makanan yang sudah tidak asing bagi kita, karena terkadang kita sering membuatnya dirumah. Nasi goreng dibuat dengan menggunakan nasi sebagai bahan utamanya, yang kemudian ditumis dengan bumbu-bumbu seperti garam, bawang putih, bawang merah, merica, kecap manis, dan terkadang diberi telur, sayur-sayuran dan daging sebagai bahan tambahan. Selain bisa dibuat sendiri dirumah, nasi goreng juga banyak dijual diwarung pinggir jalan. Rasanya juga enak dan harganya juga terjangkau.");
        hargaMakanan.add(15000);

        namaMakanan.add("Ayam Geprek");
        fotoMakanan.add("https://i0.wp.com/i.gojekapi.com/darkroom/gofood-indonesia/v2/images/uploads/c2551d72-4936-46de-89d3-bc0c5593ed17_Go-Biz_20220104_004050.jpeg");
        infoMakanan.add("Ayam geprek adalah makanan yang bahan utamanya adalah ayam yang diberi tepung dan kemudian digoreng. Setelah digoreng ayam tersebut diulek dan diberi sambal yang pedas. Ayam geprek banyak disukai oleh semua kalangan masyarakat, baik mahasiswa, pelajar maupun bapak-bapak karena harganya yang murah dan rasanya enak.");
        hargaMakanan.add(8000);

        namaMakanan.add("Mie Ayam");
        fotoMakanan.add("https://www.piknikdong.com/wp-content/uploads/2021/10/resep-mie-ayam-jawa-min.jpg");
        infoMakanan.add("Mie Ayam adalah hidangan khas Indonesia yang terbuat dari mie gandum yang dibumbui dengan daging ayam yang biasanya dipotong dadu. Mie ayam sering dijual sebagai hidangan jalanan oleh pedagang kaki lima dengan gerobak keliling sederhana, yang biasanya berkeliling di jalan-jalan sekitar perumahan warga. Mie ayam juga merupakan hidangan populer yang disajikan di warung makan kecil pinggir jalan, hingga rumah makan besar.");
        hargaMakanan.add(10000);

        namaMakanan.add("Nasi Gandul");
        fotoMakanan.add("https://cdn0-production-images-kly.akamaized.net/MbvyVl_W0JU0KlId5HOiYmEp37s=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2751403/original/056422200_1552562680-KMJ_1.jpg");
        infoMakanan.add("Nasi gandul adalah masakan khas yang berasal dari daerah Pati, Jawa Tengah, Indonesia yang sepintas mirip dengan Semur Daging dan Gulai. Nasi gandul sepintas mirip dengan perpaduan soto dan gule, berupa daging yang dengan kuah yang berwarna kecoklatan dengan rasa gurih manis. Nasi Gandul sendiri adalah nasi putih dengan irisan empal atau daging sapi bacem yang terkadang ditambah jeroan. Lalu nasi tersebut disiram dengan kuah rempah yang memiliki rasa manis, asin dan gurih.");
        hargaMakanan.add(20000);

        namaMakanan.add("Sate Ayam");
        fotoMakanan.add("https://paxelmarket.co/wp-content/uploads/2021/11/sate-ayam-retouch-Copy.jpg");
        infoMakanan.add("Sate ayam adalah makanan khas Indonesia. Sate Ayam dibuat dari daging ayam. Pada umumnya sate ayam dimasak dengan cara dipanggang dengan menggunakan arang dan disajikan dengan pilihan bumbu kacang atau bumbu kecap. Sate ini biasanya disajikan bersama dengan lontong atau nasi.");
        hargaMakanan.add(15000);

        namaMakanan.add("Nasi Padang");
        fotoMakanan.add("https://asset.kompas.com/crops/hec2qAt9Nr88SdD57foLyQWTt94=/0x37:800x570/750x500/data/photo/2022/05/05/62734741ced4b.jpg");
        infoMakanan.add("Nasi padang adalah nasi putih yang disajikan dengan berbagai macam lauk-pauk khas Indonesia. Kata padang merujuk pada ibu kota provinsi Sumatra Barat: Padang. Nasi padang adalah sebuah hidangan yang disajikan secara lengkap secara prasmanan dengan daging, ikan, sayuran, dan makanan pedas dimakan dengan nasi putih.");
        hargaMakanan.add(10000);

        namaMakanan.add("Ayam Bakar");
        fotoMakanan.add("https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-panggang-bumbu-spesial.jpg");
        infoMakanan.add("Ayam bakar adalah daging ayam yang dimasak sebagai hidangan dengan cara dipanggang atau dibakar. Umumnya ayam disangrai dengan memanfaatkan lemak dan sarinya sendiri dengan cara memutar daging selama pemanggangan. Karena itu ayam bakar biasanya dimasak dengan api atau panas dengan beberapa jenis panggangan putar agar peredaran lemak dan sari ini seefisien mungkin. Ayam bakar adalah hidangan yang enak apalagi jika diberi sambal dan juga nasi.");
        hargaMakanan.add(20000);

        namaMakanan.add("Soto Kemiri");
        fotoMakanan.add("https://asset.kompas.com/crops/SCWnomlw812y8DCiqV1e6abhFb8=/3x0:700x465/750x500/data/photo/2021/04/01/6065d37eb9abb.jpg");
        infoMakanan.add("Soto kemiri merupakan makanan khas dari Pati, Jawa Tengah. Soto kemiri ini termasuk dalam hidangan berkuah. Kuah yang digunakannya itu adalah kuah santan. Bahan utama yang digunakan untuk membuat soto kemiri ialah daging ayam dan santan. Selanjutnya, bahan-bahan utama tersebut diolah bersama dengan aneka bumbu. Setelah matang, soto kemiri disajikan bersama dengan bahan pelengkap yang telah disediakan termasuk nasi.");
        hargaMakanan.add(10000);

        namaMakanan.add("Bakso Mercon");
        fotoMakanan.add("https://cdn0-production-images-kly.akamaized.net/Mv5n4NetvNTa4FumsYjCG1p-IYM=/0x65:999x628/1200x675/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/3317156/original/045858400_1607314557-shutterstock_1816014629.jpg");
        infoMakanan.add("Bakso mercon adalah campuran daging sapi yang digiling dengan bumbu termasuk cabai rawit merah, yang membuat rasanya pedas dan juga nikmat.");
        hargaMakanan.add(12000);

        prosesRecyclerViewAdapter();
    }
}