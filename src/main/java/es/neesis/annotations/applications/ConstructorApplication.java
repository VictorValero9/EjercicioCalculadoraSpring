package es.neesis.annotations.applications;

import org.springframework.stereotype.Component;
import es.neesis.annotations.services.ICalculadora;

@Component
public class ConstructorApplication {

        private final ICalculadora calculadora;

        public ConstructorApplication (ICalculadora calculadora) {
            this.calculadora = calculadora;
        }

        public void testFunction(){
            calculadora.testFunction();
        }
        public void menu(){calculadora.menu();}
}
