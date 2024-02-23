#include <bits/stdc++.h>
#include "Clothing.cpp"

using namespace std;

class Shirt: public Clothing{
    private:
        string color;
        string sleeveType;

    public:
        // constructor
        Shirt(){
            this->color = "";
            this->sleeveType = "";
        }

        Shirt(string color, string sleeveType){
            this->color = color;
            this->sleeveType = sleeveType;
        }

        // setter dan getter
        string getColor(){
            return this->color;
        }

        void setColor(string color){
            this->color = color;
        }

        string getSleeveType(){
            return this->sleeveType;
        }

        void setSleeveType(string sleeveType){
            this->sleeveType = sleeveType;
        }

        ~Shirt(){

        }
};