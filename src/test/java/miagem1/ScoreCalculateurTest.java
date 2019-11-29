package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {

    private QuestionAChoixMultiple questionAChoixMultiple;
    private ScoreCalculateur scoreC;

    @Before
    public void setUp() throws Exception {
        // given : un objet de type QuestionAChoixMultiple
        questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
        scoreC = new ScoreCalculateur();
    }

    @Test
    public void calculeScore() {
        // Quand on calcule le score pour une liste de réponses contenant les valeurs 1 et 4, on obtient 0 comme résultat
        ArrayList<Integer> listeReponses = new ArrayList<Integer>(Arrays.asList(1,4));
        assertEquals(0f, scoreC.calculeScore(listeReponses, questionAChoixMultiple), 0.01f);

        // Quand on calcule le score pour une liste de réponses contenant les valeurs 2 et 3, on obtient 2*100/3 à 0,01 près comme résultat
        ArrayList<Integer> listeReponses2 = new ArrayList<Integer>(Arrays.asList(2,3));
        assertEquals(200/3f, scoreC.calculeScore(listeReponses2, questionAChoixMultiple), 0.01f);

        // Quand on calcule le score pour une liste de réponses contenant les valeurs 2, 3 et 5, on obtient 100 à 0,01 près comme résultat
        ArrayList<Integer> listeReponses3 = new ArrayList<Integer>(Arrays.asList(2,3, 5));
        assertEquals(100f, scoreC.calculeScore(listeReponses3, questionAChoixMultiple), 0.01f);
    }
}