package com.peliculas.peliculas;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PeliculaController {

    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController()
    {
        peliculas.add((new Pelicula(1, "taxi driver", "1976", "Martin Scorsese", "Crimen", "Para sobrellevar el insomnio crónico que sufre después de su regreso de Vietnam, Travis decide trabajar como taxista nocturno. Como individuo tiene poco contacto con la gente, pero observa la violencia y desolación en la que se hunde la ciudad de Nueva York. Travis anota en su diario todas sus impresiones, hasta que un día decide pasar a la acción")));
        peliculas.add((new Pelicula(2, "Código 8", "2024", "Jeff Chan", "Ciencia Ficcion", "Una chica que lucha por buscar justicia para su hermano asesinado por policías corruptos. Ella solicita la ayuda de un ex convicto y su ex pareja, pero deben enfrentar a un sargento de policía muy respetado y bien protegido.")));
        peliculas.add((new Pelicula(3, "Oppenheimer", "2023", "Christopher Nolan", "Drama", "Película sobre el físico J. Robert Oppenheimer y su papel como desarrollador de la bomba atómica. Basada en el libro 'American Prometheus: The Triumph and Tragedy of J. Robert Oppenheimer' de Kai Bird y Martin J. Sherwin.")));
        peliculas.add((new Pelicula(4, "Dune", "2021", "Denis Villeneuve", "Ciencia Ficcion", "En un lejano futuro, la galaxia conocida es gobernada mediante un sistema feudal de casas nobles bajo el mandato del Emperador. Las alianzas y la política giran entorno a un pequeño planeta, Dune, del que extrae la \"especia melange\", la materia prima que permite los viajes espaciales. La Casa Atreides, bajo el mandato del Duque Leto Atreides recibe el encargo de custodiar el planeta, relevando en la encomienda a sus históricos enemigos, los Harkonnen. Paul Atreides, hijo del duque, se verá atrapado en las intrigas políticas mientras descubre el destino que le deparan los desiertos de Dune.")));
        peliculas.add((new Pelicula(5, "Ghost in the Shell", "1995", "Mamoru Oshii", "Ciencia Ficcion", "En un futuro no muy lejano, un grupo de agentes especiales se disponen a encontrar a un hacker misterioso conocido como \"Puppet Master\". En la búsqueda descubrirán alarmantes secretos acerca de la evolución de la inteligencia artificial. La película fue una gran inspiración para la trilogía de Matrix.")));
        

    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
    
    @GetMapping("/peliculas/{id}")
    public Pelicula getPelicula(@PathVariable int id) {
        for(Pelicula p : peliculas)
        {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    
}
