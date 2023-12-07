import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        MesaDeAyuda mesadeayuda = new MesaDeAyuda("Helpdesk");

        //Exception al asignar el código de usuario sin la u al inicio
        Usuario usu1 = null;
        Usuario usu2 = null;
        Usuario usu3 = null;
        Usuario usu4 = null;
        Usuario usu5 = null;
        Usuario usu6 = null;
        Usuario usu7 = null;
        Usuario usu8 = null;
        Usuario usu9 = null;
        Usuario usu10 = null;

        try {
            usu1 = new Usuario("u202316328", "Daniel", "Gerente", "Gerencia");
            usu2 = new Usuario("u202316327", "Pedro", "Practicante", "Sistemas");
            usu3 = new Usuario("u202316326", "Paolo", "Supervisor", "Produicción");
            usu4 = new Usuario("u202316325", "Jeferson", "Gerente", "Gerencia");
            usu5 = new Usuario("u202316324", "Pablo", "Jefe", "Almacen");
            usu6 = new Usuario("u202316331", "Antonio", "Jefe", "Produccion");
            usu7 = new Usuario("u202316335", "Juan", "Practicante", "Almacen");
            usu8 = new Usuario("u202316332", "Melissa", "Analista", "Almacen");
            usu9 = new Usuario("u202316325", "Jeferson", "Gerente", "Gerencia");
            usu10 = new Usuario("u202316324", "Pablo", "Jefe", "Almacen");

        } catch (CodUsuarioException e) {
            System.out.println(e.getMessage());
        }

        Responsable resp1 = new Responsable("R01", "Pedro", "Tecnico1");
        Responsable resp2 = new Responsable("R02", "Juan", "Tecnico2");

        Categoria cat1 = new Categoria("Soporte Tecnico");
        Categoria cat2 = new Categoria("Acceso a Sistemas");
        Categoria cat3 = new Categoria("Desbloqueo de Cuenta");
        Categoria cat4 = new Categoria("Instalación de software");

        Incidencia inc1 = new Incidencia("I001", cat1, "02/01/2023", "Cerrado", usu1, resp1);
        Incidencia inc2 = new Incidencia("I002", cat1, "03/01/2023", "Cerrado", usu2, resp2);
        Incidencia inc3 = new Incidencia("I003", cat3, "04/01/2023", "Cerrado", usu3, resp1);
        Incidencia inc4 = new Incidencia("I004", cat4, "04/01/2023", "Cerrado", usu4, resp1);
        Incidencia inc5 = new Incidencia("I005", cat1, "04/01/2023", "En proceso", usu5, resp2);
        Incidencia inc6 = new Incidencia("I006", cat2, "04/01/2023", "Cerrado", usu5, resp2);
        Incidencia inc7 = new Incidencia("I007", cat2, "05/01/2023", "Cerrado", usu1, resp2);
        Incidencia inc8 = new Incidencia("I008", cat2, "05/01/2023", "Cerrado", usu2, resp1);
       Incidencia inc9 = new Incidencia("I009", cat1, "05/01/2023", "En proceso", usu2, resp2);
       Incidencia inc10 = new Incidencia("I010", cat2, "05/01/2023", "Cerrado", usu2, resp2);
       Incidencia inc11 = new Incidencia("I011", cat3, "05/01/2023", "Cerrado", usu2, resp2);
       Incidencia inc12 = new Incidencia("I012", cat3, "05/01/2023", "Cerrado", usu2, resp2);
       Incidencia inc13 = new Incidencia("I013", cat1, "05/01/2023", "Cerrado", usu2, resp2);
       Incidencia inc14 = new Incidencia("I014", cat1, "05/01/2023", "Cerrado", usu2, resp1);
       Incidencia inc15 = new Incidencia("I015", cat2, "05/01/2023", "Cerrado", usu2, resp1);
       Incidencia inc16 = new Incidencia("I016", cat2, "05/01/2023", "En proceso", usu2, resp1);
       Incidencia inc17 = new Incidencia("I017", cat3, "05/01/2023", "En proceso", usu2, resp1);
       Incidencia inc18 = new Incidencia("I018", cat1, "06/01/2023", "No Iniciado", usu2, resp1);
       Incidencia inc19 = new Incidencia("I019", cat1, "06/01/2023", "No Iniciado", usu2, resp1);
       Incidencia inc20 = new Incidencia("I020", cat2, "06/01/2023", "No Iniciado", usu2, resp2);

        mesadeayuda.agregarIncidencia(inc1);
        mesadeayuda.agregarIncidencia(inc2);
        mesadeayuda.agregarIncidencia(inc3);
        mesadeayuda.agregarIncidencia(inc4);
        mesadeayuda.agregarIncidencia(inc5);
        mesadeayuda.agregarIncidencia(inc6);
        mesadeayuda.agregarIncidencia(inc7);
        mesadeayuda.agregarIncidencia(inc8);
        mesadeayuda.agregarIncidencia(inc9);
        mesadeayuda.agregarIncidencia(inc10);
        mesadeayuda.agregarIncidencia(inc11);
        mesadeayuda.agregarIncidencia(inc12);
        mesadeayuda.agregarIncidencia(inc13);
        mesadeayuda.agregarIncidencia(inc14);
        mesadeayuda.agregarIncidencia(inc15);
        mesadeayuda.agregarIncidencia(inc16);
        mesadeayuda.agregarIncidencia(inc17);
        mesadeayuda.agregarIncidencia(inc18);
        mesadeayuda.agregarIncidencia(inc19);
        mesadeayuda.agregarIncidencia(inc20);

        System.out.println(inc1.toString());
        System.out.println(inc2.toString());
        System.out.println(inc3.toString());
        System.out.println(inc4.toString());
        System.out.println(inc5.toString());
        System.out.println(inc6.toString());
        System.out.println(inc7.toString());
        System.out.println(inc8.toString());
        System.out.println(inc9.toString());
        System.out.println(inc10.toString());
        System.out.println(inc11.toString());
        System.out.println(inc12.toString());
        System.out.println(inc13.toString());
        System.out.println(inc14.toString());
        System.out.println(inc15.toString());
        System.out.println(inc16.toString());
        System.out.println(inc17.toString());
        System.out.println(inc18.toString());
        System.out.println(inc19.toString());
        System.out.println(inc20.toString());


        List<Incidencia> listaIncidencia = new ArrayList<>();
        listaIncidencia.add(inc1);
        listaIncidencia.add(inc2);
        listaIncidencia.add(inc3);
        listaIncidencia.add(inc4);
        listaIncidencia.add(inc5);
        listaIncidencia.add(inc6);
        listaIncidencia.add(inc7);
        listaIncidencia.add(inc8);
        listaIncidencia.add(inc9);
        listaIncidencia.add(inc10);
        listaIncidencia.add(inc11);
        listaIncidencia.add(inc12);
        listaIncidencia.add(inc13);
        listaIncidencia.add(inc14);
        listaIncidencia.add(inc15);
        listaIncidencia.add(inc16);
        listaIncidencia.add(inc17);
        listaIncidencia.add(inc18);
        listaIncidencia.add(inc19);
        listaIncidencia.add(inc20);


        System.out.println("------------Reporte de incidencia según  su estado------------");

        Map<String, Integer> contadores = new HashMap<>();

       // Contar incidencias por estado
        for (Incidencia i : listaIncidencia) {
             String estado = i.getEstado();
             contadores.put(estado, contadores.getOrDefault(estado, 0) + 1);
        }

        // Total de incidencias
        int total = listaIncidencia.size();

        // Calcular porcentajes
        for (Map.Entry<String, Integer> entry : contadores.entrySet()) {
                String estado = entry.getKey();
                int contador = entry.getValue();

                double porcentaje = (contador * 100.0) / total;
                System.out.println(estado + ":" + Math.round(porcentaje) + "%");
                }


        //Tipo de incidencia mas recurrente
         System.out.println("------------Tipo de incidencia con mayor recurrencia------------");

        Map<Categoria, Integer> frecuencias = new HashMap<>();

        // Recorrer incidencias y contar frecuencias
        for (Incidencia incidencia : listaIncidencia) {
        Categoria categoria = incidencia.getCategoria();

            int contador = frecuencias.getOrDefault(categoria, 0);
            frecuencias.put(categoria, contador + 1);
        }

        // Encontrar máxima frecuencia
        int maxFrecuencia = 0;
        Categoria maxCategoria = null;

        for (Map.Entry<Categoria, Integer> entry : frecuencias.entrySet()) {

            int frecuencia = entry.getValue();
            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                maxCategoria = entry.getKey();
            }
            }

         System.out.println("Categoría con mayor frecuencia: " + maxCategoria.getTipoIncidente());
        System.out.println("Frecuencia: " + maxFrecuencia);

        System.out.println("------------Area con mayor cantidad de incidencias------------");


        List<Usuario> listaUsuario = new ArrayList<>();
        listaUsuario.add(usu1);
        listaUsuario.add(usu2);
        listaUsuario.add(usu3);
        listaUsuario.add(usu4);
        listaUsuario.add(usu5);
        listaUsuario.add(usu6);
        listaUsuario.add(usu7);
        listaUsuario.add(usu8);
        listaUsuario.add(usu9);
        listaUsuario.add(usu10);

        Map<String, Integer> frecuenciasAreas = new HashMap<>();

        for (Usuario u : listaUsuario) {
             String area = u.getArea();
             frecuenciasAreas.put(area, frecuenciasAreas.getOrDefault(area, 0) + 1);
        }

        String areaMaxima = null;
        int maxFrecuencia2 = 0;
        for (Map.Entry<String, Integer> entry : frecuenciasAreas.entrySet()) {
            int frecuencia2 = entry.getValue();
            if (frecuencia2 > maxFrecuencia2) {
                areaMaxima = entry.getKey();
                maxFrecuencia2 = frecuencia2;
            }
        }

        System.out.println("Area con mayor cantidad de incidencias: " + areaMaxima);
        System.out.println("Frecuencia: " + maxFrecuencia2);
    }

}