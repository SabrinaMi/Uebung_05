package at.ac.fh_kufstein.uebung_05.Classes;

public class Auto
{

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

}
