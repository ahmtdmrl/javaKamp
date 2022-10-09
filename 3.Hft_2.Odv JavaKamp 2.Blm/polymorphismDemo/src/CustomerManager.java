public class CustomerManager {
    private BaseLogger Logger;

    public CustomerManager(BaseLogger logger){
        this.Logger=logger;
    }
    public void add() {
    System.out.println("Müşteri Eklendi :");
    this.Logger.log("Log Mesajı");


    //DatabaseLogger logger = new DatabaseLogger();
    //logger.Log("Log Mesajı");   --bu kod kendimizi database class ına bağlamak oluyor
    //bunun yerine private alan oluşturulur.

}
}
