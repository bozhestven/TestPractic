public class Producer extends Employee{
    private String[] listOfProduct = {"Today YouTube","Disney","WarnerBrothers"};

    public Producer(String name, double salary) {
        this.setName(name);
        this.setSalary(salary);
        this.setJobTitle("Producer");
    }

    public String[] getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfProduct(String[] listOfProduct) {
        this.listOfProduct = listOfProduct;
    }


    public void listOfProductInfo(){
        System.out.println("Список проектов:");
        for(int i=0;i<listOfProduct.length;i++){
            if(listOfProduct[i]!=null){
                System.out.println((i+1)+") "+listOfProduct[i]);
            }else{
                return;
            }
        }
    }
    public void producerInfo(){
        System.out.println(this);
        this.listOfProductInfo();
    }

}
