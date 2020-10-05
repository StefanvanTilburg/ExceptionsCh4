package model;

/**
 * @author Stefan van Tilburg
 *
 *         Class Vierkant berekend oppervlakte en zijde
 */
public class Vierkant {
    private double zijde;

    public Vierkant(double zijde) {
        this.setZijde(zijde);
    }

    public Vierkant() {
        this(1);
    }

    public double getOppervlakte() {
        return this.getZijde() * this.getZijde();
    }

    public static double berekenZijde(double oppervlakte) {
        return Math.sqrt(oppervlakte);
    }

    public double getZijde() {
        return zijde;
    }

    public void setZijde(double zijde) {
        this.zijde = zijde;
    }

    @Override
    public String toString() {
        return "Vierkant{" +
                "zijde=" + zijde +
                '}';
    }
}
