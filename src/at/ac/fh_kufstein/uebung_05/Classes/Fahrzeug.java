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
    private double tiefgang;
    private short schrauben;
    private double ladung;

    void entladen() throws InterruptedException
    {
        ladung = 0;
        Thread.sleep(5000);
    }

}