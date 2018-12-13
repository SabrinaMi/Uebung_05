package at.ac.fh_kufstein.uebung_05.Classes;

public class Fahrzeug
{
    private short reifen;
    private String farbe;
    private short ps;
    private short tueren;
    private boolean gestartet;
    private short geschwindigkeit;
    public static int anzahl;

    void starten()
    {
        gestartet = true;
    }

    void stoppen()
    {
        gestartet = false;
    }

    void beschleunigen(short geschwindigkeit)
    {
        if (gestartet == true)
        {
            if ((this.geschwindigkeit + geschwindigkeit) <= 250)
            {

                this.geschwindigkeit = (short) (this.geschwindigkeit + geschwindigkeit);
            }

        }
    }

    void bremsen(short geschwindigkeit)
    {
        if (gestartet == true)
        {
            if ((this.geschwindigkeit - geschwindigkeit) >= 0)
            {
                this.geschwindigkeit = (short) (this.geschwindigkeit - geschwindigkeit);
            }
        }
    }

    private boolean klimaanlage;
    private short airbags;

    void klimaanlageAn()
    {
        if (klimaanlage == false)
        {
            this.klimaanlage = true;
        }
        else
        {
            System.out.println("Klimaanlage läuft bereits");
        }

    }

    void klimaanlageAus()
    {
        if (klimaanlage == true)
        {
            this.klimaanlage = false;
        }
        else
        {
            System.out.println("Klimaanlage ist ausgeschalten");
        }
    }

    public short getReifen()
    {
        return reifen;
    }

    public void setReifen(short reifen)
    {
        this.reifen = reifen;
    }

    public String getFarbe()
    {
        return farbe;
    }

    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }

    public short getPs()
    {
        return ps;
    }

    public void setPs(short ps)
    {
        this.ps = ps;
    }

    public short getTueren()
    {
        return tueren;
    }

    public void setTueren(short tueren)
    {
        this.tueren = tueren;
    }

    public boolean isGestartet()
    {
        return gestartet;
    }

    public void setGestartet(boolean gestartet)
    {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit()
    {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit)
    {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl()
    {
        return anzahl;
    }

    public static void setAnzahl(int anzahl)
    {
        Fahrzeug.anzahl = anzahl;
    }

    public boolean isKlimaanlage()
    {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage)
    {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags()
    {
        return airbags;
    }

    public void setAirbags(short airbags)
    {
        this.airbags = airbags;
    }

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