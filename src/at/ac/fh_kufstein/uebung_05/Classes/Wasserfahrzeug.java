package at.ac.fh_kufstein.uebung_05.Classes;

public class Wasserfahrzeug
{

    public double getTiefgang()
    {
        return tiefgang;
    }

    public void setTiefgang(double tiefgang)
    {
        this.tiefgang = tiefgang;
    }

    public short getSchrauben()
    {
        return schrauben;
    }

    public void setSchrauben(short schrauben)
    {
        this.schrauben = schrauben;
    }

    public double getLadung()
    {
        return ladung;
    }

    public void setLadung(double ladung)
    {
        this.ladung = ladung;
    }

    private double tiefgang;
    private short schrauben;
    private double ladung;

    void entladen() throws InterruptedException
    {
        ladung = 0;
        Thread.sleep(5000);
    }

}
