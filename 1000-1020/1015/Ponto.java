public class Ponto {

    float x;
    float y;

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void distancia(Ponto ponto) {
        float x1 = this.x;
        float y1 = this.y;
        float x2 = ponto.x;
        float y2 = ponto.y;

        System.out.printf("%.4f%n",Math.sqrt( ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)) ));
        
    }

}