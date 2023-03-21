import java.util.ArrayList;


public class Test {

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan : ");
        System.out.println(hewan);

        hewan.remove("Kelinci");
        hewan.remove("Kambing");
        hewan.remove("Unta");

        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");

        System.out.println("\nHewan yang akan dihapus : ");
        System.out.println(deleteHewan);

        System.out.println("\nOutput Hewan Setelah dihapus : ");
        System.out.println(hewan);
    }
}