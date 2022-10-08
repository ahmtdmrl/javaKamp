//Katmanlı mimari görevleri birbirinden ayırıyoruz
//public void Save(Customer customer )
public class CustomerManager {
    public Customer _customer;
    public ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        _customer = customer;//başka bir methodda ulaşabilmek için
        _creditManager = creditManager;

    }

    public void Save() {
        System.out.println("Müşteri kaydedildi :");
    }

    public void Delete() {
        System.out.println("Müşteri silindi :");
    }
    public void GiveCredit(){
_creditManager.Calculate();
System.out.println("Kredi Verildi");
    }
}