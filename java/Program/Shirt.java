class Shirt extends Clothing{ // anak dari kelas Clothing
    // variabel private
    private String color;
    private String sleeveType;

    // constructor
    Shirt(){
        this.color = "";
        this.sleeveType = "";
    }

    Shirt(String color, String sleeveType){
        this.color = color;
        this.sleeveType = sleeveType;
    }

    // setter dan getter
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getSleeveType(){
        return this.sleeveType;
    }

    public void setSleeveType(String sleeveType){
        this.sleeveType = sleeveType;
    }
}