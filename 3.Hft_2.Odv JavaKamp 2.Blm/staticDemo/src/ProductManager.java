public class ProductManager {
   public void add(Product product) {
       //ProductValidator validator=new ProductValidator();
       if(ProductValidator.isValid(product)) {
           System.out.println("Eklendi");
       }else {
           System.out.println("Ürün Bilgileri Geçersizdir");
       }
       //ProductValidator productValidator=new ProductValidator();
       //productValidator.bisey();
   }
}
