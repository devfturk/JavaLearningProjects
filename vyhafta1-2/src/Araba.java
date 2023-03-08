
    class Araba implements Comparable<Araba>{
    public int modelYili;
    public String plaka;
    public String marka;
    public double motorHacmi;

    public Araba(int modelYili,  double motorHacmi ,String plaka) {
        this.modelYili = modelYili;
        this.motorHacmi = motorHacmi;
        this.plaka = plaka;
    }

    
    @Override
    public int compareTo(Araba o) {
        return this.modelYili-o.modelYili;
    }  
}
 