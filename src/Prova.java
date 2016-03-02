/**
 * Exercici de classe per saber com funciona Javadoc i les proves.
 * @author Toni Gomis
 * @version 1.0
 */
import com.esliceu.ProvaCaixaNegre;
public class Prova {

    /** funció que realitza les proves.
     *
     * @param args
     */
    public static void main(String[] args) {

        ProvaCaixaNegre x = new ProvaCaixaNegre();

        /* Prova aleatòria fent servir el meu DNI, la lletra del qual és J (Correcte) */
        System.out.println(x.lletraDNI(43083866));

        /* Integritat de paràmetres */

        //Si no introduïm un int no compila
        //System.out.println(x.lletraDNI(ABCDEFGH));

        System.out.println(x.lletraDNI(00000000)); //El DNI 00000000 no existeix, però així i tot retorna una lletra (Incorrecte)

        /* Integritat funcional */
        System.out.println(x.lletraDNI(1)); /* El DNI 1 existeix (http://www.elcorreo.com/vizcaya/noticias/201307/01/Media/franco--300x180.JPG),
                                             però no hauria d'acceptar un valor d'un sol número (Incorrecte) */

        System.out.println(x.lletraDNI(999999999)); /* El DNI d'Espanya només preveu 99.999.999 documents amb la seva numeració
                                                    actual, però de moment no s'han esgotat. El valor introduït de 999.999.999
                                                    no hauria de ser aprovat pel sistema. (Incorrecte). Aquesta prova també
                                                     serveix com a prova de valor límit */

        /* Valor límit */
        //System.out.println(x.lletraDNI(-22222222)); /* No hi ha números de DNI negatius, aquest resultat dóna error (Correcte) */






    }
}
