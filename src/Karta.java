public class Karta {
    private String idkarty;
    private int sumkonta;


    public Karta (String idkarty, int sumkonta)
    {
        this.idkarty = idkarty;
        this.sumkonta = sumkonta;
    }
    public void setSumkonta(int sumkonta)
    {
        this.sumkonta = sumkonta;
    }
    public String getIdkarty()
    {return idkarty;}
    public int getSumkonta()
    {return sumkonta;}

}
