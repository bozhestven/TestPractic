public class Main {
    public static void main(String[] args){

        AnimationStudio animationStudio = new AnimationStudio("PIXAR",200500,"Jack Walter",12800,1578,1890,29000,52900);
        animationStudio.companyInfo();
        System.out.println("###################################");


        Producer producer = new Producer("William Tores",25000);
        producer.listOfProductInfo();
        System.out.println("###################################");

        producer.producerInfo();
        System.out.println("###################################");

        ScreenWriter screenWriter = new ScreenWriter("Lucas Davis",32900);
        screenWriter.writerInfo();
        System.out.println("###################################");

        Animator animator = new Animator("Jack Anderson",12800);
        animator.animatorInfo();
        System.out.println("###################################");

        animationStudio.addEmployee(producer);
        animationStudio.addEmployee(screenWriter);
        animationStudio.addEmployee(animator);

        animationStudio.listOfEmployees();
        System.out.println("###################################");
        animationStudio.numberOfWorkPlaces();
    }
}
