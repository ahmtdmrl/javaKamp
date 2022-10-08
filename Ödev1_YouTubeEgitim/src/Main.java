public class Main {
    public static void main(String[] args) {
        //IoC Container
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager() );
        customerManager.GiveCredit();

//        int[] sayilar1 = new int[]{1, 2, 3};
//        int[] sayilar2 = new int[]{10, 20, 30};
//        sayilar1 = sayilar2;
//
//        sayilar2[0] = 1000;
//
//        System.out.println(sayilar1[0]);
//
//
//        creditManager creditManager = new creditManager();
//        creditManager.Calculate();
//        creditManager.Save();
//
//        Customer customer = new Customer(); //örneğini oluşturmak, instance creation
//        customer.setId(1);
//        customer.setCity("Ankara");
//
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.Save();
//        customerManager.Delete();
//
//        Company company =new Company();
//        company.setCompanyName("A şirketi");
//        company.setTaxNumber("5846899745");
//        company.setId(100);
//
//        CustomerManager customerManager2 = new CustomerManager(new Person());
//
//
//        Person person=new Person();
//        person.setFirstName("Salih");
//        person.setLastName("Demir");
//        person.setNationalIdentity("5794554");
//
//        Customer c1 = new Customer();
//        Customer c2 = new Person();
//        Customer c3 = new Company();

    }
}
