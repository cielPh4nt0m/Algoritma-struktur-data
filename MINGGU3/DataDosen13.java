package MINGGU3;

public class DataDosen13 {
    public void dataSemuaDosen(Dosen13[] arrayOfDosen13) {
        //a. Menampilkan semua data dosen menggunakan loop for
        System.out.println("Data Semua Dosen");
        for (int i = 0; i < arrayOfDosen13.length; i++) {
            System.out.println("Data Dosen  ke-" + (i +1));
            System.out.println("Kode              : "+ arrayOfDosen13[i].kode);
            System.out.println("Nama              : "+ arrayOfDosen13[i].nama);
            System.out.println("Jenis Kelamin     : "+ arrayOfDosen13[i].jenisKelamin);
            System.out.println("Usia            : "+ arrayOfDosen13[i].usia);
            System.out.println("-----------------------------------------");
            
        }
    }

    //b. Menampilkan jumlah dosen berdasrakan jenis kelamin
    public void jumlahDosenBerdasarkanJenisKelamin(Dosen13[] arrayOfDosen13) {
        int jumlahPria = 0;
        int jumlahWanita = 0;
        for (int i = 0; i < arrayOfDosen13.length; i++) {
            if (arrayOfDosen13[i].jenisKelamin) {
                jumlahWanita++;
            } else {
                jumlahPria++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + jumlahPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahWanita);
    }

    //c. Menampilkan rata-rata usia dosen per jenis kelaimin
    public void rerataUsiaDosenPerJenisKelamin(Dosen13[] arrayOfDosen13) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen13 dosen : arrayOfDosen13) {
            if (dosen.jenisKelamin) {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            } else {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            }
        }
        if (jumlahPria > 0) {
            System.out.println("Rata-rata Usia Dosen Pria  : " + (totalUsiaPria / jumlahPria));
        }
        if (jumlahWanita > 0) {
            System.out.println("Rata-rata Usia Dosen Wanita : " + (totalUsiaWanita / jumlahWanita));
        }
    }

    //d. info dosen paling tua
    public static void infoDosenPalingTua(Dosen13[] arrayOfDosen13) {
        Dosen13 tertua = arrayOfDosen13[0];

        for (Dosen13 dosen : arrayOfDosen13) {
            if ( dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua");
        System.out.println("Kode   : " + tertua.kode);
        System.out.println("Nama   " + tertua.kode);
        System.out.println("Usia  : " + tertua.usia);
    }

    //e. info dosen paling muda
    public static void infoDosenPalingMuda(Dosen13[] arrayOfDosen13) {
        Dosen13 termuda = arrayOfDosen13[0];

        for (Dosen13 dosen : arrayOfDosen13) {
            if (dosen.usia > termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen paling Muda");
        System.out.println("Kode   : " + termuda.kode);
        System.out.println("Nama   : " + termuda.nama);
        System.out.println("Usia   : " + termuda.usia);
    }
}
