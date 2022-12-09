package Interface;
public class Conjunto implements Comparavel{
    private int elemento1;
    private int elemento2;

    Conjunto(int a, int b) {
        this.elemento1 = a;
        this.elemento2 = b;
    }

    public int soma() {
        return this.elemento1 + this.elemento2;
    }

    public String getElementos() {
        if (this.elemento1 > this.elemento2) {
            return "<" + this.elemento2 + ", " + this.elemento1 + ">";
        } else {
            return "<" + this.elemento1 + ", " + this.elemento2 + ">";
        }
    }

    public boolean maior(Comparavel obj) {
        Conjunto downcast = (Conjunto) obj;

        if (this.soma() > (downcast).soma()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean menor(Comparavel obj) {
        Conjunto downcast = (Conjunto) obj;

        if (this.soma() < (downcast).soma()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean igual(Comparavel obj) {
        Conjunto downcast = (Conjunto) obj;

        if (this.soma() == (downcast).soma()) {
            return true;
        } else {
            return false;
        }
    }
}
