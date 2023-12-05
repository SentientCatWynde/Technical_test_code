import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in); int opsi; 
        String value = "";
        // Asumsi input nya angka, atau huruf, nanti print nya ga beda
        System.out.println("Input Angka: "); String data = val.nextLine(); //System.out.println(data);
        char arr[] = data.toCharArray();
        menu(); opsi = val.nextInt();
        

        switch (opsi) {
            case 1:
                System.out.println("\nGenerating Triangle...");
                for(int i = 0; i< arr.length; i++){
                    data = "";
                    for(int j = 0; j < i + 1; j++){
                        if (data == "") {
                            data = apprendnol(arr[i]);
                        } else data = apprendnol(data);
                        
                    } System.out.println(data);
                }
                break;
            case 2:
                System.out.println("\nGenerating Odd Numbers...");
                
                for(int i = 0; i < arr.length; i++){
                    switch (arr[i]) { // Cek angka ganjil dalam data yg diberikan.
                        case '1':
                        case '3':
                        case '5':
                        case '7':
                        case '9':
                            value = value + arr[i];
                        default:
                            break;
                    }
                } System.out.println(value);
                break;
            case 3:
                System.out.println("\nGenerating Prime Numbers...");
                for(int i = 0; i < arr.length; i++){
                    switch (arr[i]) { // Cek angka ganjil dalam data yg diberikan.
                        case '2':
                        case '3':
                        case '5':
                        case '7':
                            value = value + arr[i];
                        default:
                            break;
                    }
                } System.out.println(value);
                break;
            default:
                System.out.println("Closing app");
                break;
        }

        val.close();
    }

    public static void menu (){
        System.out.println("1. Generate Segitiga");
        System.out.println("2. Generate Bilangan Ganjil");
        System.out.println("3. Generate Bilangan Prima");
        System.out.println("Pilihan menu: ");
    }

    // Untuk membuat triangle, meminta append angka 0 sesuai modifier lokasi i
    public static String apprendnol(char data){
        String value;
        value = data + "0";
        return value; 
    }

    public static String apprendnol(String data){
        return data + "0"; 
    }
}
