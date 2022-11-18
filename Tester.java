import java.util.Arrays;

public class Tester extends Employee{
    private String[] type = {"Manual","Auto"};
    private String itLanguage;

    public Tester(String name, double salary, String itLanguage) {
        this.setName(name);
        this.setSalary(salary);
        this.itLanguage = itLanguage;
        this.setJobTitle("Tester");
    }
    public void testerInfo(){
        System.out.println(this);
        System.out.println("Тип тестировки: "+ Arrays.toString(type));
        System.out.println("Язык программирования: "+this.itLanguage);
    }
}
