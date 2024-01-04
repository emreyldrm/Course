package org.example;

public class ProductValidator {

    static {
        System.out.println("Statik yapıcı blok çalıştı.");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı.");
    }
    public static boolean isValid(Product product){ //metod static yapıldığında class ismi ile çağrılabilir.
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public void bisey(){

    }
    //inner class static olmadan kullanılamıyor.
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
