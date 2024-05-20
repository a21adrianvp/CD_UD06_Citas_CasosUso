package src.main;

import java.util.ArrayList;
import java.util.List;

// Clase para manejar las citas médicas
public class CitasMedicas {
    private List<String> calendario; // Calendario de citas

    public CitasMedicas() {
        calendario = new ArrayList<>();
    }

    // TODO: Método para agendar una cita
    public void agendarCita(String fechaHora) {
        calendario.add(fechaHora);
        System.out.println("Cita ageendada correctamente.");
    }

    // TODO: Método para cancelar una cita
    public void cancelarCita(String fechaHora) {
        if (calendario.contains(fechaHora)) {
            calendario.remove(fechaHora);
            System.out.println("Cita cancelada correctamente");
        } else {
            System.out.println("Non existe cita nesa fecha/hora indicada.");
        }
    }

    // TODO: Método para reprogramar una cita
    public void reprogramarCita(String fechaHoraAntigua, String fechaHoraNueva) {
        if (calendario.contains(fechaHoraAntigua)) {
            fechaHoraAntigua = fechaHoraNueva;
            System.out.println("Cita reprogamada correctamente");
        } else{
            System.out.println("Error ao reprogamar a cita.");
        }
    }

    // TODO: Método para ver el calendario de citas
    public void verCalendario() {
        for (String cita : calendario) {
            System.out.println(cita.toString());
        }
    }
}
