package enkapsul;
public class Kapal {
    private String jeniskapal;
    private String namakapal;
    private String tahunrilis;
    private String namapemilik;
    private String nokapal;

    public String getJeniskapal() {
        return jeniskapal;
    }

    public void setJeniskapal(String jk) {
        jeniskapal = jk;
    }

    public String getNamakapal() {
        return namakapal;
    }

    public void setNamakapal(String nk) {
        namakapal = nk;
    }

    public String getTahunRilis() {
        return tahunrilis;
    }

    public void setTahunRilis(String tr) {
        tahunrilis = tr;
    }

    public String getNamapemilik() {
        return namapemilik;
    }

    public void setNamapemilik(String np) {
        namapemilik = np;
    }

    public String getNokapal() {
        return nokapal;
    }

    public void setNokapal(String nk) {
        nokapal = nk;
    }
    public void infoKapal (){
        System.out.println("Nama Kapal = " + getNamakapal());
        System.out.println("Jenis Kapal = " + getJeniskapal());
        System.out.println("Tahun Rilis = " + getTahunRilis());
        System.out.println("Nomor Kapal = " + getNokapal());
        System.out.println("Nama Pemilik = " + getNamapemilik());
    }
}
