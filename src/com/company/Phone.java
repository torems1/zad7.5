package com.company;

public class Phone {
    private String code;
    private String first;
    private String second;
    private String third;

    public Phone(String number){
        String[] array= number.split("");
        if(array.length>12){
            code=array[0]+array[1]+array[2];
            first=array[3]+array[4]+array[5];
            second=array[6]+array[7]+array[8];
            third=array[9]+array[10]+array[11]+array[12];
        }else {
            code=array[0]+array[1];
            first=array[2]+array[3]+array[4];
            second=array[5]+array[6]+array[7];
            third=array[8]+array[9]+array[10]+array[11];
        }
    }
    public String toString(){
        return "Code country: "+code+", "
                +"3 cifry: "+first+", "
                +"3 cifry: "+second+", "
                +"4 cifry: "+third;
    }
}
