/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismelagudaerah;

/**
 *
 * @author ACER
 */
public class Polymorphismelagudaerah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        papua pp= new papua();
        Maluku mk= new Maluku();
        kalimantanSelatan ks= new kalimantanSelatan();
        SulawesiSelatan ss= new SulawesiSelatan();
        Sumatra st= new Sumatra();
        JawaTimur jt= new JawaTimur();
        
        pp.tampilSuara();
        mk.tampilSuara();
        ks.tampilSuara();
        ss.tampilSuara();
        st.tampilSuara();
        jt.tampilSuara();
       
    }
    
}
