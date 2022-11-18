public class Developer extends Employee{


    private String[] technologyStack = {"Front end","Java Backend","C# Backend","Python"};


    public Developer(String name, double salary) {
        this.setName(name);
        this.setSalary(salary);
        this.setJobTitle("Developer");
    }

    public String[] getTechnologyStack() {
        return technologyStack;
    }

    public void setTechnologyStack(String[] technologyStack) {
        this.technologyStack = technologyStack;
    }
    public void developerInfo(){
        System.out.println(this);
        System.out.println("Список технологий разработчика:");
        for(int i=0;i<technologyStack.length;i++){
            System.out.println((i+1)+") "+technologyStack[i]+" ");
        }
    }
}
