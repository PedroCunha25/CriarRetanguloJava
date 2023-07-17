
package criarretangulo;

public class Retangulo {
    double coordenadaX1, coordenadaX2, coordenadaY1, coordenadaY2;
     

    
    public Retangulo(){
        
    }

    public Retangulo(double cordenadaX1, double coordenadaX2, double coordenadaY1, double coordenadaY2) {
        this.coordenadaX1 = cordenadaX1;
        this.coordenadaX2 = coordenadaX2;
        this.coordenadaY1 = coordenadaY1;
        this.coordenadaY2 = coordenadaY2;
    }

    public double getCordenadaX1() {
        return coordenadaX1;
    }

    public void setCordenadaX1(double coordenadaX1) {
        this.coordenadaX1 = coordenadaX1;
    }

    public double getCoordenadaX2() {
        return coordenadaX2;
    }

    public void setCoordenadaX2(double coordenadaX2) {
        this.coordenadaX2 = coordenadaX2;
    }

    public double getCoordenadaY1() {
        return coordenadaY1;
    }

    public void setCoordenadaY1(double coordenadaY1) {
        this.coordenadaY1 = coordenadaY1;
    }

    public double getCoordenadaY2() {
        return coordenadaY2;
    }

    public void setCoordenadaY2(double coordenadaY2) {
        this.coordenadaY2 = coordenadaY2;
    }
    
    public double base (){ 
        if (this.coordenadaX1 < this.coordenadaX2)
            return (this.coordenadaX2 - this.coordenadaX1);
        else
            return (this.coordenadaX1 - this.coordenadaX2);
    }
    
    public double altura(){ 
        if (this.coordenadaY1 < this.coordenadaY2)
            return (this.coordenadaY2- this.coordenadaY1);
        else 
            return (this.coordenadaY1 - this.coordenadaY2);
    }
    
    public double perimetro(){ 
        return ( (2*this.base()) + (2*this.altura()) );
    }
    
    public double area(){ 
        return ( (this.base()) * (this.altura()) );
    }
    
    public String toString(){ 
        return ( "Retangulo " + "{" + "x1 = " + coordenadaX1 + "," + " x2 = " + coordenadaX2 + "," + " y1 = " + coordenadaX1 + "," + " y2 = " + coordenadaY2 + "}");
    }
}

