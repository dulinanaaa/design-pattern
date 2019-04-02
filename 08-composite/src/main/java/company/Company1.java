package company;

import java.util.ArrayList;
import java.util.List;

public class Company1 extends Company {

    private List<Company> companyList;

    public Company1(String name) {
        super(name);
        companyList = new ArrayList<Company>();
    }

    public void addCompany(Company company) {
        System.out.println("Company1旗下新增了" + company.getName());
        companyList.add(company);
    }

    public void removeCompany(Company company) {
        System.out.println("Company1旗下撤销了" + company.getName());
        companyList.remove(company);
    }

    public void displayCompany() {
        System.out.print("Company1旗下有" + companyList.size() + "家子公司");

        if (companyList != null && !companyList.isEmpty()) {
            System.out.println("，分别是：");

            for (Company company : companyList) {
                System.out.println(company.getName());
            }
        }
    }
}
