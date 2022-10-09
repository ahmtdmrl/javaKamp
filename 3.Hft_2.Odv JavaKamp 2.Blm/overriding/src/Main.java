public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(), new TarımKrediManager(), new OrgenciKrediManager()

                };
        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }



        //OgretmenKrediManager ogretmenKrediManager =new OgretmenKrediManager();
        //System.out.println(ogretmenKrediManager.hesapla(1000));

    }
}