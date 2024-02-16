class Tabel{
    // variabel lebar tabel
    private int width;

    // constructor
    Tabel(){

    }

    Tabel(int width){
        this.width = width;
    }

    // setter dan getter
    public int getWidth(){
        return this.width;
    }

    public void setWidth(int width){
        this.width = width;
    }

    // method print frame horizontal
    public void printFrame(){
        System.out.print("+");
        for(int i = 0; i < this.width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    // method print spasi
    public void printSpaces(int len){
        for(int i = 0; i < len; i++){
            System.out.print(" ");
        }
    }
}