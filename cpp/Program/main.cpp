#include <bits/stdc++.h>
#include "Shirt.cpp"
#include "Tabel.cpp"

#define nl '\n'
#define sp ' '

using namespace std;

int main(){
    int n, i;
    do{
        cin >> n;

        if(n < 3){
            cout << "Number must be greater than or equal to 3" << nl;
        }
    }while(n < 3);

    Shirt arr[n];
    for(i = 0; i < n; i++){
        string idProduct, name, brand, size, material, color, sleeveType;
        int price;
        char gender;

        cin >> idProduct >> name >> brand >> price >> size >> material >> gender >> color >> sleeveType;

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

    // Cari jumlah karakter terpanjang untuk setiap kolom
    int spaces[] = {2, 4, 5, 5, 4, 8, 6, 5, 11};
    for (auto item : arr) {
        spaces[0] = max((int)item.getIdProduct().length(), spaces[0]);
        spaces[1] = max((int)item.getName().length(), spaces[1]);
        spaces[2] = max((int)item.getBrand().length(), spaces[2]);
        spaces[3] = max((int)to_string(item.getPrice()).length()+2, spaces[3]);
        spaces[4] = max((int)item.getSize().length(), spaces[4]);
        spaces[5] = max((int)item.getMaterial().length(), spaces[5]);
        spaces[7] = max((int)item.getColor().length(), spaces[7]);
        spaces[8] = max((int)item.getSleeveType().length(), spaces[8]);
    }

    // Buat frame dan header
    int total = 0;
    for (i = 0; i < 9; i++) {
        total += spaces[i];
    }
    total += 17;

    Tabel tb(total);
    tb.printFrame();

    cout << "|ID ";
    tb.printSpaces(spaces[0] - 2);

    cout << "|NAME ";
    tb.printSpaces(spaces[1] - 4);

    cout << "|BRAND ";
    tb.printSpaces(spaces[2] - 5);

    cout << "|PRICE ";
    tb.printSpaces(spaces[3] - 5);

    cout << "|SIZE ";
    tb.printSpaces(spaces[4] - 4);

    cout << "|MATERIAL ";
    tb.printSpaces(spaces[5] - 8);

    cout << "|GENDER ";

    cout << "|COLOR ";
    tb.printSpaces(spaces[7] - 5);

    cout << "|SLEEVE TYPE ";
    tb.printSpaces(spaces[8] - 11);

    cout << "|" << endl;

    tb.printFrame();

    // Print isi list
    for (auto item : arr) {
        cout << "|" << item.getIdProduct() << " ";
        tb.printSpaces(spaces[0] - item.getIdProduct().length());

        cout << "|" << item.getName() << " ";
        tb.printSpaces(spaces[1] - item.getName().length());

        cout << "|" << item.getBrand() << " ";
        tb.printSpaces(spaces[2] - item.getBrand().length());

        cout << "|Rp" << item.getPrice() << " ";
        tb.printSpaces(spaces[3] - (to_string(item.getPrice()).length() + 2));

        cout << "|" << item.getSize() << " ";
        tb.printSpaces(spaces[4] - item.getSize().length());

        cout << "|" << item.getMaterial() << " ";
        tb.printSpaces(spaces[5] - item.getMaterial().length());

        cout << "|" << item.getGender() << " ";
        tb.printSpaces(spaces[6] - 1);

        cout << "|" << item.getColor() << " ";
        tb.printSpaces(spaces[7] - item.getColor().length());

        cout << "|" << item.getSleeveType() << " ";
        tb.printSpaces(spaces[8] - item.getSleeveType().length());

        cout << "|" << endl;
    }

    tb.printFrame();

    return 0;
}