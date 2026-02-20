package Jobsheet2;

public class DosenMain07 {
    public static void main(String[] args) {
        Dosen07 ds1 = new Dosen07();

        ds1.idDosen = "2435687900";
        ds1.nama = "Budi Septian";
        ds1.statusAktif = false;
        ds1.tahunBergabung = 2021;
        ds1.bidangKeahlian = "Matematika";

        ds1.tampilkanInformasi();
        ds1.setStatusAktif(true);
        ds1.ubahKeahlian("Matematika Lanjutan");
        ds1.tampilkanInformasi();

        Dosen07 ds2 = new Dosen07("5647382910", "Arkan Farasabiyan", true, 2022, "Jaringan");

        ds2.ubahKeahlian("Telekomunikasi");
        ds2.tampilkanInformasi();

    }
}
