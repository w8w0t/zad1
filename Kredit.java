package com.company;

import java.util.Scanner;

public class Kredit
{
    private String nazvanie;
    private int srok;
    private boolean shtraf;

      public Kredit(String nazvanie, int srok, boolean shtraf)
      { this.nazvanie = nazvanie;
        this.srok = srok;
        this.shtraf = shtraf;
      }
    public Kredit(String nazvanie, int srok)
    { this.nazvanie = nazvanie;
        this.srok = srok;

    }

    public Kredit()
    {}

      public void setNazvanie(String nazvanie)
      {
          this.nazvanie = nazvanie;
      }

      public void setSrok(int srok)
      {
          this.srok=srok;
      }

      public void setShtraf(boolean shtraf)
      {
          this.shtraf=shtraf;
      }


     public static void vivod(Kredit Kakoito)
     {
      System.out.printf("\nSrok pogasheniya = "+ Kakoito.getSrok()+
                         "\nNazvanie kredita = "+Kakoito.getNazvanie()+"\n "+Kakoito.getShtraf());
     }



    public static void vvod(Kredit Kakoito)
    { String Name;
      System.out.print("Vvedite nazvanie = ");

      Scanner in = new Scanner(System.in);
      Name= in.nextLine();

      System.out.print("Vvedite srok pogasheniya = ");
      int sr = in.nextInt();

      System.out.print("Est li shtraf?");
      boolean danet = in.nextBoolean();

        Kakoito.setNazvanie(Name);
        Kakoito.setSrok(sr);
        Kakoito.setShtraf(danet);


    }


    public static void main(String[] args) {

    Kredit Ucheba[] = new Kredit[10];
    Ucheba[0]=new Kredit("Java",10,true);
    vivod(Ucheba[0]);
    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Skolko eshe kreditov vi hotite vnesti? n = ");
    n=in.nextInt();
    System.out.println(n);
    for (int i=1; i<n; i++)
       { Ucheba[i] = new Kredit();
           vvod(Ucheba[i]);

      }
    for(int i=0; i<n;i++)
     {
         vivod(Ucheba[i]);
     }

      }

    public int getSrok() {
        return srok;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public String getShtraf()
    {
      if (shtraf == true) return "est shtraf"; else return "net shtrafa";
    }
}
