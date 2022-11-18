public class AnimationStudio extends Company{

    private double youTubeIncome;

    private double officeExpenses;
    private double techExpenses;
    private double salaryExpenses;
    private double youTubeMedia;

    public AnimationStudio(String name, double budget, String director) {
        super(name, budget, director);
    }

    public AnimationStudio(String name, double budget, String director, double youTubeIncome, double officeExpenses, double techExpenses, double salaryExpenses, double youTubeMedia) {
        super(name, budget, director);
        this.youTubeIncome = youTubeIncome;
        this.officeExpenses = officeExpenses;
        this.techExpenses = techExpenses;
        this.salaryExpenses = salaryExpenses;
        this.youTubeMedia = youTubeMedia;
    }

    public double getYouTubeIncome() {
        return youTubeIncome;
    }

    public void setYouTubeIncome(double youTubeIncome) {
        this.youTubeIncome = youTubeIncome;
    }

    public double getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(double officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public double getTechExpenses() {
        return techExpenses;
    }

    public void setTechExpenses(double techExpenses) {
        this.techExpenses = techExpenses;
    }

    public double getSalaryExpenses() {
        return salaryExpenses;
    }

    public void setSalaryExpenses(double salaryExpenses) {
        this.salaryExpenses = salaryExpenses;
    }

    public double getYouTubeMedia() {
        return youTubeMedia;
    }

    public void setYouTubeMedia(double youTubeMedia) {
        this.youTubeMedia = youTubeMedia;
    }
    public void companyInfo(){
        this.companyInfo(this);
        System.out.println("Доходы с YouTube: "+this.youTubeIncome+
                "\nОфисные расходы: "+this.officeExpenses+
                "\nРасходы на технику:"+this.techExpenses+
                "\nРасходы на зарплату: " + this.officeExpenses +
                "\nРасходы на рекламу: "+ this.youTubeMedia);
    }
}

