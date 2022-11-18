import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company company) {
    Scanner in = new Scanner(System.in);
    while (true) {
        System.out.println("Меню для работы с компанией: ");
        System.out.println("1) Вывод информацию о компании");
        System.out.println("2) Вывод списока сотрудников компании");
        System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
        System.out.println("4) Добавление сотрудника в компанию");
        System.out.println("5) Удаление сотрудника из компании");
        System.out.println("6) Поменять руководителя компании");
        System.out.println("7) Меню для работы с сотрудниками");
        System.out.println("0) Выход из главного меню");
        int command = in.nextInt();
        if (command == 1) {
            //Реализуйте вывод информации об этой компании (кроме списка сотрудников)
            company.companyInfo(company);
        } else if (command == 2) {
            //Реализуйте вывод списка сотрудников этой компании
            company.listOfEmployees();
        } else if (command == 3) {
            //Реализуйте подсчет всех зароботных плат сотрудников
            company.salaryCounter();
        } else if (command == 4) {
            //Реализуйте добавление компании в холдинг

            System.out.println("Введите имя нового сотрудника: ");
            String name = in.next();
            System.out.println("Введите зарплату нового сотрудника: ");
            double salary = in.nextDouble();
            System.out.println("Введите должность нового сотрудника: ");
            String title = in.next();
            company.addEmployee(new Employee(name,salary,title));

        } else if (command == 5) {
            //Реализуйте удаление компании из холдинга
            System.out.println("Введите имя сотрудника: ");
            String name = in.next();
            company.deleteEmployee(name);
        } else if (command == 6) {
            System.out.println("Введите имя сотудника которого хотите сделать директором: ");
            String emName = in.next();
            Employee employee = company.getEmployeeByName(emName);
            System.out.println(employee);
            System.out.println("Хотители вы назначить данного работника на место директора? \n1: ДА \n2: НЕТ");
            int num = in.nextInt();
            if(num==1){
                company.setDirector(employee.getName());
            }else{
                System.out.println("no");
            }
            //Реализуйте смену руководителя компании
        } else if (command == 7) {
            System.out.println("Введите имя сотрудника: ");
            String employeeName1 = in.nextLine();
            String employeeName = in.nextLine();
            //Реализуйте поиск сотрудника по имени
            //P.S. метод getEmployeeByName() пустой нужно его заполнить
//            System.out.println(company.getEmployeeByName(employeeName));

            Employee foundedEmployee = company.getEmployeeByName(employeeName);
            EmployeeMenu.start(foundedEmployee);

        } else if (command == 0) {
            break;
        } else {
            System.out.println("Ошибка! Введите пункт из меню");
        }
    }
}
}


