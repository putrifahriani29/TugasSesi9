class Mahasiswa <N,M,C>{
    private N Nim;
    private M Name;
    private C Clas;

    public N getNim() {
        return Nim;
    }

    public void setNim(N Nim) {
        this.Nim = Nim;
    }

    public M getName() {
        return Name;
    }

    public void setName(M Name) {
        this.Name = Name;
    }

    public C getClas() {
        return Clas;
    }

    public void setClas(C Clas) {
        this.Clas = Clas;
    } 
}

public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa <String,String,Integer> m = new Mahasiswa<>();
        m.setNim("20210040080");
        m.setName("PUTRI");
        m.setClas(21F);
        
        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
