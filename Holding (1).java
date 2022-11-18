public class Holding {
    private Company[] companies;

    public Holding() {
        companies = new Company[10];
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }



    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }
    public boolean addCompany(Company company) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                return true;
            }}
        return false;
    }
    public void companiesInfo() {
        for (int i = 0; i < this.companies.length; i++) {
            if (this.companies[i] != null) {
                System.out.println("Название компании: " + this.companies[i].getName() +
                        "\nРуководитель компании: " + this.companies[i].getDirector()
                        + "\nБюджет компании: " + this.companies[i].getBudget());
                System.out.println("-----------------------------");
            }

        }
    }
    public void sumOfBudgets(){
        int sum=0;
        for(int i=0;i<this.companies.length;i++){
            if(this.companies[i]!=null){
                sum+=this.companies[i].getBudget();
            }
        }
        System.out.println("Бюджет компании: "+sum);
    }
    public void showCompanies () {
        for (Company company: companies) {
            if (company != null) {
                System.out.println(company.getName());
            }
        }
    }
    //Реализуйте поиск компании по наименованию
    public Company getCompanyByName (String name) {
        for(int i=0;i< this.companies.length;i++){
            if(this.companies[i]!=null && this.companies[i].getName().equals(name)){

                return companies[i];
            }
        }return null;
    }
    public void company() {
        for (int i = 0; i < this.companies.length; i++) {
            if (this.companies[i] != null){
              this.companies[i].numberOfWorkPlaces();
            }
        }
    }
    public boolean removeCompany(String name){
            for(int i=0;i<companies.length;i++){
                if(this.companies[i]!=null && this.companies[i].getName().equals(name)){
                    this.companies[i] =null;
                    return true;
                }
            }return false;
    }

    }
