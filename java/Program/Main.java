import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, i;
        // input banyaknya data
        do{
            n = sc.nextInt();

            if(n < 3){
                System.out.println("Number must be greater than or equal to 3");
            }
        }while(n < 3);

        // input data sebanyak n
        Shirt[] arr = new Shirt[n];
        for(i = 0; i < n; i++){
            // variabel penampung sementara
            String idProduct, name, brand, size, material, color, sleeveType;
            int price;
            char gender;

            // input
            idProduct = sc.next();
            name = sc.next();
            brand = sc.next();
            price = sc.nextInt();
            size = sc.next();
            material = sc.next();
            gender = sc.next().charAt(0);
            color = sc.next();
            sleeveType = sc.next();

            // masukkan inputan ke array
            arr[i] = new Shirt();
            arr[i].setIdProduct(idProduct);
            arr[i].setName(name);
            arr[i].setBrand(brand);
            arr[i].setPrice(price);
            arr[i].setSize(size);
            arr[i].setMaterial(material);
            arr[i].setGender(gender);
            arr[i].setColor(color);
            arr[i].setSleeveType(sleeveType);
        }

        // cari jumlah karakter terpanjang untuk setiap kolom
        int[] spaces = new int[]{2, 4, 5, 5, 4, 8, 6, 5, 11};
        for(Shirt item : arr){
            spaces[0] = Math.max(item.getIdProduct().length(), spaces[0]);
            spaces[1] = Math.max(item.getName().length(), spaces[1]);
            spaces[2] = Math.max(item.getBrand().length(), spaces[2]);
            spaces[3] = Math.max(Integer.toString(item.getPrice()).length()+2, spaces[3]);
            spaces[4] = Math.max(item.getSize().length(), spaces[4]);
            spaces[5] = Math.max(item.getMaterial().length(), spaces[5]);
            spaces[7] = Math.max(item.getColor().length(), spaces[7]);
            spaces[8] = Math.max(item.getSleeveType().length(), spaces[8]);
        }

        // buat frame dan header
        int total = 0;
        for(i = 0; i < 9; i++){
            total += spaces[i];
        }
        total += 17;

        Tabel tb = new Tabel(total);
        
        tb.printFrame();

        System.out.print("|ID ");
        tb.printSpaces(spaces[0]-2);

        System.out.print("|NAME ");
        tb.printSpaces(spaces[1]-4);

        System.out.print("|BRAND ");
        tb.printSpaces(spaces[2]-5);

        System.out.print("|PRICE ");
        tb.printSpaces(spaces[3]-5);

        System.out.print("|SIZE ");
        tb.printSpaces(spaces[4]-4);

        System.out.print("|MATERIAL ");
        tb.printSpaces(spaces[5]-8);

        System.out.print("|GENDER ");

        System.out.print("|COLOR ");
        tb.printSpaces(spaces[7]-5);

        System.out.print("|SLEEVE TYPE ");
        tb.printSpaces(spaces[8]-11);
        
        System.out.println("|");

        tb.printFrame();
        
        // print isi list
        for(Shirt item : arr) {
            System.out.print("|" + item.getIdProduct() + " ");
            tb.printSpaces(spaces[0]-item.getIdProduct().length());

            System.out.print("|" + item.getName() + " ");
            tb.printSpaces(spaces[1]-item.getName().length());

            System.out.print("|" + item.getBrand() + " ");
            tb.printSpaces(spaces[2]-item.getBrand().length());

            System.out.print("|Rp" + item.getPrice() + " ");
            tb.printSpaces(spaces[3]-(Integer.toString(item.getPrice()).length()+2));

            System.out.print("|" + item.getSize() + " ");
            tb.printSpaces(spaces[4]-item.getSize().length());

            System.out.print("|" + item.getMaterial() + " ");
            tb.printSpaces(spaces[5]-item.getMaterial().length());

            System.out.print("|" + item.getGender() + " ");
            tb.printSpaces(spaces[6]-1);

            System.out.print("|" + item.getColor() + " ");
            tb.printSpaces(spaces[7]-item.getColor().length());

            System.out.print("|" + item.getSleeveType() + " ");
            tb.printSpaces(spaces[8]-item.getSleeveType().length());

            System.out.println("|");
        }
        
        tb.printFrame();

        sc.close();
    }
}

/*

3
1232 TEESHIRT ZARA 230000000 M COTTON M BLUE LONG
1234 UWU HNM 123434 S POLYESTER F PINK SHORT
4321 SHIRTY UNIQLO 123123 XL FLEECE M BLACK LONG

5
1232 TEESHIRT ZARA 230000000 M COTTON M BLUE LONG
1234 UWU HNM 123434 S POLYESTER F PINK SHORT
4321 SHIRTY UNIQLO 123123 XL FLEECE M BLACK LONG
1111 BATIK KUDALUMPING 200000 XXXL COTTON M RED SHORT
2222 KEBAYA KUDAKUDA 10000 L POLYESTER F GREEN LONG

*/