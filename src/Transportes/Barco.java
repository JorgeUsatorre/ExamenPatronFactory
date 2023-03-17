package Transportes;

public class Barco implements ITransportes{
    private Integer cp;
    private Float dimensionX;
    private Float dimensionY;
    private Float dimensionZ;
    private Float peso;

    public Barco(Integer cp, Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
    }


    @Override
    public Float costeTotal(Integer cp) {
        return null;
    }

    @Override
    public Integer tipoEmbalaje(Float dimensionX, Float dimensionY, Float dimensionZ, Float peso) {
        return null;
    }
}
