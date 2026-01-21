package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import ui.CompletePage;

public class VerificarMensajeQuestion implements Question<Boolean> {

    private String mensajeEsperado;

    public VerificarMensajeQuestion(String mensajeEsperado) {
        this.mensajeEsperado = mensajeEsperado;
    }

    public static VerificarMensajeQuestion es(String mensajeEsperado) {
        return new VerificarMensajeQuestion(mensajeEsperado);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeActual = Text.of(CompletePage.THANK_YOU_MESSAGE).answeredBy(actor);
        return mensajeActual.equals(mensajeEsperado);
    }
}