import company.Company;
import company.Company1;
import company.Dept1;
import company.Dept2;

public class TestDemo {
    public static void main(String[] args) {
        Company company1 = new Company1("总公司");
        // 添加部门
        company1.addCompany(new Dept1("行政部"));
        company1.addCompany(new Dept2("财务部"));

        // 添加子公司
        Company company2 = new Company1("子公司1");
        company2.addCompany(new Dept1("子公司1的行政部"));
        company2.addCompany(new Dept2("子公司1的财务部"));

        Company company3 = new Company1("子公司2");
        company3.addCompany(new Dept1("子公司2的行政部"));
        company3.addCompany(new Dept2("子公司2的财务部"));

        company1.addCompany(company2);
        company1.addCompany(company3);

        Company company4 = new Company1("子公司2");
        company4.addCompany(new Dept1("子公司2的行政部"));
        company4.addCompany(new Dept2("子公司2的财务部"));

        company2.addCompany(company4);

        company1.displayCompany();
    }
}
