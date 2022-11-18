public class ScreenWriter extends Employee{
    private String[] genres = {"Action","Comedy","Fantasy"};

    public ScreenWriter(String name, double salary) {
        this.setName(name);
        this.setSalary(salary);
        this.setJobTitle("Screen Writer.");
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }
    public void writerInfo(){
        System.out.println(this);
        System.out.println("Список жанров кино:");
        for(int i=0;i<genres.length;i++){
            System.out.println((i+1)+") "+genres[i]+" ");
        }
    }
}
