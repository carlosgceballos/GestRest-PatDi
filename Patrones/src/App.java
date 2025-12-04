import myclasses.platos.*;
import myclasses.fabrica.*;
import myclasses.decoradores.*;
import myclasses.cocina.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("  SISTEMA DE GESTION DE RESTAURANTE     ");
        System.out.println("     Patrones de Diseno en Java         ");
        System.out.println("==========================================\n");
        
        // DEMOSTRACION PATRON 1: FACTORY METHOD
        System.out.println("-----------------------------------------");
        System.out.println("  PATRON 1: FACTORY METHOD (Creacional)");
        System.out.println("-----------------------------------------");
        //Objetivo: Delegar la creacion de objetos a subclases
        
        System.out.println("Seleccione el tipo de cocina:");
        System.out.println("1. Cocina Italiana");
        System.out.println("2. Cocina Mexicana");
        System.out.print("Opcion: ");
        int opcionCocina = scanner.nextInt();
        
        FabricaPlatos fabrica;
        String tipoCocina;
        
        if (opcionCocina == 1) {
            fabrica = new FabricaItaliana();
            tipoCocina = "Italiana";
        } else {
            fabrica = new FabricaMexicana();
            tipoCocina = "Mexicana";
        }
        
        System.out.println("\nFabrica de cocina " + tipoCocina + " creada");
        fabrica.mostrarMenu();
        
        // Crear un plato para decorar
        System.out.println("-----------------------------------------");
        System.out.println("  PATRON 2: DECORATOR (Estructural)     ");
        System.out.println("-----------------------------------------");
        //Objetivo: Agregar funcionalidades a objetos dinamicamente
        
        Plato platoBase = fabrica.crearPlatoPrincipal();
        System.out.println("Plato base seleccionado:");
        platoBase.mostrarInfo();
        
        System.out.println("\nDesea agregar extras al plato?");
        System.out.println("1. Agregar Extra Queso (+$2.00)");
        System.out.println("2. Agregar Extra Picante (+$1.50)");
        System.out.println("3. Agregar ambos (+$3.50)");
        System.out.println("4. Sin extras");
        System.out.print("Opcion: ");
        int opcionDecorador = scanner.nextInt();
        
        Plato platoFinal = platoBase;
        
        switch (opcionDecorador) {
            case 1:
                platoFinal = new ExtraQueso(platoBase);
                break;
            case 2:
                platoFinal = new ExtraPicante(platoBase);
                break;
            case 3:
                platoFinal = new ExtraQueso(platoBase);
                platoFinal = new ExtraPicante(platoFinal);
                break;
            default:
                System.out.println("Sin extras agregados");
        }
        
        if (opcionDecorador != 4) {
            System.out.println("\nPlato decorado:");
            platoFinal.mostrarInfo();
        }
        
        // DEMOSTRACION PATRON 3: OBSERVER
        System.out.println("-----------------------------------------");
        System.out.println("  PATRON 3: OBSERVER (Comportamiento)   ");
        System.out.println("-----------------------------------------");
        //Objetivo: Notificar cambios a multiples objetos
        
        // Crear la cocina (Sujeto)
        Cocina cocina = new Cocina(tipoCocina);
        
        // Crear observadores
        Chef chef1 = new Chef("Mario");
        Chef chef2 = new Chef("Luigi");
        Mesero mesero = new Mesero("Pedro");
        
        System.out.println("Registrando personal en la cocina...");
        cocina.agregarObservador(chef1);
        cocina.agregarObservador(chef2);
        cocina.agregarObservador(mesero);
        
        // Simular pedido
        System.out.println("\n--- Simulando llegada de pedido ---");
        cocina.recibirPedido(platoFinal);
        
        // RESUMEN FINAL
        System.out.println("\n==========================================");
        System.out.println("          RESUMEN DE PATRONES             ");
        System.out.println("==========================================");
        System.out.println("\nFACTORY METHOD: Creo platos segun cocina " + tipoCocina);
        System.out.println("DECORATOR: Personalizo el plato con extras");
        System.out.println("OBSERVER: Notifico al personal sobre el pedido");
        
        System.out.println("\nPrograma finalizado exitosamente\n");
        
        scanner.close();
    }
}