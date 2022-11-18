public class ItCompany extends Company{
    private double outSourceIncome;
    private double outStaffIncome;
    private double techExpenses;
    private double officeExpenses;

    public ItCompany(String name, double budget, String director) {
        super(name, budget, director);
    }

    public ItCompany(String name, double budget, String director, double outSourceIncome, double outStaffIncome, double techExpenses, double officeExpenses) {
        super(name, budget, director);
        this.outSourceIncome = outSourceIncome;
        this.outStaffIncome = outStaffIncome;
        this.techExpenses = techExpenses;
        this.officeExpenses = officeExpenses;
    }

    public double getOutSourceIncome() {
        return outSourceIncome;
    }

    public void setOutSourceIncome(double outSourceIncome) {
        this.outSourceIncome = outSourceIncome;
    }

    public double getOutStaffIncome() {
        return outStaffIncome;
    }

    public void setOutStaffIncome(double outStaffIncome) {
        this.outStaffIncome = outStaffIncome;
    }

    public double getTechExpenses() {
        return techExpenses;
    }

    public void setTechExpenses(double techExpenses) {
        this.techExpenses = techExpenses;
    }

    public double getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(double officeExpenses) {
        this.officeExpenses = officeExpenses;
    }
    public void companyInfo(){
        this.companyInfo(this);
        System.out.println("Доходы с аутсорса: "+this.outSourceIncome+
                "\nДоходы с аустафинга: "+this.outStaffIncome+
                "\nРасходы на технику:"+this.techExpenses+
                "\nОфисные расходы: "+this.officeExpenses);
    }
}
