public class Animator extends Employee{
    private String[] skills = {"Ability to draw backdrops","ability to draw faces"};

    public Animator(String name, double salary) {
        this.setName(name);
        this.setSalary(salary);
        this.setJobTitle("Animator");
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public void animatorInfo(){
        System.out.println(this);
        System.out.println("Список умения:");
        for(int i=0;i<skills.length;i++){
            System.out.println((i+1)+") "+skills[i]+" ");
        }
    }
}
