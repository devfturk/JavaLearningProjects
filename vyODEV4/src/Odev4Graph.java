public class Odev4Graph<T> extends Odev4AbstractGraph<T> {
    /**
     * Mevcut çizgenin komşuluk matrisini hesaplayıp geri döndürür
     * @return Komşuluk matrisi(iki boyutlu tamsayı dizisi)
     */
    @Override
    public int[][] adjacencyMatrix() {
        int dizi[][] = new int[vertices.size()][vertices.size()];
        int isayac = 0;
        int jsayac = 0;
        int vsayac = 0;
        for (Vertex<T> v:vertices) {
            for (Edge<T> e:v.edges){
                vsayac=0;
                while (vsayac < vertices.size()) {                    
                    if (e.to.equals(vertices.get(vsayac))) {
                        dizi[isayac][jsayac] = e.weight;
                    }
                    vsayac++;
                    jsayac++;
                }
                jsayac=0;
            }
            isayac++;
        }
        
        return dizi;
    }

    /**
     * Mevcut çizgenin parametre olarak gönderilen çizge ile eşit olup
     * olmadığını döndürür. İki çizgenin birbirine eşit olması için düğümlerin
     * (vertex) referansları farklı olsa bile değerlerinin eşit olması ve de
     * tüm kenarların her iki çizgede de aynı düğümler arasında olması gerekir
     * @param g2 Eşitlik kontrolü için gönderilen çizge parametresi
     * @return Eşit için true aksi halde false döner
     */
    @Override//önce vertex sayısı,vertex değerleri verticsMap,edge kontrol 
    public boolean equals(Odev4AbstractGraph<T> g2) {
        
        if (g2.vertices.size() != vertices.size()) {
            return false;
        }
        
        for (int i = 0; i < vertices.size(); i++) {
            Vertex<T> v = vertices.get(i);
            Vertex<T> v1 = g2.vertices.get(i);
            if (v.value != v1.value) {
                return false;
            }
            
        }
        for (int i = 0; i < vertices.size(); i++) {
            Vertex<T> v = vertices.get(i);
            Vertex<T> v1 = g2.vertices.get(i);
            if (v.edges.size() != v1.edges.size()) {
                return false;
            }
            for (int j = 0; j < v.edges.size(); j++) {
                if (v.edges.get(j).from.value != v1.edges.get(j).from.value) {
                    return false;
                }
            }
        }   

        return true;
    }
}
