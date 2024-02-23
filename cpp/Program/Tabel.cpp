#include <bits/stdc++.h>

using namespace std;

class Tabel{
    private:
        int width;

    public:
        Tabel(){

        }

        Tabel(int width){
            this->width = width;
        }

        // setter dan getter
        int getWidth(){
            return this->width;
        }

        void setWidth(int width){
            this->width = width;
        }

        // method print frame horizontal
        void printFrame(){
            cout << "+";
            for(int i = 0; i < this->width; i++){
                cout << "-";
            }
            cout << "+" << '\n';
        }

        // method print spasi
        void printSpaces(int len){
            for(int i = 0; i < len; i++){
                cout << " ";
            }
        }
};