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

    public static double berekenZijde(double oppervlakte) throws IllegalArgumentException {
        if (oppervlakte < 0) {
            throw new IllegalArgumentException("Oppervlakte mag niet negatief zijn.");
        }
        return Math.sqrt(oppervlakte);
    }

    public double getZijde() {
        return zijde;
    }

    public void setZijde(double zijde) throws IllegalArgumentException {
        if (zijde < 0) {
            throw new IllegalArgumentException("Zijde mag niet negatief zijn.");
        }
        this.zijde = zijde;
    }

    @Override
    public String toString() {
        return "Vierkant{" +
                "zijde=" + zijde +
                '}';
    }
}
