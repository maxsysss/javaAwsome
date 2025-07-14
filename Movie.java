//NextJava.java

class NextMain{
    public static void main(String[] args){
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();
        
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();
        
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();
        
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
        
        var plane = new Comedy("Airplane");
        plane.watchComedy();
        
        Object unknownObject = Movie.getMovie("S", "Star Wars");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }else if(unknownObject instanceof Adventure){
            ((Adventure) unknownObject).watchAdventure();
        }else if(unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }
    }
}	

//
class Movie{
    private String title;
    public Movie(String title){
        this.title = title;
    }
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");
    }
}
class Adventure extends Movie{
    public Adventure(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
        "Pleasant Scene",
        "Scary Music",
        "Something Good Happens");
    }
}
class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
        "Something funny happens",
        "Something even funny happens",
        "Happy Ending");
    }
}
class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }
    @Override
    public void watchMovie(){
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
        "Aliens Arrived",
        "Space Invaders is played",
        "People Win The Game");
    }
}
public class Main
{
	public static void main(String[] args) {
        Movie theMovie = new Movie("Star Wors");
        theMovie.watchMovie();
        Movie advMovie = new Adventure("WORMS FALL");
        advMovie.watchMovie();
        Movie cmdMovie = new Comedy("LOT OF LAUGHT");
        cmdMovie.watchMovie();
        Movie scMovie = new ScienceFiction("ALIENS ARRIVED");
        scMovie.watchMovie();
	}
}
