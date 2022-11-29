package enkapsul;
public class PrinzEugen {
    public static void main(String[] args) {
        Kapal akses = new Kapal();
        akses.setNamakapal("Prinz Eugen");
        akses.setJeniskapal("Kapal Perang");
        akses.setNamapemilik("Rahmat");
        akses.setNokapal("IX-300");
        akses.setTahunRilis("1936");
        akses.infoKapal();
    }
}
