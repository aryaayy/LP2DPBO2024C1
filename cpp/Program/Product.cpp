#include <bits/stdc++.h>

using namespace std;

class Product{
    private:
        string idProduct;
        string name;
        string brand;
        int price;

    public:
        Product(){
            this->idProduct = "";
            this->name = "";
            this->brand = "";
            this->price = 0;
        }

        Product(string idProduct, string name, string brand, int price){
            this->idProduct = idProduct;
            this->name = name;
            this->brand = brand;
            this->price = price;
        }

        string getIdProduct(){
            return this->idProduct;
        }

        void setIdProduct(string idProduct){
            this->idProduct = idProduct;
        }

        string getName(){
            return this->name;
        }

        void setName(string name){
            this->name = name;
        }
        
        string getBrand(){
            return this->brand;
        }

        void setBrand(string brand){
            this->brand = brand;
        }

        int getPrice(){
            return this->price;
        }

        void setPrice(int price){
            this->price = price;
        }

        ~Product(){

        }
};