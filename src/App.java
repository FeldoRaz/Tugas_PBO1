//OOP
//Class Abstract (kelas yang memiliki banyak fungsi secara acak(pokoknya ada itu dan ini))
//Inheritance (pewarisan)
//Encapsulation (access LEVEL)
//Overidding (decorator,tdk menghiraukan method)
//Overloading (class yang sama tapi dengan parameter yang berbeda)
abstract class Peminjaman{
    void denda(){}
    void pengembalian(){}
    void baranghilang(){}
}

class PBO extends Peminjaman{
    //karena tdk jelas maka pakai 
    @Override
    void denda(){}
}

class parent{
   public int x;
   void print(String tipeAnggota, int bayar){
        System.out.println("Print Parent");
    }
    void print(String tipeAnggota){
        System.out.println("Print Parent");
    }
    void print(){
        System.out.println("Print selanjutnya");
    }
}
class A extends parent{
    @Override
    void print(){
        System.out.println("Print A");
    }
    void test(){
        print();
        x = 5;
    }

}
class B extends A{
    void test2 (){
        print();
        
    }

}

public class App extends parent{
    
    public static void main(String[] args) throws Exception {
        parent parent = new parent ();
        parent.print();
        parent.print("Mahasiswa");
        parent.print("Uang", 20000);

        A a = new A();
        a.print();
        //kelas abstract tidak bisa dipanggil karena ABSTRACT
        Peminjaman peminjaman = new Peminjaman() {
            
        };
    }
}
