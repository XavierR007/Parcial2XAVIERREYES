
class Bebida {
    protected String descripcion;
    protected double costo;

    public String obtenerDescripcion() {
        return descripcion;
    }

    public double calcularCosto() {
        return costo;
    }
}


class Cafe extends Bebida {
    public Cafe() {
        descripcion = "Café";
        costo = 4;
    }
}

class Te extends Bebida {
    public Te() {
        descripcion = "Té";
        costo = 1;
    }
}


class Decorador extends Bebida {
    protected Bebida bebida;

    public Decorador(Bebida bebida) {
        this.bebida = bebida;
    }

    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", " + descripcion;
    }

    public double calcularCosto() {
        return bebida.calcularCosto() + costo;
    }
}


class Leche extends Decorador {
    public Leche(Bebida bebida) {
        super(bebida);
        descripcion = "Leche";
        costo = 0.5;
    }
}

class Chocolate extends Decorador {
    public Chocolate(Bebida bebida) {
        super(bebida);
        descripcion = "Chocolate";
        costo = 1;
    }
}

public class Main {
    public static void main(String[] args) {

        Bebida miBebida = new Cafe();
        miBebida = new Leche(miBebida);
        miBebida = new Chocolate(miBebida);

        System.out.println("Descripción: " + miBebida.obtenerDescripcion());
        System.out.println("Costo total: Q" + miBebida.calcularCosto());
    }
}
