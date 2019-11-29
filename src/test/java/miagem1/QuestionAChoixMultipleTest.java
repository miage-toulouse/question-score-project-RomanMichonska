package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private QuestionAChoixMultiple uneQestion;
    //private ArrayList<Integer> listBonnesReponses = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        /*// given : un objet de type QuestionAChoixMultiple
        uneQestion = new QuestionAChoixMultiple("un énoncé",listBonnesReponses);
        listBonnesReponses.add(2);
        listBonnesReponses.add(3);*/

        uneQestion = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
    }

    @Test
    public void getEnonce() {
        /*// when : on demande l'énoncé à la question
        String resEnonce = uneQestion.getEnonce();
        // then : l'énnoncé est non null
        assertNotNull(resEnonce);
        // and : l'énoncé est bien celui fourni à la construction
        assertEquals( "un énoncé", resEnonce);*/

        assertEquals("q1", uneQestion.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        /*// when : un étudiant fourni l'indice correspondant à la bonne réponse
        int indicesEtudiant[] = {2,3};
        // and : on demande le calcul du score
        Float resScore = 0f;
        for (int indice : indicesEtudiant) {
            resScore += uneQestion.getScoreForIndice(indice);
        }
        // then : le score obtenu est 100
        assertEquals(new Float(100f), resScore);

        // when : un étudiant fourni l'indice correspondant à la bonne réponse
        int indicesEtudiant2[] = {1,4};
        resScore = 0f;
        // and : on demande le calcul du score
        for (int indice : indicesEtudiant2) {
            resScore += uneQestion.getScoreForIndice(indice);
        }
        // then : le score obtenu est 0
        assertEquals(new Float(0f), resScore);*/

        assertEquals(33.33f, uneQestion.getScoreForIndice(2), 0.01f);
        assertEquals(0f, uneQestion.getScoreForIndice(1), 0.001f);
    }
}