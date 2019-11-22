package miagem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif uneQestion;

    @Before
    public void setUp() throws Exception {
        // given : un objet de type QuestionAChoixExclusif
        uneQestion = new QuestionAChoixExclusif("un énoncé", 2);
    }

    @Test
    public void testGetEnonce() {
        // when : on demande l'énoncé à la question
        String resEnonce = uneQestion.getEnonce();
        // then : l'énnoncé est non null
        assertNotNull(resEnonce);
        // and : l'énoncé est bien celui fourni à la construction
        assertEquals( "un énoncé", resEnonce);
    }

    @Test
    public void testGetScoreForIndice() {
        // when : un étudiant fourni l'indice correspondant à la bonne réponse
        int indiceEtudiant = 2;
        // and : on demande le calcul du score
        Float resScore = uneQestion.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(new Float(100f), resScore);

        // when : un étudiant fourni l'indice correspondant à la bonne réponse
        indiceEtudiant = 3;
        // and : on demande le calcul du score
        resScore = uneQestion.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 0
        assertEquals(new Float(0f), resScore);
    }
}