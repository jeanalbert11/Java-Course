package test;

import datos.PersonaJDBC;
import dominio.Persona;
import java.util.List;

public class ManejoPersonas {
    
    public static void main(String[] args) { 
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.listar();
        
        for(Persona persona: personas){
            System.out.println("persona:" + persona);
        }
        
        //Prueba insertar
//        Persona persona = new Persona();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55668899");

//        personaJDBC.insertar(persona);
      
//        //Prueba actualizar
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        persona.setNombre("Mayra");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55668899");
//        
//        personaJDBC.actualizar(persona);

//          Persona persona = new Persona();
//          persona.setId(3);
//          
//          personaJDBC.eliminar(persona);
    }
}
